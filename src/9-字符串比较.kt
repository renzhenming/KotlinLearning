fun main(args: Array<String>) {
    val str1 = "abc"
    val str2 = String(charArrayOf('a','b','c'))
    //比较的是值
    println(str1.equals(str2))
    println(str1 == str2)

    //比较的是地址
    println(str1 === str2)
}