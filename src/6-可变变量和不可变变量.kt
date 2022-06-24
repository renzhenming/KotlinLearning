fun main(args: Array<String>) {
    var a: Int = 10
    val b: Int = 20
    a = 20
    //b = 10 val不能被修改

    val str: String = "rzm"
    println(str)

    val info = "haha"
    println(info)

    //只读变量
    val str2 = 3.1415927
}

//编译时常量，编译时常量只能在函数之外定义，为什么，如果在函数内定义，就只能在运行时赋值了，还算什么编译时常量
const val PI = 3.1415926