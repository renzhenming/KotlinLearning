
fun main(args: Array<String>) {
    var a = 10
    var b = 20
    //方法名前边加::表示获取方法引用
    var sum = calculate(a,b,::jia)
    println(sum)
    var sum2 = calculate(a,b,::jian)
    println(sum2)
}

/**
 * kotlin函数可以传递函数参数，这种函数称为高阶函数
 */
fun calculate(a:Int,b:Int,function:(Int,Int)->Int):Int{
    //传递一个方法引用过来，通过调用这个方法计算
    val result = function(a,b)
    return result
}

fun jia(a:Int,b:Int):Int{
    return a+b
}

fun jian(a:Int,b:Int):Int{
    return a-b
}