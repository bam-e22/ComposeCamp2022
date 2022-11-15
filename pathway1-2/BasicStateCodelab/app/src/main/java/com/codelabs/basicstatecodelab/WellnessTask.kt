package com.codelabs.basicstatecodelab

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class WellnessTask(
    val id: Int,
    initialLabel: String,
    initialChecked: Boolean = false
) {
    var label by mutableStateOf(initialLabel)
    var checked by mutableStateOf(initialChecked)
}