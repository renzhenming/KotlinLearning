fun main(args: Array<String>) {

    println(/*********普通字符串***********/)
    val place = "上海市浦东新区东明路"
    println(place)
    val place2 = "上海市\n浦东新区\n东明路"
    println(place2)
    val place3 = "上海市" +
            "浦东新区" +
            "东明路"
    println(place3)

    println(/*********原样输出字符串***********/)
    //转成Java可以看到仍然是使用的\n实现的
    val place4 = """
        上海市
        浦东新区
        东明路
    """.trimIndent()
    println(place4)
}