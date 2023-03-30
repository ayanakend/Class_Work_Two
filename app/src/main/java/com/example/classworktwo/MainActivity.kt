package com.example.classworktwo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.classworktwo.databinding.ActivityMainBinding
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val list = mutableListOf<Double>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListener()
    }

    private fun initListener() {
        binding.btnAdd.setOnClickListener {
            if (binding.editText.text.isNotEmpty()) {
                if (binding.editText.text.isNotEmpty()){
                list.add(sqrt(binding.editText.text.toString().toDouble()))
                binding.editText.text.clear()
            }
        }
        binding.btnOutput.setOnClickListener {
            binding.textView.text = list.toString()
        }
    }
}}