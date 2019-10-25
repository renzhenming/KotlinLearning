fun main(args: Array<String>) {
    var a = 10
    var b =10
    var c =43
    var d = 45
    var result = add2(a,b,c,d,23,435,545)
    println(result)
}
fun add2(vararg a:Int):Int{
    var result = 0
    a.forEach {
        result += it
    }
    return result
}