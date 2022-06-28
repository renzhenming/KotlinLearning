import toIntArray;

//将方法名重命名为normal
import abcdefghigklmnopq as normal

fun main() {
    var s = "1234567"
    val message = s.toIntArray()
    for (i in message) {
        println(i)
    }

    s.normal()
}