import javax.rmi.CORBA.Util

fun main(args: Array<String>) {
    println(Utils.name)
    println(Utils.getRandom())
}

/**
 * object类型的类在kotlin中就是单例类型
 * 并且object类中所有属性都是静态的，方法不是静态的
 *
 * 存在的问题：object单例适用于成员变量不多的情况，因为如果很多成员变量，又都是
 * 静态的，就会比较消耗内存，解决方案是伴生对象实现单例
 */
object Utils{
    var name = "张三"
    var age = 20

    fun getRandom():String{
        return name
    }
}