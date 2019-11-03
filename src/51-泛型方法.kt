fun main(args: Array<String>) {
    val obj = Clazz()
    obj.parce(1)
    obj.parce(true)
}

class Clazz {
    fun <T> parce(t: T): T {
        return when (t) {
            is Int -> {
                println("Int")
                t
            }
            is Boolean -> {
                println("Boolean")
                t
            }
            else ->
                t
        }
    }
}