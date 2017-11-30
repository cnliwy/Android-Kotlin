package com.liwy.kotlin

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.os.Environment
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.makeText
import com.liwy.kotlin.bean.Data
import java.io.File

class FileActivity : AppCompatActivity() {
    var etView : EditText?=null
    var addBtn : Button? = null
    var deleteBtn : Button? = null
    var findBtn : Button? = null
    var fileName : String? = Environment.getExternalStorageDirectory().absolutePath + "/kotlin.txt"
    var context : Context ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_file)
        context = this
        etView = findViewById(R.id.et_content) as EditText
        addBtn = findViewById(R.id.btn_add) as Button
        deleteBtn = findViewById(R.id.btn_delete) as Button
        findBtn = findViewById(R.id.btn_find) as Button
    }

    fun add(view : View){
        println("添加文件")
        var file : File = File(fileName)
        if (!file.exists())file.createNewFile()
        var content = etView!!.text.toString()
        content += "\n"
        file.appendText(content,Charsets.UTF_8)
        toast("添加成功")
    }

    fun delete(view : View){
        var file : File = File(fileName)
        if (file.exists())file.delete()
        toast("删除成功")
    }

    fun find(view : View){
        var file : File = File(fileName)
        if (!file.exists()){
            toast("文件不存在")
            return
        }
        var content:String = file.readText(Charsets.UTF_8)
        println("当前内容：")
        println(content)
    }
    fun Activity.toast(text:String) = {
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
    }
}
