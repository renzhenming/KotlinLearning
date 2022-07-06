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
 *
 * 尾递归：
 * 尾调用在尾部位置调用函数本身的情形。尾递归属于递归的一种特殊情形
 *
 * 通过 tailrec 修饰符来标记函数完成尾递归优化操作。所谓优化，
 * 即将递归操作改写成迭代操作，避免栈溢出。
 */
tailrec fun sum2(n: Int, result: Int = 0): Int {
    return if (n == 1) {
        result + 1
    } else {
        sum2(n - 1, result + n)
    }
}

fun sum3(n: Int, result: Int = 0): Int {
    return if (n == 1) {
        result + 1
    } else {
        sum2(n - 1, result + n)
    }
}
