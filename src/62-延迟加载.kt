fun main(args: Array<String>) {
    val test = Test()
    //test.name = "哈哈"
//    test.init()
    println(test.getNameInner())
}

/**
 * 延迟加载可以不必声明时就初始化变量，并且如果没有初始化就是用会报错
 */
class Test {
    private lateinit var name: String

    fun init() {
        name = "zs"
    }

    fun getNameInner(): String {
        return if (::name.isInitialized) {
            return name
        } else {
            "name还未初始化"
        }
    }
}