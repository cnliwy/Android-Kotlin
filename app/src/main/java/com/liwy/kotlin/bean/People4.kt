package com.liwy.kotlin.bean

/**
 * Created by liwy on 2017/5/24.
 */
class People4(name : String, age : Int, remark : String) {
    var name = name;
    var age = age;
    var remark = remark;
    constructor(name : String,parent : People4) : this(name,0,""){
        parent.name = name;
        parent.age = age;
        parent.remark = remark;
    }
}