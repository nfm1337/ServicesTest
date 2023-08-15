package ru.nfm.servicestest

import android.os.Bundle
import androidx.activity.ComponentActivity
import ru.nfm.servicestest.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}