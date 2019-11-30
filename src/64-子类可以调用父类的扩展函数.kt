fun main(args: Array<String>) {
    val s:F = S()
    println(s.teaching())
}

//F扩展函数
fun F.teaching(){
    println("上课")
}

open class F
class S: F()