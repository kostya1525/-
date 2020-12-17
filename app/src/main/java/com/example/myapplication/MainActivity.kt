package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun main(args: Array<String>) {
        if (args.size < 2) {
            print("Ожидается два целых числа")
            return
        }
        val x = parseInt(args[0])
        val y = parseInt(args[1])
        if (x != null && y != null) {
            print(x * y)
        }
    }
}