package com.example.lucianozapata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Imagen1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imagen1)

        val btn1: ImageButton  = findViewById(R.id.imageButton)
        val btn2: ImageButton  = findViewById(R.id.imageButton2)
        val btn3: ImageButton  = findViewById(R.id.imageButton3)
        val btn4: ImageButton  = findViewById(R.id.imageButton4)
        val btn5: ImageButton  = findViewById(R.id.imageButton5)
        val btn6: ImageButton  = findViewById(R.id.imageButton6)
        val btn7: ImageButton  = findViewById(R.id.buttonSalir)

        btn1.setOnClickListener {
            val intent = Intent(this, Imagen1::class.java)
            startActivity(intent)
            finish()
        }

        btn2.setOnClickListener {
            val intent = Intent(this, Imagen2::class.java)
            startActivity(intent)
            finish()
        }

        btn3.setOnClickListener {
            val intent = Intent(this, Imagen3::class.java)
            startActivity(intent)
            finish()
        }

        btn4.setOnClickListener {
            val intent = Intent(this, Imagen4::class.java)
            startActivity(intent)
            finish()
        }

        btn5.setOnClickListener {
            val intent = Intent(this, Imagen4::class.java)
            startActivity(intent)
            finish()
        }
        btn6.setOnClickListener {
            val intent = Intent(this, Imagen4::class.java)
            startActivity(intent)
            finish()
        }

        btn7.setOnClickListener {
            val intent = Intent(this, Imagen4::class.java)
            startActivity(intent)
            finish()
        }
    }
}

