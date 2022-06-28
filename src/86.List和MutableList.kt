fun main() {

    //不可变集合
    var list: List<Int> = listOf()
//    list.add(1) //不允许

    var mutableListOf: MutableList<Int> = mutableListOf()
    mutableListOf.add(1)
    mutableListOf.add(2)
    mutableListOf.add(3)
    mutableListOf.add(4)
    mutableListOf.add(5)

    println(mutableListOf.getOrElse(4) { "没有获取到" })
    println(mutableListOf.getOrElse(5) { "没有获取到" })
    println(mutableListOf.getOrNull(4))
    println(mutableListOf.getOrNull(5))

    //可变转不可变，不可变转可变

    var toMutableList = list.toMutableList()
    toMutableList.add(6)

    var toList = mutableListOf.toList()
//    toList.add(10)

    println("===========================")
    //增删改查

    var mList: MutableList<String> = mutableListOf("a", "b", "c", "d", "e", "f");
    mList += "g"
    mList += "h"

    println(mList)

    mList -= "a"
    mList -= "c"

    println(mList)

    //如果条件满足就删除，会遍历所有数据
    mList.removeIf {
        it == "d"
    }
    println(mList)

    println("-----------------")

    //遍历
    var listOf = listOf(12, 13, 14, 15, 16, 17, 18, 19)
    for (value in listOf) {
        println(value)
    }

    println("-----------------")

    listOf.forEach {
        println(it)
    }

    println("-----------------")

    listOf.forEachIndexed { index, i ->
        println("indec: $index value: $i")
    }
}