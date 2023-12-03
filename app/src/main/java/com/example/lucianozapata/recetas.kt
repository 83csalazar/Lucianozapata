package com.example.lucianozapata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class recetas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recetas)

        val btn1: ImageButton = findViewById(R.id.buttonSalir)
        val btn2: ImageButton = findViewById(R.id.imageButton7)
        val btn3: ImageButton = findViewById(R.id.imageButton8)
        val btn4: ImageButton = findViewById(R.id.imageButton9)
        val btn5: ImageButton = findViewById(R.id.imageButton10)


        btn1.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish()
        }

        btn2.setOnClickListener {
            val intent = Intent(this, Factturas::class.java)
            startActivity(intent)
            finish()
        }

        btn3.setOnClickListener {
            val intent = Intent(this, Ingredientes::class.java)
            startActivity(intent)
            finish()
        }

        btn4.setOnClickListener {
            val intent = Intent(this, recetas::class.java)
            startActivity(intent)
            finish()
        }
        btn5.setOnClickListener {
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
            finish()
        }
    }
}