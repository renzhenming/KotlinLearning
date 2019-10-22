fun main(args: Array<String>) {
    val str = "abc"
    for (c in str){
        if (c == 'b'){
            continue
        }
        println(c)
    }
    for (c in str){
        if (c == 'c'){
            break
        }
        println(c)
    }
    //编译报错，continue和break只能用在for循环中
//    str.forEach {
//        if (it == 'c'){
//            continue
//        }
//        println(it)
//    }
}