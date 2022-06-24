fun main(args: Array<String>) {
    sendRequest(path = "https://www.xxx.com")
    sendRequest("https://www.xxx.com")
    //在调用时指定参数名使得形参列表的顺序可以任意指定
    sendRequest(method = "GET", path = "https://www.xxx.com")
    method1()
    method2("男")
}

//method是默认参数方式添加，默认为GET
fun sendRequest(path: String, method: String = "GET") {
    println("请求路径：${path},请求方式：${method}")
}

fun method1(name: String = "占三", age: Int = 12): String {
    println(name + age)
    return name
}

fun method2(sex: String, name: String = "占三", age: Int = 12): String {
    println(name + age + sex)
    return name
}