fun main(args: Array<String>) {
    //求n的阶乘
    //5的阶乘 = 5x4x3x2x1
    //4的阶乘 = 4x3x2x1
    //3的阶乘 = 3x2x1
    //2的阶乘 = 2x1
    //1的阶乘 = 1
    //5的阶乘 = 5x4的阶乘
    //4的阶乘 = 4x3的阶乘
    //n的阶乘 = nx(n-1)的阶乘
    var n = 10
    var result = todo(10)
    println(result)

    //斐波那契数列
    var num = todo2(n)
    println(num)
}

/**
 * 第3个 = 1+1
 * 第4个 = 第二个+第三个
 * 第5个 = 第三个+第四个
 * 第6个 = 第四个+第五个
 * 第n个 = 第(n-2)+(n-1)个 = ((n-3)+(n-4))+((n-2)+(n-3))
 */
fun todo2(n: Int): Int {
    return if(n == 1 || n == 2){
        1
    }else{
        todo2(n-1)+todo2(n-2)
    }
}

fun todo(n:Int):Int{
    return if(n == 1){
        1
    }else{
        n*todo(n-1)
    }
}