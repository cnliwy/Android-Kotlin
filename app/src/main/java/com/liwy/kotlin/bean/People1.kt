package com.liwy.kotlin.bean

import com.liwy.kotlin.`interface`.ActionInf

/**
 * Created by liwy on 2017/5/24.
 */

class People1(name:String) : ActionInf {
    internal var name: String? = name
    internal var age: Int = 0
    override fun say() {
        println(name + "说了一句话")
    }

    override fun run() {
        println(name + "跑了起来")
    }
}
