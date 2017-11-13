package com.liwy.kotlin.bean

/**
 * Created by liwy on 2017/11/9.
 */
class User(name:String,age:Int){
    var title:String?=name
    var myName:String?=null
    var my1:String?=null
    constructor(name: String,title:String,num:Int) : this(name = name, age = num) {
        myName = name
        this.title=title
    }
}