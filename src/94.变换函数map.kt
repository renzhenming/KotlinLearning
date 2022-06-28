fun main() {
    var l = listOf<String>("zs","lisi","wangwu")


    //map的作用是将最后一行作为集合元素加入新的集合，最后返回这个新集合
    var newList = l.map {
        //TODO 可以做一些处理
        "愚蠢的$it"
    }.map {
        //TODO 可以做一些处理
        "东北有一个$it"
    }.map {
        //TODO 可以做一些处理
        "中国$it"
    }
    println(newList)
}