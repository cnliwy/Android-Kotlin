package com.liwy.kotlin

import com.liwy.kotlin.bean.Data
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {
    @Test
    @Throws(Exception::class)
    fun addition_isCorrect() {
        assertEquals(4, (2 + 2).toLong())
    }

    @Test
    fun initData(){
        var d1 = Data("liwy")
        var d2 = Data("zhangsan",22)
        var d3 = Data("lisi","ceo",25,"2017-05-05 22:33:22")
        println(d1.toString())
        println(d2.toString())
        println(d3.toString())

        var msgData = Data.MsgData()
        msgData.getMsg()
    }
}