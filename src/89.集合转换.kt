fun main() {
    var mutableListOf = mutableListOf<Int>(1, 2, 3, 4, 5, 5, 6, 6, 7, 7, 7, 7, 9)
    println(mutableListOf)

    //list转set后会去除重复
    var toSet = mutableListOf.toSet()
    println(toSet)

    //将list去重的方式
    println(mutableListOf.toSet().toList())

    //调用函数将list去重
    println(mutableListOf.distinct())
}