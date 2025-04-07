package com.example.gigagym

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivityEntrar : AppCompatActivity() {

    lateinit var btnEsqueciSenha: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_entrar)

        btnEsqueciSenha = findViewById(R.id.buttonEsqueci2)
        Log.d("bruma", "onCreate Inicializado");
    }

    override fun onStart() {
        super.onStart()

        btnEsqueciSenha.setOnClickListener{
            var intetion = Intent(this,MainActivityEsqueci::class.java) // cadastro Personal
            startActivity(intetion)
        }
        Log.d("bruma", "onStart Inicializado");
    }

    override fun onResume() {
        super.onResume()
        Log.d("bruma", "onResume Inicializado");
    }

    override fun onPause() {
        super.onPause()
        Log.d("bruma", "onPause Inicializado");
    }

    override fun onStop() {
        super.onStop()
        Log.d("bruma", "onStop Inicializado");
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("bruma", "onRestart Inicializado");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("bruma", "onDestroy Inicializado");
    }
}