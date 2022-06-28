import com.sun.xml.internal.fastinfoset.util.StringArray
import java.io.File

fun main(args: Array<String>) {
    val arr1 = arrayOf(100,200,300)
    val arr2 = arrayOf('a','b','c')
    val arr3 = arrayOf("张三",12,false)
    val arr4 = IntArray(10) //初始化size = 10
    val arr5 = IntArray(10){//初始化size = 10,初始值为0
        0
    }
//    BooleanArray
//    LongArray
//    CharArray
//        ....
//    StringArray

    var interArray = IntArray(10)
    interArray[0] = 1
    interArray[1] = 2
    interArray[2] = 3
    interArray[3] = 4
    println(interArray[0])
    println(interArray[1])
    println(interArray[2])
    println(interArray[3])
    //println(interArray[10])  数组越界
    println(interArray.elementAtOrElse(10) { -1 })
    println(interArray.elementAtOrNull(10))

    //对象数组
    var arrayOf = arrayOf(File(""), File(""), File(""))
    println(arrayOf)
}