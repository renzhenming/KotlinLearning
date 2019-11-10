fun main(args: Array<String>) {

    val list = ArrayList<Vegetable>()
    val list2 = ArrayList<Tomato>()
    val list3 = ArrayList<Thing>()
    setFruitList(list)
    //我们的目的是可以接收Vegetable及其子类，但实际上只能接收Vegetable
    //setFruitList(list2)

    //那么如何做到可以接收Vegetable及其子类
    setFruitList2(list2)

    //如何接收Vegetable及其父类
    setFruitList3(list3)

}
/**
 * 定义一个方法可以接收Fruit类型的ArrayList
 */
fun setFruitList(list:ArrayList<Vegetable>){
    for (fruit in list) {
        println(fruit)
    }
}

/**
 * 可以接收Vegetable及其子类，相当于Java中fun setFruitList2(list:ArrayList<? extends Vegetable>)
 */
fun setFruitList2(list:ArrayList<out Vegetable>){
    for (fruit in list) {
        println(fruit)
    }
}

/**
 * 可以接收Vegetable及其父类,相当于Java中fun setFruitList2(list:ArrayList<? super Vegetable>)
 */
fun setFruitList3(list:ArrayList<in Vegetable>){
    for (fruit in list) {
        println(fruit)
    }
}

abstract class Thing

abstract class Vegetable:Thing()

class Tomato :Vegetable()

class Potato:Vegetable()