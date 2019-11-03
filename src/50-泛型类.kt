fun main(args: Array<String>) {
    val box = Box<String>("哈哈")
    println(box.thing)
    val box2 = Box<Int>(2)
    println(box2.thing)

    val box3 = FruitBox(Apple())

    val box4 = MagicBox<Fruit>(Orange())
}

open class Box<R>(var thing:R)  //物品类型不确定，定义泛型

//创建一个存放水果的箱子，具体哪种水果不确定，那么哪种都可以装，使用泛型
//这个箱子只能装水果
class FruitBox(fruit: Fruit):Box<Fruit>(fruit)

//创建一个箱子，存放的东西不确定，指定什么就放什么，所以就不能像上边一样
//在定义类的时候就指定类型Fruit
class MagicBox<T>(t:T):Box<T>(t)

abstract class Fruit

class Apple:Fruit()

class Orange:Fruit()