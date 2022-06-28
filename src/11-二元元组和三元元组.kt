fun main(args: Array<String>) {

    //定义二元元组
    val pair = Pair<String, Int>("今天", 12)
    val pair2 = "今天" to 20
    println(pair.first)
    println(pair.second)

    //三元元组
    val triple = Triple<String, String, String>("张三", "男", "北京人")
    println(triple.first)
    println(triple.second)
    println(triple.third)
}