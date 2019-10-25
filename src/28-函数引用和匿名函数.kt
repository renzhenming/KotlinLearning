import kotlin.reflect.KFunction

fun main(args: Array<String>) {
    var a = 10
    var b = 20
    //常规调用
    var c = add(a,b)
    //println(c)

    //获取函数引用调用
    val padd = ::add
    println(padd(a, b))
    println(padd?.invoke(a, b))//可以处理函数变量为空的情况

    //匿名函数
    val hehe:(Int,Int)->Int = { a,b->
        a+b+100
    }

    println(hehe(34,32))
}

fun add(a:Int,b:Int):Int{
    return a+b
}