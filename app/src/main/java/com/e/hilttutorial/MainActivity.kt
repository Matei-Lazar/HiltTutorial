package com.e.hilttutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject @Named("string1") lateinit var testString: String
    @Inject @Named("string2") lateinit var testString2: String
    @Inject @Named("string3") lateinit var testString3: String

    private val viewModel: TestViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "Test String from MainActivity: $testString")
        Log.d("MainActivity", "Test String from MainActivity: $testString2")
        Log.d("MainActivity", "Test String from MainActivity: $testString3")
        viewModel
    }
}