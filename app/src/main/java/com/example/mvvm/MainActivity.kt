package com.example.mvvm

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.mvvm.databinding.ActivityMainBinding
import com.example.mvvm.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.text.observe(this, Observer { newText ->
            binding.textView.text = newText
        })

        binding.changeTextButton.setOnClickListener {
            viewModel.changeText()
        }
    }
}
