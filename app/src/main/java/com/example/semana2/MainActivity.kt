package com.example.semana2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    /*private var Notificaciones = findViewById<Button>(R.id.Notificaciones)
    private var button2 = findViewById<Button>(R.id.button2)*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val notificaciones = findViewById<Button>(R.id.Notificaciones)
        val textView2 = findViewById<TextView>(R.id.textView2)

        notificaciones.setOnClickListener {
            val toast = Toast.makeText(this, "Hola desde un Toast",Toast.LENGTH_SHORT)
            toast.show()
            textView2.setText("Me cambiaron desde un boton")
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }

        val pase_de_vista = Intent(this, Activity2::class.java)
        startActivity(pase_de_vista)
    }
}