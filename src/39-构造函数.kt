fun main(args: Array<String>) {
    val person = Worker("张三",20)
    println(person.name)
    println(person.age)

    val w = Worker2("李四",32)
    println(w.age)
    println(w.name)
}

/**
 * 构造函数
 */
class Worker(name:String,age:Int){
    var name:String = ""
    var age:Int = 0

    //构造函数中写的代码可以在init中执行
    init {
        this.name = name
        this.age = age
    }
}

/**
 * 构造函数简化版写法，（类中没有任何定义，大括号可以去掉）
 */
class Worker2(var name:String,var age:Int)