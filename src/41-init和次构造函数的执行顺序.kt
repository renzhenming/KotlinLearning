fun main(args: Array<String>) {

    var m = Nothing2("李四",43,110)
    println(m.phone)
}

/**
 * 先执行init，再执行次构造函数
 */
class Nothing2(var name:String,var age:Int){ //必须要有的属性

    init {
        println("init执行")
    }

    var phone:Int = 0
    //次构造函数，必须要调用主构造函数
    constructor(name:String,age:Int,phone:Int):this(name,age){
        this.phone = phone
        println("次构造函数执行")
    }
}