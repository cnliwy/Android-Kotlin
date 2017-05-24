kotlin 学习笔记基础篇（一）
===
**一、基本类型**
```
类型	长度   对应java类型
Double 	64      double
Float 	32      float
Long 	64      long
Int 	32      int
Short 	16      short
Byte 	8       byte
```

**二、属性字段**
```
1 声明一个string类型的属性name
eg:var name : String? = null;
其中 var表明该字段的字值为可变的，val表示不可变。
注：kotlin下声明属性必须初始化，除非是抽象属性
abstract var name : String;
这种情况下也是可以的哦。
2 声明一个有非空默认值的属性name
eg：var name : String = "tom"
像这种非空有值的赋值就不需要在String类型后加?。
其实这种情况可以更简单的写为：var name = "tom"
这两种方式是等价的。
```

**三、类**
```
1 创建一个无属性的People类
class Prople{

}

2 创建一个有属性的Prople类
class People{
    var name : String? = null
    var age : Int = 25
    var remark = "hello world"
}

3 创建一个有构造器的Prople类

    1）第一种构造方法：主构造方法
    class People(var name : String,var age : Int, var remark : String){}
    对，你没有看错，括号里的内容就是Prople类的构造方法。其实这里只是把constructor省略了，它的完整形式应该是这样的：
    class People constructor(var name : String,var age : Int, var remark : String){}
    当然这只是其中一种构造方法的声明方式，这种方式声明的构造方法叫主构造方法。构造方法里的参数就是类里的属性。
    
    2）第二种构造方法：主构造方法
    class People(name : String, age : Int, remark : String){
           val name = name;
           val age = age;
           val remark = remark;
    }
    其实第二种构造方法也是主构造方法,只是属性的声明放在了类体里。
    
    3）第三种构造方法：次构造方法
       class People(name : String, age : Int, remark : String) {
           var name = name;
           var age = age;
           var remark = remark;
           
           constructor(name : String,parent : People) : this(name,0,""){
               parent.name = name;
               parent.age = age;
               parent.remark = remark;
           }
       }
       在People类里声明三个属性，同时主构造方法传入这三个参数，并且声明只有一个name参数的次构造方法。Kotlin语法要求，次构造方法必须委托给主构造函数去初始化成员属性,委托方式即上面代码的this部分：this(name,0,"")。
       
4 继承
java里的继承关键字是extends。这里又帮同志们省略了一个单词。假如我们想新建个Strudent类，使其继承People类，可以通过如下方式：
1 首先需声明People为open
open class People{
}
2 继承People
class Student : People{

}
与open对应的修饰词是final，open表示可继承的，final则相反-禁止继承。
```

**四、可见性修饰域**
```
上面代码始终没有出现public、private等修饰域，这里是准备统一描述下。
kotlin的可见性修饰域有4个：private、 protected、 internal 和 public。属性、方法或类不声明的话默认是public.
 1)函数、属性和类、对象和接口可以在顶层声明，即直接在包内：
    函数、属性和类、对象和接口的作用范围：
    如果你不指定任何可见性修饰符，默认为 public，这意味着你的声明 将随处可见；
    如果你声明为 private，它只会在声明它的文件内可见；
    如果你声明为 internal，它会在相同模块内随处可见；
    protected 不适用于顶层声明。
  2）对于类内部声明的成员：
    private 意味着只在这个类内部（包含其所有成员）可见；
    protected—— 和 private一样 + 在子类中可见。
    internal —— 能见到类声明的 本模块内 的任何客户端都可见其 internal 成员；
    public —— 能见到类声明的任何客户端都可见其 public 成员。
    
  注：kotlin的外部类无法访问内部类的private成员。

```

**学习地址**
```
https://www.kotlincn.net/docs/reference/
```