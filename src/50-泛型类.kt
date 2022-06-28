fun main(args: Array<String>) {
    val box = Box<String>("哈哈")
    println(box.thing)
    val box2 = Box<Int>(2)
    println(box2.thing)

    val box4 = MagicBox<Fruit>(Orange())
}

open class Box<R>(var thing: R)  //物品类型不确定，定义泛型

//创建一个箱子，存放的东西不确定，指定什么就放什么
//在定义类的时候就指定类型Fruit
class MagicBox<T>(t: T) : Box<T>(t)

abstract class Fruit
class Orange : Fruit()