fun main(args: Array<String>) {
    val person = Worker("张三", 20)
    println(person.name)
    println(person.age)

    val w = Worker2("李四", 32)
    println(w.age)
    println(w.name)

    println()
    var s = Student22(null, -1)
    println(s._age)
    println(s._name)

    var ss = Student(null, -1)
    //stackoverflow，这个用法是错误的
    println(ss.name)
}

/**
 * 构造函数
 */
class Worker(name: String, age: Int) {
    var name: String = ""
    var age: Int = 0

    //构造函数中写的代码可以在init中执行
    init {
        this.name = name
        this.age = age
    }
}

/**
 * 构造函数简化版写法，（类中没有任何定义，大括号可以去掉）
 */
class Worker2(var name: String, var age: Int)

//会发生stackoverflow
class Student(name: String?, age: Int) {
    var name = name
        //stackoverflow，这个用法是错误的
//        get() = if (name.isNullOrEmpty()) "" else name
    var age = age
        set(value) = if (value < 0) field = 0 else field = value
}

class Student22(name: String?, age: Int) {
    var _name: String? = name
        //必须用field做判断，否则会stackoverflow
        get() = if (field.isNullOrEmpty()) "is null" else _name
    var _age = age
        //必须用field做判断，否则会stackoverflow
        get() = if (field < 0) 0 else field
}