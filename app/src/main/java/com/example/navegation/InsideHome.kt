package com.example.navegation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navegation.databinding.FragmentInsideHomeBinding


class InsideHome : Fragment() {
    private lateinit var binding: FragmentInsideHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val datos = arguments?.getStringArray("Datos")
        binding = FragmentInsideHomeBinding.inflate(inflater, container, false)
        if (datos != null){
            binding.textNameValue.text = datos.get(0)
            binding.textFirstLastNameValue.text = datos.get(1)
            binding.textSecondLastNameValue.text = datos.get(2)
            binding.textUserValue.text = datos.get(3)
            binding.textEmailValue.text = datos.get(4)
        }
        return binding.root
    }

}