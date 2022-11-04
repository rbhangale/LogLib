package com.example.loglib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LogFile.ptintInfo("info log")
        LogFile.ptintError("Error log")
        LogFile.ptintWarning(this,"Warning log")
    }
}