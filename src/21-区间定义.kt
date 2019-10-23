fun main(args: Array<String>) {
    val range1 = 1..200
    val range2 = IntRange(1,200)
    val range3 = 1.rangeTo(200)

    val range4 = 1L..200L
    val range5 = LongRange(1,200)
    val range6 = 1L.rangeTo(200L)

    val range7 = 'a'..'z'
    val range8 = CharRange('a','z')
    val range9 = 'a'.rangeTo('z')
    for (c in range9){
        println(c)
    }

    range1.forEach {
        println(it)
    }

    range1.forEachIndexed { index, i ->
        println("$i $index")
    }
    val range10 = '赵'..'周'

}