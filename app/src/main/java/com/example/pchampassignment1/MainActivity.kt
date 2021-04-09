package com.example.pchampassignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonNextPage.setOnClickListener {
            val loadingDialog = LoadingDialog(this@MainActivity)
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            val handler = Handler()
            loadingDialog.startLoadingDialog()
            handler.postDelayed({
                startActivityForResult(intent,1)
                loadingDialog.dismissDialog()
            },2000)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val numberFromMainActivity2 :String = data?.getIntExtra("number",0).toString()
        textViewNumber.text="$numberFromMainActivity2"
    }
}