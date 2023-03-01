package com.example.bmiviewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    var heightInput: String by  mutableStateOf("")
    var weightInput: String by  mutableStateOf("")


    val bmi :Float
        get() {
            return calculate()
        }


    private val height:Float
        get() {
            return heightInput.toFloatOrNull() ?: 0.0f
        }
    private val weight:Int
        get() {
            return weightInput.toIntOrNull() ?: 0
        }
    fun changeHeightInput(value:String){
        heightInput=value
    }
    fun changeWeightInput(value: String){
        weightInput=value
    }

    private fun calculate():Float {
        return if ( weight >0 && height >0 ) weight /(height * height) else 0.0f
    }

}