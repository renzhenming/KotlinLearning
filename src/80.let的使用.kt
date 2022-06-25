fun main() {
    var listOf = listOf<Int>(1, 2, 3, 4, 5)


    listOf.let {
        //it代表的是调用let的对象本身，比如这里就是指list这个对象
        var i = it.first() + it.last()
        println(i)
        true//最后一行作为函数返回值（返回值根据最后一行的类型变化而变化）
    }

    /**
     * let:
     * 1.持有it
     * 2.返回最后一行
     */

    var str:String? = null
    str = ""
    var temp = str?.let {
        println("str不是null")
        false
    }?:"str是null"
    println(temp)
}