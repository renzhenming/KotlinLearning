fun main() {
    var listOf = listOf<String>("a", "b", "c")
    var flatMap = listOf.map {
        "我是$it"
    }.flatMap {
        //a b c分别会调用一次，最后达到3x3的效果，输出9个元素
        listOf("$it,我爱唱歌", "$it,我爱跳舞", "$it，我爱表演")
    }
    println(flatMap)

    println()

    var listOf2 = listOf<String>("d", "e", "f")
    var flatMap2 = listOf2.map {
        "我是$it"
    }.flatMap {
        //a b c分别会调用一次，最后达到3x3的效果，输出9个元素
        //这里必须传list
        listOf("$it,我爱唱歌")
    }
    println(flatMap2)

    var listOf3 = listOf<String>("dd", "ed", "fd")
    var flatMap1 = listOf3.flatMap {
        listOf("$it hello")
    }
    println(flatMap1)
}