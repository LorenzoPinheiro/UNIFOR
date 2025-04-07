package com.example.gigagym

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivityB : AppCompatActivity(){


    lateinit var btnEntrar: Button
    lateinit var btnCadastro: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainb)

        btnEntrar = findViewById(R.id.buttonEntrar3)
        btnCadastro = findViewById(R.id.buttonCadastro3)
        Log.d("bruma", "onCreate Inicializado");
    }

    override fun onStart() {
        super.onStart()

        btnEntrar.setOnClickListener{
            var intetion = Intent(this,MainActivityEntrar2::class.java) // entrar Aluno
            startActivity(intetion)
        }
        btnCadastro.setOnClickListener{
            var intetion = Intent(this,MainActivityCadastro2::class.java) // cadastro Aluno
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