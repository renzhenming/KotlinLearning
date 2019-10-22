fun main(args: Array<String>) {
    val a = 10
    val b = 20
    var c = findMax(a,b)
}

fun findMax(a: Int, b: Int): Int {
    //kotlin的if语句有返回值，Java没有
    return if (a > b) a else b
}
