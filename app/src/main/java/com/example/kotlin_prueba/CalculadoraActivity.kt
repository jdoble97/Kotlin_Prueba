package com.example.kotlin_prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import org.w3c.dom.Text

class CalculadoraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)
    }

    fun hacerOperacion(view: View) {
        val operaciones: RadioGroup = findViewById(R.id.operaciones)
        val operador: RadioButton = findViewById(operaciones.checkedRadioButtonId)
        val operacion: String = operador.text.toString()
        val mostrar: TextView = findViewById(R.id.resultado)
        val op1: EditText = findViewById(R.id.op1)
        val op2: EditText = findViewById(R.id.op2)
        val contenido: IntArray = intArrayOf(op1.text.toString().toInt(), op2.text.toString().
                                                toInt())
        var resultado:Int = 0
        if(operacion=="suma"){
            resultado = contenido[1]+contenido[0]
            mostrar.text=resultado.toString()
        }else if(operacion=="resta"){
            resultado = contenido[0]-contenido[1]
            mostrar.text=resultado.toString()
        }else if(operacion=="multiplicacion"){
            resultado = contenido[0]*contenido[1]
            mostrar.text=resultado.toString()
        }else if(operacion=="division"){
            var decimales: Float = contenido[0].toFloat()/contenido[1]
            mostrar.text=decimales.toString()
        }
        else{

            mostrar.text="Esto es una prueba"
        }

    }
}
