package com.liwy.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.AdapterView
import android.widget.ListView
import android.widget.TextView
import com.liwy.kotlin.adapter.MenuAdapter
import com.liwy.kotlin.bean.Menu

class MainActivity : AppCompatActivity() {
    var contentTv : TextView ?= null;
    var listView : ListView ?= null;
    var dataList : MutableList<Menu> = mutableListOf();
    var adapter : MenuAdapter ?= null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val strContent : CharSequence = "welcome to study kotlin"
        contentTv = findViewById(R.id.contentTv) as TextView
        contentTv!!.setText(strContent)
        listView = findViewById(R.id.listview) as ListView
        initListView()
    }

    /**
     * 初始化listview
     */
    fun initListView(){
        dataList.add(Menu("Test"))
        dataList.add(Menu("People4 Print"))
        adapter = MenuAdapter(this,dataList)
        listView?.adapter = adapter
        listView!!.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            when(position){
                0 -> println("点击了Test方法")
                1 -> {
                    var tests = TestManager()
                    tests.printPeople4()
                }
                else ->{
                    println("点击了listview")
                }
            }

        }
    }
}
