fun main() {

    //子类范型赋值给父类范型
    var p1: Producer<Animals> = ProducerClass()
    var p2: Producer<Animals> = ProducerClass2()
    var p3: Producer<Animals> = ProducerClass3()
    var p4: Producer<Animals> = ProducerClass4()


    //父类范型赋值给子类范型
    var q1: Consumer<ChineseMan> = ConsumerClass()
    var q2: Consumer<ChineseWoman> = ConsumerClass2()
}

//在这里的作用相当于java中的<? extends T>
interface Producer<out T> {

    //协变 out类型的范型只能读不能写，只能做返回值，不能做输入
    fun getAnimals(): T
}

//相当于java中的<? super T>
interface Consumer<in T> {

    //协变 in类型的范型只能写不能读，只能做输入，不能做返回
    fun getAnimals(t: T)
}

open class Animals
open class HumanBeing : Animals()
open class ChineseMan : HumanBeing()
open class ChineseWoman : HumanBeing()


class ConsumerClass : Consumer<Animals> {

    override fun getAnimals(t: Animals) {
        println("消费者Animal")
    }
}

class ConsumerClass2 : Consumer<HumanBeing> {
    override fun getAnimals(t: HumanBeing) {
        println("消费者HumanBeing")
    }
}

class ConsumerClass3 : Consumer<ChineseMan> {
    override fun getAnimals(t: ChineseMan) {
        println("消费者ChineseMan")
    }
}

class ConsumerClass4 : Consumer<ChineseWoman> {
    override fun getAnimals(t: ChineseWoman) {
        println("消费者ChineseWoman")
    }
}


class ProducerClass : Producer<Animals> {
    override fun getAnimals(): Animals {
        println("生产者Animal")
        return Animals()
    }
}

class ProducerClass2 : Producer<HumanBeing> {
    override fun getAnimals(): HumanBeing {
        println("生产者HumanBeing")
        return HumanBeing()
    }
}

class ProducerClass3 : Producer<ChineseMan> {
    override fun getAnimals(): ChineseMan {
        println("生产者ChineseMan")
        return ChineseMan()
    }
}

class ProducerClass4 : Producer<ChineseWoman> {
    override fun getAnimals(): ChineseWoman {
        println("生产者ChineseWoman")
        return ChineseWoman()
    }
}