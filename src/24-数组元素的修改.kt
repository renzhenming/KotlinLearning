fun main(args: Array<String>) {
    val array = arrayOf(1,2,3,4,5)
    array[4] = 0
    array.forEach {
        println(it)
    }

    //kotlin的特性，从此不会出现空指针与数组越界，List也有这两个方法
    var value = array.getOrElse(5){
        "you are out of index"
    }

    var value2 = array.getOrNull(5)
    println(value)
    println(value2)

    array.set(0,111)
    for (i in array) {
        println(i)
    }
}