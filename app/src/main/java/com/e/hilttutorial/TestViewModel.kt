package com.e.hilttutorial

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Named

class TestViewModel @ViewModelInject constructor(
    @Named("string2") testString2: String
): ViewModel() {
    init {
        Log.d("ViewModel", "Test String from ViewModel: $testString2")
    }
}