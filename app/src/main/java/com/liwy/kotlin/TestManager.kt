package com.liwy.kotlin

import com.liwy.kotlin.bean.Menu
import com.liwy.kotlin.bean.People4

/**
 * Created by liwy on 2017/5/24.
 */
class TestManager {

    fun sayHello(){
        println("hello world")
    }

    fun sayHello(name : String){
        var content = name + ":hello world";
        println("$name said : hello world!")
        println(content)
    }
    fun sayHello(time : Int):String{
        var content = StringBuffer().append("I have said ").append(time).append(" times!")
        return content.toString()
    }

    fun printPeople4(){
        var people4 = People4("tom", People4("liwy",20,"test"));
        var sb =  StringBuffer();
        sb.append(people4.name).append(",").append(people4.age).append(",".apply { people4.remark })
        println(sb.toString())
    }

    fun testWhen(a : Int){
        var text = when(a){
            0 -> "i'm 0"
            else-> "i'm else"
        }
        println(text)
    }

    fun testFor(list : MutableList<Menu>){
//        for (menu in list){
//            println(menu.title)
//        }

//        for (i in list.indices){
//            println(list[i].title)
//        }

        for ((i,value) in list.withIndex()){
//            println("position:$i,value:$value")
            println("position:$i,value:" + value.title);
        }
    }




}