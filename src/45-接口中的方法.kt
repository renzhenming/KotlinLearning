fun main(args: Array<String>) {
    val chineses = Chineses3()
    chineses.doSomeThing()
}

/**
 * 和Java不同，接口中的方法可以有方法体，实现类可以不必重写这个方法，
 * 而使用默认的方法体
 */
interface HH {
    fun doSomeThing() {
        println("默认方法体，可以不被继承")
    }
}

class Chineses3 : HH {
    override fun doSomeThing() {
        super.doSomeThing()
    }
}