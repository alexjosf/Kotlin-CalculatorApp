package com.example.calculatorapp.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(
    modifier: Modifier = Modifier,
    symbol: String,
    onClick: ()-> Unit
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ){
        Text(
            modifier = modifier,
            text = symbol,
            fontSize = 36.sp
        )
    }
}