package com.example.ejercicio9

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ejercicio9.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val bundle = intent.extras

        val intent = Intent(this, MainActivity3::class.java)
        val claseFinal = bundle!!.getString("claseFinal")
        var razaFinal = ""

        binding.imagen.setBackgroundResource(R.drawable.inicio)

        binding.elfoBtn.setOnClickListener {
            binding.imagen.setBackgroundResource(R.drawable.elfo)
            if(!binding.aceptarBtn.isEnabled)
                binding.aceptarBtn.isEnabled = true
            razaFinal = "elfo"
        }

        binding.humanoBtn.setOnClickListener {
            binding.imagen.setBackgroundResource(R.drawable.humano)
            if(!binding.aceptarBtn.isEnabled)
                binding.aceptarBtn.isEnabled = true
            razaFinal = "humano"
        }

        binding.enanoBtn.setOnClickListener {
            binding.imagen.setBackgroundResource(R.drawable.enano)
            if(!binding.aceptarBtn.isEnabled)
                binding.aceptarBtn.isEnabled = true
            razaFinal = "enano"
        }

        binding.goblinBtn.setOnClickListener {
            binding.imagen.setBackgroundResource(R.drawable.goblin)
            if(!binding.aceptarBtn.isEnabled)
                binding.aceptarBtn.isEnabled = true
            razaFinal = "goblin"
        }

        binding.aceptarBtn.setOnClickListener {
            intent.putExtra("razaFinal", razaFinal)
            intent.putExtra("claseFinal", claseFinal)
            startActivity(intent)
        }
    }
}