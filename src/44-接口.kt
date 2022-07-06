fun main(args: Array<String>) {
    val chineses = Chineses2("红色", "中文", 2)
    chineses.other()
    chineses.eat()
    chineses.doShopping()
    chineses.toTravel()
    println(chineses.travelNum)
    println(chineses.language)
    println(chineses.color)
}

abstract class Human2 {
    //要么初始化，要么加abstract
    abstract var color: String
    abstract var language: String
    abstract fun eat()
}

interface Travel {
    //字段也需要被继承
    val travelNum: Int
    fun toTravel()
}

interface Shopping {
    fun doShopping()

    fun other(){
        println("other")
    }
}

/**
 * 单继承，多实现
 */
class Chineses2(override var color: String, override var language: String, override val travelNum: Int) : Human2(),
    Travel, Shopping {

    override fun eat() {
        println("eat")
    }

    override fun toTravel() {
        println("toTravel")
    }

    override fun doShopping() {
        println("doShopping")
    }
}