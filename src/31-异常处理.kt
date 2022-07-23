import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream

fun main(args: Array<String>) {
    var i = 10
    var j = 0

    //运行时异常和Java相同
    try {
        var k = i / j
    } catch (e: Exception) {
        println("捕获到异常")
    } finally {
        println("最终执行的代码")
    }
    //kotlin中没有编译时异常

    //这两段代码如果在Java中编译器是会报错的，但是kotlin不会

    //运行后报错
    //Exception in thread "main" java.io.FileNotFoundException: path:\xxx (文件名、目录名或卷标语法不正确。)
    val path = File("path:///xxx")
    val stream = FileInputStream(path) //kotlin没有编译时异常
}

fun copyFile(){
    //没有异常提醒
    var inputStream = FileInputStream(File(""))
    var outputStream = FileOutputStream(File(""))
}