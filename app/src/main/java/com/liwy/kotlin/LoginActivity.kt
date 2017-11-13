package com.liwy.kotlin

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {

    private var usernameEt: EditText? = null
    private var pwdEt: EditText? = null
    var loginBtn: Button? = null
    private var preferences: SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        preferences = getSharedPreferences("user", Context.MODE_PRIVATE)
        usernameEt = findViewById(R.id.usernameEt) as EditText
        pwdEt = findViewById(R.id.pwdEt) as EditText
        val username = preferences!!.getString("username", "")
        val pwd = preferences!!.getString("pwd", "")
        if ("" != username) {
            usernameEt!!.setText(username)
            pwdEt!!.setText(pwd)
        }
        loginBtn = findViewById(R.id.loginBtn) as Button
        loginBtn?.setOnClickListener { login(usernameEt!!.text.toString(), pwdEt!!.text.toString()) }
        usernameEt?.text.toString()?:"hello"

    }

    fun login(username: String, pwd: String) {
        println("username:$username,pwd:$pwd")
        val editor = preferences!!.edit()
        editor.putString("username", username)
        editor.putString("pwd", pwd)
        editor.commit()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
