fun main(args: Array<String>) {
    val week = WEEK.Sunday
    println(todo(week))
}
fun todo(week:WEEK){
    when(week){
        in WEEK.Monday..WEEK.Friday->
            println("上班")
        in WEEK.Saturday..WEEK.Sunday ->
            println("休息")
    }
}

enum class WEEK{
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}