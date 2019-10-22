fun main(args: Array<String>) {
    val str = "abcd"
    for(hah in str){
        println(hah)
    }

    //一定是角标在前
    for ((index,c) in str.withIndex()){
        println("c=$c index=$index")
    }

    str.forEach {
        println(it)
    }

    str.forEachIndexed { index, c ->
        println("c=$c index=$index")
    }

}