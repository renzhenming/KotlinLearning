fun main() {


    var listOf = listOf("zhangsan", "lisi", "wangwu")

    //接收后不可修改
    val (n1, n2, n3) = listOf
    println("$n1 $n2 $n3")


    //接收后可修改
    var (n11, n21, n31) = listOf
    n11 = "aaa"
    println("$n11 $n21 $n31")


    //_表示不接收，_不是变量名，只是一个标志
    var (_, n211, n311) = listOf
    println("$n211 $n311")
}