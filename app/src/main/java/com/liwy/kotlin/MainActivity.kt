package com.liwy.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var contentTv : TextView ?= null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val strContent : CharSequence = "欢迎学习kotlin"
        contentTv = findViewById(R.id.contentTv) as TextView
        contentTv!!.setText(strContent)
    }
}
