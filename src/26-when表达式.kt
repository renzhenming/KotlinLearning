fun main(args: Array<String>) {
    val age = 18
    val what:String  = aimTo(age)
}

fun aimTo(age: Int): String {
    return when(age){
        3-> "上幼儿园"
        6-> "上小学"
        12-> "上中学"
        18-> "上大学"
        else -> "毕业"
    }
}

fun aimTo2(age:Int):String {
    when(age){
        3-> return "上幼儿园"
        6-> return "上小学"
        12-> return "上中学"
        18-> return "上大学"
        else -> return "毕业"
    }
}
fun aimTo3(age:Int):String {
    return when{
        age == 3-> "上幼儿园"
        age == 6-> "上小学"
        age == 12-> "上中学"
        age == 18-> "上大学"
        else -> "毕业"
    }
}