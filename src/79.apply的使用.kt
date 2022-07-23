import java.io.File

fun main() {
    var file: File? = File("xxxx")

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

    "123".myapply {

    }.myapply {

    }
}

//手写apply

//R.() 表示持有的参数是this, callback 没有返回值，apply执行后，方法返回值是调用者本身
inline fun <R> R.myapply(callback: R.() -> Unit): R {
    callback(this)
    return this
}

inline  fun <R> R.myApply2(callback:R.()->Unit):R{
    callback(this)
    return this
}