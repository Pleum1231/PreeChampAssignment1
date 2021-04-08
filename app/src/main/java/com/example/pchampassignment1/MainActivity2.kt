package com.example.pchampassignment1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    }

    fun onClickBack(view: View) {
        var sendData :Intent =Intent()
        var randNum = Random.nextInt(1, 10)
        sendData.putExtra("number", randNum)
        setResult(Activity.RESULT_OK,sendData)
        finish()
    }
}