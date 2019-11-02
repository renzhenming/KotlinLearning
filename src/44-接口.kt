fun main(args: Array<String>) {
    val chineses = Chineses2()
    chineses.language = "无语"
    println(chineses.language)
    chineses.eat()
    chineses.doShopping()
    chineses.toTravel()
    println(chineses.travelNum)
}

abstract class Human2{
    //要么初始化，要么加abstract
    abstract var color:String
    abstract var language:String
    abstract fun eat()
}

interface Travel{
    //字段也需要被继承
    val travelNum:Int
    fun toTravel()
}

interface Shopping{
    fun doShopping()
}

/**
 * 单继承，多实现
 */
class Chineses2 :Human2(),Travel,Shopping{
    override val travelNum: Int
        get() = 1


    override fun doShopping() {
        println("中国人爱购物")
    }

    override fun toTravel() {
        println("中国人爱旅行")
    }

    override var color: String = ""
    override var language: String = ""

    override fun eat() {
        println("中国人吃饭")
    }

}