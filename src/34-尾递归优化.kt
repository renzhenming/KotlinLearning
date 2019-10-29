fun main(args: Array<String>) {
    var i = 100000
    var result = sum2(i)
    println(result)
}

/**
 * 将累加操作转为尾递归实现方式
 * n= 10 sum2(9,10) sum2(8,10+9) sum2(7,10+9+8) ...
 *
 * 然后方法前加上关键字tailrec,你会发现同样情况下，n=100000
 * 不会发生栈溢出了
 *
 * 什么原理，转化为Java代码会发现，是通过循环迭代的方式实现的
 */
tailrec fun sum2(n: Int,result:Int = 0): Int {
    return if(n == 1){
        result+1
    }else{
        sum2(n-1,result+n)
    }
}
