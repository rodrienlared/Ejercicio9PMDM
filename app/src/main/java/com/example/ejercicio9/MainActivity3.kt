package com.example.ejercicio9

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ejercicio9.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras

        val claseFinal = bundle!!.getString("claseFinal")
        val razaFinal = bundle.getString("razaFinal")

        binding.imagenClase.setBackgroundResource(R.drawable.inicio)
        binding.imagenRaza.setBackgroundResource(R.drawable.inicio)

        when(claseFinal){
            "mago" -> binding.imagenClase.setBackgroundResource(R.drawable.mago)
            "ladron" -> binding.imagenClase.setBackgroundResource(R.drawable.ladron)
            "guerrero" -> binding.imagenClase.setBackgroundResource(R.drawable.guerrero)
            "berserker" -> binding.imagenClase.setBackgroundResource(R.drawable.berserker)
            "mercader" -> binding.imagenClase.setBackgroundResource(R.drawable.mercader)
        }

        when(razaFinal){
            "elfo" -> binding.imagenRaza.setBackgroundResource(R.drawable.elfo)
            "humano" -> binding.imagenRaza.setBackgroundResource(R.drawable.humano)
            "enano" -> binding.imagenRaza.setBackgroundResource(R.drawable.enano)
            "goblin" -> binding.imagenRaza.setBackgroundResource(R.drawable.goblin)
        }

        binding.again.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.begin.setOnClickListener {
            startActivity(Intent(this, MainActivity4::class.java))
        }
    }
}