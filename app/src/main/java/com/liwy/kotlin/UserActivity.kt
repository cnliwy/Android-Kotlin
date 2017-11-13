package com.liwy.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListAdapter
import android.widget.ListView
import com.liwy.kotlin.adapter.UserListAdapter
import com.liwy.kotlin.bean.Data
import com.liwy.kotlin.bean.User

class UserActivity : AppCompatActivity() {

    var listView:ListView? = null
    var adapter:UserListAdapter?=null
    var mData:MutableList<User>?= mutableListOf<User>()
    var list:ArrayList<User>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        initView()
    }
    fun initView(){
        listView = findViewById(R.id.listview) as ListView
        initUsers()
        adapter = UserListAdapter(this,list as ArrayList<User>)
        listView!!.adapter = adapter
    }

    fun initUsers(){
        list = ArrayList<User>()
        list?.add(User("张三",11))
        list?.add(User("李四",12))
        list?.add(User("王五",13))
        list?.add(User("赵六",14))
        list?.add(User("田七",15))
    }

    fun initData(){
        var d1 = Data("liwy")
        var d2 = Data("zhangsan",22)
        var d3 = Data("lisi","ceo",25,"2017-05-05 22:33:22")
        println(d1.toString())
        println(d2.toString())
        println(d3.toString())
    }


}
