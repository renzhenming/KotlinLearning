fun main(args: Array<String>) {
    var n = Nothing("张三",31)
    println(n.age)

    var m = Nothing("李四",43,110)
//    println(m.phone) //此构造函数中定义的新字段无法调用，何解？次构造函数中
    //不能像主构造函数那样在字段前加var,所以必须声明变量接收才行

    //然后就可以调用了
    println(m.phone)
}

class Nothing(var name:String,var age:Int){ //必须要有的属性

    var phone:Int = 0
    //次构造函数，必须要调用主构造函数
    constructor(name:String,age:Int,phone:Int):this(name,age){
        this.phone = phone
    }
}