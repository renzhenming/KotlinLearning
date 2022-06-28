fun main() {

    create {
        "你是谁"
        "我是谁"
        "哈哈，你是傻瓜"
    }.map {
        "你说谁是傻瓜 $this"
    }.map {
        "$this,滚，你才是傻瓜"
    }.observer {
        println(it)
    }
}

class RxJava<R>(var itemInput: R)

fun <INPUT> RxJava<INPUT>.observer(observerCall: (INPUT) -> Unit): Unit {
    observerCall(itemInput)
}

fun <OUTPUT, INPUT> RxJava<INPUT>.map(mapCll: INPUT.() -> OUTPUT): RxJava<OUTPUT> {
    return RxJava(mapCll(itemInput))
}

inline fun <OUTPUT> create(createCall: () -> OUTPUT): RxJava<OUTPUT> {
    return RxJava(createCall())
}

