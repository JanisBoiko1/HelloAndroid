package com.example.helloandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloandroid.R.id
import com.example.helloandroid.R.id.*
import com.google.android.ads.mediationtestsuite.activities.HomeActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(btLogin).SetOnClickListener{
            startActivity(Intent(this.HomeActivity::class.java))
        }
        findViewById<Button>(btCadastrar).SetOnClickListener{
            startActivity(Intent(this.CadastrarActivity::class.java))
        }
        findViewById<Button>(btEsqueciSenha).SetOnClickListener{
            startActivity(Intent(this.EsqueciMinhaSenhaActivity::class.java))
        }
    }
}