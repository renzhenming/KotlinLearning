fun main(args: Array<String>) {
    val result = {a:Int,b:Int->
        a+b
    }.invoke(20,230)
    println(result)
}