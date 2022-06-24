fun main() {
    `今天是2022年6月24日，我在写kotlin代码的新特性`("rzm")

    //java中定义的方法名，刚好是kotlin中的关键字，那是不能直接调用的，需要加上反引号
    JavaFileTest.`is`()
}

fun `今天是2022年6月24日，我在写kotlin代码的新特性`(name: String) {
    println(name)
}