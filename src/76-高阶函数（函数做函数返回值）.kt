fun main() {
    var logout = logout("电风扇", 12)
    println(logout("dfsj", "we"))
}


fun logout(name: String, age: Int): (String, String) -> String {
    println("$name $age");
    return { name: String, age: String ->
        "$name,$age who is comming?"
    }
}

inline fun login(name: String, age: Int): (String, String) -> String {
    println("$name $age");
    return { name: String, age: String ->
        "$name,$age who is comming?"
    }
}