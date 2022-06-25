fun main() {
    println(checkLogin2("rzm", "124"))
}

fun checkLogin2(name: String, password: String): String {
    //takeIf后如果是true，则返回"欢迎 $name 登录成功"，false，返回"登录失败，用户未注册"
    return "欢迎 $name 登录成功".takeUnless { checkUserNotRegistered(name) } ?: "用户未注册"
}

fun checkUserNotRegistered(name: String): Boolean {
    return "rzm" != name
}
