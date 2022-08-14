import kotlin.reflect.KFunction

fun main(args: Array<String>) {
    var a = 10
    var b = 20
    //常规调用
    var c = add(a, b)
    //println(c)

    //获取函数引用调用
    val padd = ::add
    println(padd(a, b))
    println(padd?.invoke(a, b))//可以处理函数变量为空的情况

    //匿名函数
    val hehe: (Int, Int) -> Int = { a, b ->
        a + b + 100
    }

    val haha: (Int, String) -> String = { age, name ->
        age.toString() + name
    }

    var myMethod: (String, String) -> String = { name, sex ->
        name + sex
    }

    val other: (String, String) -> String = { name, sex ->
        println(name + sex)
        ""//匿名函数不用写return，最后一行作为返回值，隐式返回
    }

    other("章三", "男")

    println(hehe(34, 32))


    /**
     * 等同于
     *
     *  fun add(a: Int, b: Int): Int {
     *   return a + b
     *  }
     */
    val add: (Int, Int) -> Int = { a, b ->
        println(a + b)
        a + b//匿名函数不用写return，最后一行作为返回值，隐式返回
    }

    add.invoke(12, 13)

    /**
     * 匿名函数类型推断
     */

    var method = {
        3.14
    }
    println(method())

    var method2 = { name: String, age: Int ->
        name
    }
    println(method2("里斯", 12))
}

fun add(a: Int, b: Int): Int {
    return a + b
}

