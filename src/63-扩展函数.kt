fun main(args: Array<String>) {
    val string:String = "haha"
    println(string.isEmpty())

    var str: String? = null
    println(str.isEmpty2())
}

/**
 * 主要用来扩展系统工具类方法，或者扩展我们没有修改权限的类，比如父类
 * 扩展函数使用方法
 * fun String.扩展函数名
 * 扩展函数可以访问当前对象里面的字段和方法
 */

/**
 * 扩展非空类型
 */
fun String.isEmpty():Boolean{
    return this == null || this.length == 0
}

/**
 * 扩展可空类型
 */
fun String?.isEmpty2():Boolean{
    return this == null || this.length == 0
}