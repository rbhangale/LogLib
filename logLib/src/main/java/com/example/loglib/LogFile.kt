package com.example.loglib

import android.content.Context
import android.widget.Toast
import android.util.Log

class LogFile {

    companion object{
        val TAG = "LogFile"
        fun ptintInfo(message: String){
            Log.i(TAG, message)
        }
        fun ptintError(message: String){
            Log.e(TAG, message)
        }
        fun ptintWarning(context: Context, message: String){
            Log.w(TAG, message)
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}