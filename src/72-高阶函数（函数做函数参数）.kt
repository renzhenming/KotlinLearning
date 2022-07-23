fun main(args: Array<String>) {
    var a = 10
    var b = 20
    //方法名前边加::表示获取方法引用
    var sum = calculate(a, b, ::jia)
    println(sum)
    var sum2 = calculate(a, b, ::jian)
    println(sum2)

    var s = calculate(a, b) { a, b ->
        a + b
    }

    //通过lambda表达式调用
    val sum3 = calculate(a, b, { c, d ->
        c + d;
    })
    println(sum3)

    //lambda更高级的写法
    val sum4 = calculate(a, b) { c, d ->
        c - d
    }
    println(sum4)

    login("rzm", "123") { message, code ->
        println("message = $message code = $code")
    }
    login("rzm", "1234") { message, code ->
        println("message = $message code = $code")
    }
}

/**
 * inline 关键字的用处：高阶函数（Higher-order Functions）有它们天然的性能缺陷:
 *
 *
 * 因为 Java 并没有对函数类型的变量的原生支持，Kotlin 需要想办法来让这种自己新引入的概念在
 * JVM 中落地。而它想的办法是什么呢？就是用一个 JVM 对象来作为函数类型的变量的实际载体，
 * 让这个对象去执行实际的代码。也就是说，在我对代码做了刚才那种修改之后，程序在每次调用
 * logout() 的时候都会创建一个对象来执行 Lambda 表达式里的代码，虽然这个对象是用一下之后马上就被抛弃，
 * 但它确实被创建了。
 *
 *
 * 我们通过 inline 关键字让函数用内联的方式进行编译，来减少参数对象的创建，从而避免出现性能问题。
 */
inline fun login(name: String, password: String, loginCallback: (String, Int) -> Unit) {
    if ("rzm" == name && "123" == password) {
        loginCallback("登录成功", 200)
    } else {
        loginCallback("登录失败", 100)
    }
}

/**
 * kotlin函数可以传递函数参数，这种函数称为高阶函数
 */
fun calculate(a: Int, b: Int, function: (Int, Int) -> Int): Int {
    //传递一个方法引用过来，通过调用这个方法计算
    val result = function(a, b)
    return result
}

fun jia(a: Int, b: Int): Int {
    return a + b
}

fun jian(a: Int, b: Int): Int {
    return a - b
}