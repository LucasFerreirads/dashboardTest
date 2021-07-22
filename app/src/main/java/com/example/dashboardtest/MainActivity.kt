package com.example.dashboardtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.cardview.widget.CardView


class MainActivity : AppCompatActivity() {

    lateinit var btn1:CardView
    lateinit var btn2:CardView
    lateinit var btn3:CardView
    lateinit var btn4:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1=findViewById(R.id.atividades)
        btn2=findViewById(R.id.feitos)
        btn3=findViewById(R.id.provas)
        btn4=findViewById(R.id.trabalhos)

        btn1.setOnClickListener {
            Toast.makeText(this,"Botão 1 clicado",Toast.LENGTH_SHORT).show()
        }
        btn2.setOnClickListener {
            Toast.makeText(this,"Botão 2 clicado",Toast.LENGTH_SHORT).show()
        }
        btn3.setOnClickListener {
            Toast.makeText(this,"Botão 3 clicado",Toast.LENGTH_SHORT).show()
        }
        btn4.setOnClickListener {
            Toast.makeText(this,"Botão 4 clicado",Toast.LENGTH_SHORT).show()
        }
    }
}