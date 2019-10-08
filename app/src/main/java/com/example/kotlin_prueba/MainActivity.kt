package com.example.kotlin_prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mostrarCalculadora(view: View) {

        val calculadoraView = Intent(this,CalculadoraActivity::class.java)
        startActivity(calculadoraView)
    }
}
