fun main(args: Array<String>) {

    //这种定义是有问题的
    val range = 100..1
    println("rang = $range")
    println()
    //应该这样定义从大到小的区间
    val range2 = 100.downTo(1)
    val range3 = 100 downTo 1
    range3.forEach {
        print(it)
    }
    println()
    val range4 = 1.rangeTo(100)
    var reversed = range4.reversed()
    for (i in reversed step 3) {
        println(i)
    }
}