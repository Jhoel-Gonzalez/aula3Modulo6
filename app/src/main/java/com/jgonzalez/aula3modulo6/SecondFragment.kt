package com.jgonzalez.aula3modulo6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation

class SecondFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false).also { it ->

            it.findViewById<TextView>(R.id.tv2).setOnClickListener {
                Navigation.findNavController(it)
                    .navigate(R.id.action_secondFragment_to_homeFragment)
            }
        }
    }

}