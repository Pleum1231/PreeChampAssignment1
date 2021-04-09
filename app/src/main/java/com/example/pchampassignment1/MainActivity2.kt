package com.example.pchampassignment1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main2.*
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        buttonBackPage.setOnClickListener {
            val intent = Intent()
            val randomNumber = Random.nextInt(1, 10)
            intent.putExtra("number", randomNumber)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}