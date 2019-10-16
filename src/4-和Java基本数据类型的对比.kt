fun main(args: Array<String>) {
    //kotlin中没有包装类的概念，可以直接通过基本数据类型调用
    //Java中包装类才能调用的方法，kotlin是对Java的封装，转为Java可以看到
    //仍然是使用了Integer包装类
    var a:Int = 10
    var b:Int = a+10
    val hashCode:Int = a.hashCode()
    println(hashCode)
}