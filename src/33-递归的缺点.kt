fun main(args: Array<String>) {
    //求和 n+(n-1)+...+1

    var n = 100
    //当n = 100000时，递归发生了栈溢出，因为递归需要不断的将方法入栈，
    //内存开销很大
    //var n = 100000
    addNum(n)
    println("----------------------------")
    var resutl = diguiAddNum(n)
    println(resutl)
}

fun addNum(n:Int) :Int{
    var m = n
    var i = 0
    while(m >0){
        i+=m
        m--
    }
    println(i)
    return i
}

fun diguiAddNum(n:Int):Int{
    return if(n == 1){
        1
    }else{
        n+diguiAddNum(n-1)
    }
}