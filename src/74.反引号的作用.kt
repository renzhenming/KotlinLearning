fun main() {
    `今天是2022年6月24日，我在写kotlin代码的新特性`("rzm")

    //java中定义的方法名，刚好是kotlin中的关键字，那是不能直接调用的，需要加上反引号
    JavaFileTest.`is`()
}

/**
 * 强制字符合法化
 *
 * 如果你确定你的类是不希望被 Java 访问到的话，就可以在类名上做一些特殊不合法的字符，
 * 这样的话就可以只在 Kotlin 中访问而不能被 Java 访问。
 */
fun `今天是2022年6月24日，我在写kotlin代码的新特性`(name: String) {
    println(name)
}