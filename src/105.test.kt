//var flag = true
//
//
////程序并没有像我们所期待的那样，在一秒之后，退出，而是一直处于循环中。
////给 flag 加上 volatile 关键修饰:
//fun main() {
//    Thread {
//        Thread.sleep(1000)
//        flag = false
//    }.start()
//    while (flag) {
//    }
//}



//TODO 加上volatile，可以正常退出了
//没有用 volatile 修饰 flag 之前，改变了不具有可见性，一个线程将它的值改变后，另一个线程却 “不知道”，
// 所以程序没有退出。当把变量声明为 volatile 类型后，编译器与运行时都会注意到这个变量是共享的，
// 因此不会将该变量上的操作与其他内存操作一起重排序。volatile 变量不会被缓存在寄存器或者对其他处理器不可见的地方，
// 因此在读取volatile类型的变量时总会返回最新写入的值。

//@Volatile
//var flag = true
//fun main() {
//    Thread {
//        Thread.sleep(1000)
//        flag = false
//    }.start()
//    while (flag) {
//    }
//}
//TODO 加上一行打印，可以正常退出了
//查看 println() 源码，最终发现，里面有同步代码块，
//那么问题来了，synchronized 到底干了什么。。
//按理说，synchronized 只会保证该同步块中的变量的可见性，发生变化后立即同步到主存，
// 但是，flag 变量并不在同步块中，实际上，JVM对于现代的机器做了最大程度的优化，也就是说，
// 最大程度的保障了线程和主存之间的及时的同步，也就是相当于虚拟机尽可能的帮我们加了个volatile，
// 但是，当CPU被一直占用的时候，同步就会出现不及时，也就出现了后台线程一直不结束的情况。
var flag = true
fun main() {
    Thread {
        Thread.sleep(1000)
        flag = false
    }.start()
    while (flag) {
        println("-------")
    }
}