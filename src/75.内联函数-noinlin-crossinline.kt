import kotlin.concurrent.thread

fun main() {

}

/**
 * noinline。noinline 的意思很直白：inline 是内联，而 noinline 就是不内联。
 * 不过它不是作用于函数的，而是作用于函数的参数：对于一个标记了 inline 的内联函数，
 * 你可以对它的任何一个或多个函数类型的参数添加 noinline 关键字：
 *
 * 函数类型的参数，它本质上是个对象。我们可以把这个对象当做函数来调用，这也是最常见的用法：
 */
inline fun getData(method1: (String, String) -> String, method2: () -> Unit) {
    method1()
    println("getData方法执行")
    method2()
}

/**
 * 同时我们也可以把它当做对象来用。比如把它当做返回值：
 * 但当我们把函数进行内联的时候，它内部的这些参数就不再是对象了，
 * 因为他们会被编译器拿到调用处去展开。换句话说，对于编译之后的字节码来说，这个对象根本就不存在。
 * 一个不存在的对象，你怎么使用？也就没办法做返回值。
 *
 * 所以编译器会提示，加上noinline。noinline 是局部关闭内联优化，对method2关闭内联优化，保持它还是
 * 个对象的效果，才能做返回值
 */
inline fun getData2(method1: (String, String) -> String, noinline method2: () -> Unit): () -> Unit {
    method1()
    println("getData方法执行")
    return method2
}

inline fun refreshView(crossinline method1: () -> Unit){
    var runnable = object :Runnable{
        override fun run() {
            //Lambda 表达式里不允许使用 return，除非这个 Lambda 是内联函数的参数
            //规定：内联函数里的函数类型的参数，不允许这种间接调用（在一个Runnable中调用就属于间接调用），
            //如果真的需要间接调用，怎么办？使用 crossinline。可以间接调用了，但是同时也不允许在lambda
            //表达式中使用return了
            method1.invoke()
        }
    }
    Thread(runnable).start()
}