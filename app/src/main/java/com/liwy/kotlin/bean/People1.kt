package com.liwy.kotlin.bean

import com.liwy.kotlin.`interface`.ActionInf

/**
 * Created by liwy on 2017/5/24.
 */

open class People1(name:String) : ActionInf {
    internal var name: String? = name
    internal var age: Int = 0
    init {
        age = 666
    }

    override fun say() {
        println(name + "说了一句话")
    }

    override fun run() {
        println(name + "跑了起来")
    }

    fun cry(){
        println(name + "哭了起来")
    }

    override fun toString(): String {
        return "People1(name=$name, age=$age)"
    }

}
