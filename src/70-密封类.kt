fun main(args: Array<String>) {
    val son1 = King.Son1
    println(canBeNextKing(son1))
    val son2 = King.Son2
    println(canBeNextKing(son2))
}

fun canBeNextKing(king: King): Boolean {
    return when (king) {
        is King.Son1 -> true
        else -> false
    }
}


/**
 * 密封类可以看作是一个枚举
 */
sealed class King {
    object Son1 : King()
    object Son2 : King()
    object Son3 : King()
    class Son4 : King()
}