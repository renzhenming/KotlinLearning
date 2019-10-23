fun main(args: Array<String>) {
    val array = arrayOf(1,2,3,4,5)
    array[4] = 0
    array.forEach {
        println(it)
    }

    array.set(0,111)
    for (i in array) {
        println(i)
    }
}