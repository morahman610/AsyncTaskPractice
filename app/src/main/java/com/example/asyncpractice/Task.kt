package com.example.asyncpractice

import android.content.Context
import android.os.AsyncTask
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import java.time.Duration

class Task(val progressBar: ProgressBar, val context: Context) : AsyncTask<Int, Int, String>() {

    override fun onPreExecute() {
        super.onPreExecute()
        progressBar.visibility = View.VISIBLE


    }
    override fun doInBackground(vararg params: Int?): String? {
        for (x in 9..10) {
            progressBar.setProgress(x / 100)
            Thread.sleep(1000)
        }

        return "Task Complete!"
    }

    override fun onProgressUpdate(vararg values: Int?) {
        super.onProgressUpdate(*values)

//        val progress = values[0]
  //      if (progress != null)
    //    progressBar.setProgress(progress)
        Toast.makeText(context, "in Progress", Toast.LENGTH_SHORT).show()
    }

    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)
        progressBar.visibility = View.INVISIBLE
        Toast.makeText(context, result, Toast.LENGTH_LONG).show()
    }
}