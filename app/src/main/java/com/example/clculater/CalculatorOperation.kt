package com.example.clculater

sealed class CalculatorOperation(val symbol: String) {
    data object Add: CalculatorOperation("+")
    data object Subtract: CalculatorOperation("-")
    data object Multiply: CalculatorOperation("*")
    data object Divide: CalculatorOperation("/")
}