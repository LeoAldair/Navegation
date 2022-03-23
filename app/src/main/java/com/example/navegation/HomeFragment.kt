package com.example.navegation

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.navegation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding = FragmentHomeBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        val navController = findNavController()
        binding.buttonHomeToInside.setOnClickListener {
            val array = arrayOf(binding.editTextName.text.toString(),binding.editTextFirstLastName.text.toString(),binding.editTextSecondLastName.text.toString(),binding.editTextUser.text.toString(),binding.editTextEmail.text.toString())
            val direcction = HomeFragmentDirections.actionHomeFragmentToInsideHome(array)
            findNavController().navigate(direcction)
        }
        return binding.root
    }

}