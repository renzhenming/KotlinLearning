fun main(args: Array<String>) {
    val b1 = Banana<Int>(10)
    val b2 = Banana<String>("10")

    //b1 b2应该分别是Int和String，那么我们打印一下看看
    println(b1.javaClass.name)
    println(b2.javaClass.name)
    //出乎意料的打印的都是Banana
    //Banana，这就是泛型擦除

    //那么如何获取呢
    b2.print2("哈哈")
    b2.print2(12)
    //打印：
//    java.lang.String
//    java.lang.Integer

}

class Banana<S>(size:S){
    fun print(size: S){
        println(size)
    }

    /**
     * 泛型前加reified,fun前加inline
     */
    inline fun <reified T>print2(size: T){
        println(T::class.java.name)
    }
}