fun main() {
    println(checkLogin("rzm","123"))
}

fun checkLogin(name: String, password: String): String {
    //takeIf后如果是true，则返回"欢迎 $name 登录成功"，false，返回"登录失败，用户未注册"
    return "欢迎 $name 登录成功".takeIf { checkUser(name, password) } ?: "登录失败，用户未注册"
}

fun checkUser(name: String, password: String): Boolean {
    return "rzm" == name && "123" == password
}
