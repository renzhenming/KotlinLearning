import kotlin.math.roundToInt

fun main() {
    var toIntOrNull = "6.66".toIntOrNull()
    println(toIntOrNull)

    var toDoubleOrNull = "5".toDoubleOrNull()
    println(toDoubleOrNull)

    var toIntOrNull1 = "12".toIntOrNull()
    println(toIntOrNull1)

    //四舍五入
    var roundToInt = 6.66666666.roundToInt()
    println(roundToInt)

    //保留小数点后几位
    var format = "%.3f".format(6.66666666)
    var format2 = "%.4f".format(6.66666666)
    println(format)
    println(format2)
}