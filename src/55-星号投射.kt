fun main(args: Array<String>) {
    val list = ArrayList<Int>()
    val list2 = ArrayList<String>()
    val list3 = ArrayList<Boolean>()

    setList(list)
    setList(list2)
    setList(list3)
}

/**
 * 星号表示可以接收任何类型，相当于Java中的fun setList(list:ArrayList<?>)
 */
fun setList(list:ArrayList<*>){
    println(list.size)
}