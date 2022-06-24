fun main(args: Array<String>) {
    val age = 18
    val what: String = aimTo(age)
}

fun aimTo(age: Int): String {

    var age = when (age) {
        10 -> {
            "一般"
        }
        20 -> {

        }
        else -> {

        }
    }

    return when (age) {
        3 -> "上幼儿园"
        6 -> "上小学"
        12 -> "上中学"
        18 -> "上大学"
        else -> "毕业"
    }
}

fun aimTo2(age: Int): String {
    return when (age) {
        3 -> "上幼儿园"
        6 -> "上小学"
        12 -> "上中学"
        18 -> "上大学"
        else -> "毕业"
    }
}

fun aimTo3(age: Int): String {
    return when (age) {
        3 -> "上幼儿园"
        6 -> "上小学"
        12 -> "上中学"
        18 -> "上大学"
        else -> "毕业"
    }
}

fun check(number: Int) {
    when (number) {
        in 10..59 -> {
            println("不及格")
        }
        in 60..70 -> {
            println("及格")
        }
        in 70..100 -> {
            println("优秀")
        }
        else -> {
            TODO("发生异常")
        }
    }
}