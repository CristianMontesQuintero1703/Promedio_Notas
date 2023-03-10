package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val Mensaje=findViewById<TextView>(R.id.textMensaje)

        var miBundle: Bundle? = this.intent.extras

        if (miBundle != null){
            Mensaje.text="${miBundle.getString("Promedio")} "
        }

        val botonAtras: Button =findViewById(R.id.btnSalir)
        botonAtras.setOnClickListener { onClick() }

    }

    private fun onClick() {
        finish()
    }
}