fun main() {
    val androidClickListener = AndroidClickListener<String>()
    androidClickListener.clickEvent()

    androidClickListener.addListeners("key1") {
        println("listener $it 执行click")
    }

    androidClickListener.addListeners("key2") {
        println("listener $it 执行click")
    }

    androidClickListener.addListeners("key3") {
        println("listener $it 执行click")
    }

    androidClickListener.addListeners("key4") {
        println("listener $it 执行click")
    }

    androidClickListener.addListeners("key out", ::listener)

    androidClickListener.clickEvent()
}

fun <R> listener(r: R) {
    println("out listener $r click")
}

class AndroidClickListener<T> {
    val actions = mutableListOf<(T) -> Unit>()
    val keys = mutableListOf<T>()

    fun addListeners(key: T, listener: (T) -> Unit) {
        if (!actions.contains(listener)) {
            actions += listener
            keys += key
        }
    }

    fun clickEvent() {
        if (actions.isEmpty()) {
            println("还没有添加过监听")
            return
        }
        actions.forEachIndexed { index, listener ->
            listener.invoke(keys[index])
        }
    }
}