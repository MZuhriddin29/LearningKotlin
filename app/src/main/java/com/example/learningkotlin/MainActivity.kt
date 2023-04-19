package com.example.learningkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }
    fun initView(){
        val buttonz = findViewById<Button>(R.id.b_detail)
        buttonz.setOnClickListener{openDetailActivity() }
    }

    fun openDetailActivity(){
        val intentz =Intent(this,DetailActivity::class.java)
        startActivity(intentz)
    }


}