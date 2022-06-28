fun main() {
    var set = setOf<String>("zs", "za", "lisi", "lisi", "zs", "ww")
    println(set)
    println(set.elementAt(0))
    println(set.elementAt(1))
    println(set.elementAt(2))
    println(set.elementAt(3))
    println(set.elementAtOrNull(4))
    println(set.elementAtOrElse(5) { "你的值不存在" })


    var mutableList = mutableSetOf<String>("zs", "za", "lisi", "lisi", "zs", "ww")
    mutableList += "ss"
    mutableList += "ww"
    mutableList += "vv"
    println(mutableList)
    mutableList -= "ss"
    mutableList.add("rr")
    mutableList.remove("vv")

    println(mutableList)

}