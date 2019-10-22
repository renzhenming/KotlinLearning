fun main(args: Array<String>) {
    val str1 = "abcd"
    val str2 = "1234"
    tag@for (c in str1){
        for(c2 in str2){
            println("$c $c2")
            //打印到d 1的时候，跳出循环，执行后边的逻辑
            if (c == 'd' && c2 == '1'){
                break@tag
            }
        }
    }
    println("后边的逻辑")
}