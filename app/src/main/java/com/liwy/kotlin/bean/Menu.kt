package com.liwy.kotlin.bean

/**
 * Created by liwy on 2017/5/24.
 */
class Menu(var title : String) {
    var data:Data? = null
    var data2:Data? = null

    fun initContent(str:String){
        data?.content = str
    }
    fun printContent(){
        println(data?.content)
        println(data2?.content)
    }
    var Data.content: String
        get() = title?:"职位为空"
        set(value) {
            title = value
        }
}
