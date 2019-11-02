fun main(args: Array<String>) {
    val chineses = Chineses()
    chineses.language = "无语"
    println(chineses.language)
    chineses.eat()
}

abstract class Human{
    //要么初始化，要么加abstract
    abstract var color:String
    abstract var language:String
    abstract fun eat()
}

class Chineses :Human(){
    override var color: String = ""
    override var language: String = ""

    override fun eat() {
        println("中国人吃饭")
    }

}