package com.jgonzalez.aula3modulo6

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)

        setupButton(btn1, btn2)
    }

    private fun setupButton(button1: Button, button2: Button) {

        button1.setOnClickListener {
            try {
                Navigation.findNavController(this, R.id.nav_host_fragment)
                    .navigate(R.id.action_secondFragment_to_homeFragment)
            } catch (e: Exception) {
                Log.e("Erro de Navegação", e.message.toString())
            }
        }

        button2.setOnClickListener {
            try {
                Navigation.findNavController(this, R.id.nav_host_fragment)
                    .navigate(R.id.action_homeFragment_to_secondFragment)

            } catch (e: Exception) {
                Log.e("Erro de Navegação", e.message.toString())
            }
        }
    }


}

