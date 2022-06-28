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

class Banana<S>(size: S) {
    fun print(size: S) {
        println(size)
    }

    /**
     * reified关键字是用于Kotlin内联函数的
     * 泛型前加reified,fun前加inline
     *
     * 泛型在运行时会被类型擦除，但是在inline函数中我们可以指定类型不被擦除，
     * 因为inline函数在编译期会将字节码copy到调用它的方法里，
     * 所以编译器会知道当前的方法中泛型对应的具体类型是什么，
     * 然后把泛型替换为具体类型，从而达到不被擦除的目的，
     * 在inline函数中我们可以通过reified关键字来标记这个泛型在编译时替换成具体类型
     *
     * 例：
     * public inline fun <reified T: Activity> Context.startActivity(
     * vararg params: Pair<String, String>) {
     *      val intent = Intent(this, T::class.javaClass)
     *      params forEach { intent.putExtra(it.first, it.second)
     *      startActivity(intent)
     * }
     */
    inline fun <reified T> print2(size: T) {
        println(T::class.java.name)
    }
}