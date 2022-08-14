import kotlin.math.log

fun main(args: Array<String>) {
    //test返回一个函数，result是一个函数，再次执行result函数可以执行内部函数
    //return {
    //        println(a)
    //        a++
    //    }
    val result = test()
    result()
    result()
    result()

    var aGoodMethod = aGoodMethod("rzm", 30)
    aGoodMethod.invoke()

    val newMethod = ::unique
    newMethod("哈哈哈")

    var login = login("renzhenming", "123")
    println("拿到用户数据了，登录成功，退出当前页面")
    login()
}

/**
 * 闭包：Python:一个函数返回了一个内部函数，该内部函数引用了外部函数的相关参数和变量，我们把该返回的内部函数
 * 成为闭包
 * 在kotlin里面我们通常说的闭包就是lambda表达式
 */
fun test(): () -> Unit {
    var a = 10
    return {
        println(a)
        a++
    }
}

fun aGoodMethod(name: String, age: Int): () -> Unit {
    return {
        println(name)
    }
}

fun login(name: String, password: String): () -> Unit {
    println("$name 开始登录，登录成功")
    return {
        println("外界已经知道登录成功了，可以退出了")
    }
}

fun unique(name: String) {

}