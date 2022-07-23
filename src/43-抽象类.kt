fun main(args: Array<String>) {
    val chineses = Chineses("蓝色", "英文")
    chineses.language = "无语"
    println(chineses.language)
    chineses.eat()
}

abstract class Human {
    //要么初始化，要么加abstract
    abstract var color: String
    abstract var language: String
    abstract fun eat()

    fun read() {
        println("读书")
    }
}

class Chineses(override var color: String, override var language: String) : Human() {

    override fun eat() {
        println("中国人吃饭")
    }

}

class English : Human() {
    override var color: String = ""
        get() = color
        set(value) {
            field = value
        }
    override var language: String = ""
        get() = language
        set(value) {
            field = if(value == "英语") "son" else "儿子"
        }

    override fun eat() {

    }

}