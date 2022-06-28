fun main(args: Array<String>) {
    println(name3)
    println(name3)
    /**
     * 打印结果表明第一次调用初始化了，第二次已经不再执行lazy中的代码
     * 初始化1
    初始化2
    王五
    王五
     */
}

val name3: String by lazy {
    println("初始化1")
    println("初始化2")
    "王五"
}

/**
 * 1.变量必须是val 不可变类型
 * 2.可以是成员变量也可以单独存在
 * 3.最后一行是返回值
 * 4.线程安全的
 */
class Haha {
    val name: String = "张三"
    val name2: String by lazy {
        "李四"
    }
}