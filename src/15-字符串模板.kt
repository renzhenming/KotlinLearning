fun main(args: Array<String>) {
    var place = "故宫"
    var time = "5"
    whatToDo(place,time)
}

fun whatToDo(place: String, time: String) {
    val resul = "早上起来我去${place}跑步了${time}分钟，还做了${thing()}这件事"
    println(resul)
}

fun thing(): String {
    return "广播操"
}
