package com.example.calculatorapp.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {

    var state by mutableStateOf(CalculatorState())
        private set

    fun onAction(action: CalculatorAction) {
        when (action) {
            is CalculatorAction.Calculate -> performCalculation()
            CalculatorAction.Decimal -> enterDecimal()
            CalculatorAction.Delete -> performDeletion()
            is CalculatorAction.Number -> enterNumber(action.number)
            is CalculatorAction.Operation -> enterOperation(action.operation)
            CalculatorAction.Clear -> state = CalculatorState()
        }
    }

    private fun enterNumber(number: Int) {

    }

    private fun enterDecimal() {

    }

    private fun performCalculation() {

    }

    private fun performDeletion() {
        when {
            state.number2.isNotBlank() -> state = state.copy(
                number2 = state.number2.dropLast(1)
            )

            state.operation != null -> state.copy(
                operation = null
            )
            state.number1.isNotBlank() -> state = state.copy(
                number1 = state.number1.dropLast(1)
            )
        }
    }

    private fun enterOperation(operation: CalculatorOperation) {
        if (state.number1.isNotBlank()) {
            state = state.copy(operation = operation)
        } else {

        }
    }
}

