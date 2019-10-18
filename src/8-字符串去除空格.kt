fun main(args: Array<String>) {
    val str = "      上海浦东新区     "
    println(str)
    val str2 = str.trim()
    println(str2)
    val str3 = """
        上海市
        浦东新区
        东明路
    """.trimStart()
    println(str3)

    val str4 = """
        上海市
        浦东新区
        东明路
    """.trimEnd()
    println(str4)

    val str5 = """
        上海市
        浦东新区
        东明路
    """.trimIndent()
    println(str5)

    val str6 = """
        大上海市
        大浦东新区
        大东明路
    """.trimMargin("大")
    println(str6)

    val str7 = """
        |上海市
        |浦东新区
        |东明路
    """.trimMargin("|")
    println(str7)
}