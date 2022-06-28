fun main(args: Array<String>) {
    val age = 1
    val what: String = aimTo_super(age)
    println(what)
}

/**
 * 支持区间
 */
fun aimTo_super(age: Int): String {
    return when (age) {
        1, 2, 3 -> "上幼儿园"
        in 4..6 -> "上小学"
        in 7..12 -> "上中学"
        in 13..18 -> "上大学"
        else -> "毕业"
    }
}