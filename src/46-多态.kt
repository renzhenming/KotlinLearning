fun main(args: Array<String>) {
//    val animal:Animal = Dog()
    val animal:Animal = Cat()
    animal.singing()
}

abstract class Animal{
    //如果不是abstract方法，那么必须加上open关键字才能被子类重写，不然就是final类型
    open fun singing(){
        println("动物在歌唱")
    }
}

class Cat:Animal(){
    override fun singing(){
        println("猫在唱歌")
    }

}

class Dog:Animal(){
    override fun singing() {
        println("狗在唱歌")
    }
}