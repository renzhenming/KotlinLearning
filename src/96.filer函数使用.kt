import kotlin.concurrent.timer

fun main() {
    var list = listOf<List<String>>(
        listOf<String>("章三", "a里斯", "王武"), listOf<String>("azz", "aa", "ff"), listOf<String>("fds", "a发送到", "唯粉")
    )

    //过滤
    var newList = list.flatMap { it ->
        it.filter {
            it.startsWith("a")
        }
    }
    println(newList)


    //将集合中的"章三"刷选保留
    var listOf = listOf<String>("章三", "a里斯", "王武")
    var filter = listOf.filter {
        it == "章三"
    }
    println(filter)
}