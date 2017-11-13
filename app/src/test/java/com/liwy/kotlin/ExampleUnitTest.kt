package com.liwy.kotlin

import com.liwy.kotlin.bean.Data
import com.liwy.kotlin.bean.People1
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

    @Test
    fun testInterface(){
        var p1 = People1("liwy")
//        p1.say(2)
//        p1.run()
//        p1.cry(1)
        println(p1.toString())
        val p2 = People1("tom")
//        p2.say(3)
//        p2.run()
        p2.cry(5)
        repeat(5,{p2.cry(2)})//重复5次执行

    }
    fun People1.cry(count :Int) {
        cry()
        println(name + "被打了" + count + "顿")
    }
    fun People1.say(count:Int){
        say()
        println(name + "说了"+ count+"次还是没说清")
    }
}
