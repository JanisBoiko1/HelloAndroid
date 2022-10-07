package com.example.helloandroid

import android.content.Intent
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat.startActivity
import com.example.helloandroid.R.id
import com.example.helloandroid.R.id.*
import com.google.android.ads.mediationtestsuite.activities.HomeActivity

//public interface OnClickListener{
//    void onClick(View view);
//}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //delega o tratamento para o metodo correto
        findViewById<Button>(R.id.btLogin).setOnClickListener{
            onClickLogin()
        }
        findViewById<Button>(R.id.btCadastrar).setOnClickListener {
            onClickCadastrar()
        }
        findViewById<Button>(R.id.btEsqueciSenha).setOnClickListener {
           onClickEsqueciSenha()
        }
        }

    //um metodo para cada evento
    private fun onClickLogin() {
        startActivity(Intent(this,HomeActivity::class.java))
    }

    private fun onClickCadastrar() {
        startActivity(Intent(this,CadastrarActivity::class.java))
    }

    private fun onClickEsqueciSenha() {
        startActivity(Intent(this,EsqueciMinhaSenhaActivity::class.java))
    }
}
