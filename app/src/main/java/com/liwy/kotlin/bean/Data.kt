package com.liwy.kotlin.bean

/**
 * Created by liwy on 2017/11/9.
 */

class Data(age: Int) {
    var name: String?=null
    var title: String?=null
    var age: Int = 0
    var createTime: String?=null


    constructor(name: String) :this(age = 0){
        this.name = name
    }

    constructor(name: String, myage: Int):this(age = myage) {
        this.name = name
        this.age = myage
    }

    constructor(name: String, title: String, age: Int, createTime: String) :this(age = age){
        this.name = name
        this.title = title
        this.age = age
        this.createTime = createTime
    }

    override fun toString(): String {
        return "Data(name=$name, title=$title, age=$age, createTime=$createTime)"
    }
    class MsgData(){
        fun getMsg(){
            println("收到了一条信息")
        }
    }
}
