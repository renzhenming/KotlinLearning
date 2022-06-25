fun main() {


    var pass = "ABCDEFGHIJKLMN"
    println(pass)

    var jiamiPass = encrypt(pass)
    println("加密后 $jiamiPass")
    var jiemiPass = decrypt(jiamiPass)
    println("解密后：$jiemiPass")
}

fun encrypt(pass: String): String {
    return pass.replace(Regex("[A]]")) {
        when (it.value) {
            "A" -> "1"
            "B" -> "2"
            "C" -> "3"
            "D" -> "4"
            "E" -> "5"
            else -> it.value
        }
    }
}

fun decrypt(pass: String): String {
    return pass.replace(Regex("[12345]]")) {
        when (it.value) {
            "1" -> "A"
            "2" -> "B"
            "3" -> "C"
            "4" -> "D"
            "5" -> "E"
            else -> it.value
        }
    }
}