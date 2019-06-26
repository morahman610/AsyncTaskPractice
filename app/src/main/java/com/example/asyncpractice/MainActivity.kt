package com.example.asyncpractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startTask(view : View) {
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        val task = Task(progressBar, this)
        task.execute()
    }
}
