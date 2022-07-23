fun main() {
    println(checkLogin2("rzm", "124"))
}

fun checkLogin2(name: String, password: String): String {
    //如果代码块predicate里面返回为false，则返回这个对象本身，否则返回空
    return "欢迎 $name 登录成功".takeUnless { checkUserNotRegistered(name) } ?: "用户未注册"
}

fun checkUserNotRegistered(name: String): Boolean {
    return "rzm" != name
}
