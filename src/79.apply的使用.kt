import java.io.File

fun main() {
    var file:File? = File("xxxx")

    //通常的匿名函数都持有一个it, 通过it来调用，但是apply 这个匿名函数不会持有it,而是持有当前对象的this
    //apply会返回对象本身，所以可以链式调用
    file?.apply {
        setReadOnly()
        setLastModified(1)
        setReadable(true)
        setWritable(true)
        println("apply执行完成")
    }?.apply {
        println(lastModified())
    }?.apply {
        println(absoluteFile)
    }
}