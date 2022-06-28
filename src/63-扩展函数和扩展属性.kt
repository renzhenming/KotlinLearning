import java.util.Date

fun main(args: Array<String>) {
    val string: String = "haha"
    println(string.isEmpty())

    var str: String? = null
    println(str.isEmpty2())

    var d = Date()
    d.getTimeOf100yearAgo()

    var classname = d.getClassname()
    var classname1 = string.getClassname()

    var name = 1.getName()

    println("123".mParent)
//    "123".mParent = "classLoader"
//    println("123".mParent)

    println("123".getStringModifiedTime("123"))
    println(null.getStringModifiedTime("1223"))
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
fun String.isEmpty(): Boolean {
    return this == null || this.length == 0
}

fun Date.getTimeOf100yearAgo(): Long {
    return Date().time
}

/**
 * 给范型扩展
 */
inline fun <reified R> R.getName(): String {
    println(R::class.java)
    return this.toString()
}

fun Any.getClassname(): String {
    return this.javaClass.toString()
}

/**
 * 扩展可空类型
 */
fun String?.isEmpty2(): Boolean {
    return this == null || this.length == 0
}

//扩展属性
val String.mParent: String
    get() = "object"

fun String?.getStringModifiedTime(defaultTime: String): String {
    return if (this.isNullOrEmpty()) {
        defaultTime
    } else {
        System.currentTimeMillis().toString()
    }
}
