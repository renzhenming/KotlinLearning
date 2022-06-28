fun main() {


    /**
     * also:
     * 1.持有it
     * 2.返回调用者本身
     */


    var str = "hello world, i am coming"
    var s = str.also {
        var toUpperCase = str.toUpperCase()
        println(toUpperCase)
    }.also {
        var toIntOrNull = str.toString().toIntOrNull()
        println(toIntOrNull)
    }.also {
        var toBigDecimal = str.toLowerCase()
        println(toBigDecimal)
    }
    println(s)
}

public inline fun <Q> Q.myAlso(callback: (Q) -> Unit): Q {
    callback(this)
    return this
}