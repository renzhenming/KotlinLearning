fun main(args: Array<String>) {
    //可空类型？=
    val str: String? = null
    //非空断言 !!，告诉编译器一定不会为空
    //str!!.toInt()
    //空安全调用符,如果为空后边不再执行
    str?.toInt()

    //?:如果为空，则返回默认值0
    val b: Int = str?.toInt() ?: 0
    println(b)

    var name: String? = "rzm"
    name?.let {
        var length = name?.length
        println(it)
    }

    name = null
    checkNotNull(name)
}

fun getObject(any: Any) {
    println(any)
}