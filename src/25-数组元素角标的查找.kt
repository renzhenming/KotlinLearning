fun main(args: Array<String>) {
    val array = arrayOf("张三","李四","王五","赵二","张三")
    val index = array.indexOf("李四")
    println(index)

    val index2 = array.lastIndexOf("张三")
    println(index2)

    //查找第一个姓张人的角标
    val index3 = array.indexOfFirst {
        it.startsWith("张")
    }
    println(index3)

    //查找最后一个姓张的人的角标
    val index5 = array.indexOfLast {
        it.startsWith("张")
    }

    println(index5)

    //取代第一种写法 查找李四的角标
    val index6 = array.indexOfFirst {
        it == "李四"
    }
    println(index6)
}