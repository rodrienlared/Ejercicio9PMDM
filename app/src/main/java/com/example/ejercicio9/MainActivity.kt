package com.example.ejercicio9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio9.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, MainActivity2::class.java)
        var claseFinal = ""

        binding.imagen.setBackgroundResource(R.drawable.inicio)

        binding.magoBtn.setOnClickListener {
            binding.imagen.setBackgroundResource(R.drawable.mago)
            if(!binding.aceptarBtn.isEnabled)
                binding.aceptarBtn.isEnabled = true
            claseFinal = "mago"
        }

        binding.ladronBtn.setOnClickListener {
            binding.imagen.setBackgroundResource(R.drawable.ladron)
            if(!binding.aceptarBtn.isEnabled)
                binding.aceptarBtn.isEnabled = true
            claseFinal = "ladron"
        }

        binding.guerreroBtn.setOnClickListener {
            binding.imagen.setBackgroundResource(R.drawable.guerrero)
            if(!binding.aceptarBtn.isEnabled)
                binding.aceptarBtn.isEnabled = true
            claseFinal = "guerrero"
        }

        binding.berserkerBtn.setOnClickListener {
            binding.imagen.setBackgroundResource(R.drawable.berserker)
            if(!binding.aceptarBtn.isEnabled)
                binding.aceptarBtn.isEnabled = true
            claseFinal = "berserker"
        }

        binding.mercaderBtn.setOnClickListener {
            binding.imagen.setBackgroundResource(R.drawable.mercader)
            if(!binding.aceptarBtn.isEnabled)
                binding.aceptarBtn.isEnabled = true
            claseFinal = "mercader"
        }

        binding.aceptarBtn.setOnClickListener {
            intent.putExtra("claseFinal", claseFinal)
            startActivity(intent)
        }
    }
}