package com.example.mvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _text = MutableLiveData("Сәлем, әлем!")
    val text: LiveData<String> = _text

    fun changeText() {
        _text.value = if (_text.value == "Сәлем, әлем!") "Қош келдің!" else "Сәлем, әлем!"
    }
}
