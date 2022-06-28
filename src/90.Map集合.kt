fun main() {
    var mapOf = mapOf<Int, String>(1 to "rzm", 2 to "ldh", 3 to "zhj")
    println(mapOf)

    var map2 = mutableMapOf<Int, String>(Pair(1, "rzm"), Pair(2, "ldh"), Pair(3, "zhj"))
    println(map2)

    map2 += 5 to "zj"
    map2 += 6 to "uu"
    println(map2)
    map2 -= 5
    println(map2)
    map2[12] = "lll"

    /**
     * 取值
     */

    println(map2[1])
    println(map2[2])
    println(map2.getOrDefault(1, "default"))
    println(map2.getOrDefault(10, "default"))
    println(map2.getOrElse(3) { -1 })
    println(map2.getOrPut(4) { "4没有值，新增一个zwj" })

    //println(map2.getValue(10))//getValue如果没有这个value,会崩溃，不要使用这种方式

    /**
     * 遍历
     */
    println("--------------遍历集合1-------------")
    //第一种
    for (it: Map.Entry<Int, String> in map2) {
        println("${it.key} ${it.value}")
    }
    for (it in map2) {
        println("${it.key} ${it.value}")
    }
    println("--------------遍历集合2-------------")
    //第二种
    map2.forEach {
        println("${it.key} ${it.value}")
    }
    println("--------------遍历集合3-------------")
    map2.forEach { (t, u) ->
        println("$t $u")
    }
    println("--------------遍历集合4-------------")
    map2.forEach { (t: Int, u: String) ->
        println("$t $u")
    }
}