fun main(args: Array<String>) {
    val test = Test()
    //test.name = "哈哈"
    println(test.name)
}

/**
 * 延迟加载可以不必声明时就初始化变量，并且如果没有初始化就是用会报错
 */
class Test{
    lateinit var name:String
}