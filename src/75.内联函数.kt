fun main() {
    //转成java后，  register("rzm", "", (Function2)null.INSTANCE);
    register("rzm", "") { msg, code ->
        println(msg)
    }

    register2("rzmm", "") { msg, code ->
        println(msg)
    }

    register3("","")
}

/**
 * 转成java后，  register("rzm", "", (Function2)null.INSTANCE);
 */
fun register(name: String, password: String, callbackFun: (String, Int) -> Unit) {
    if ("rzm" == name) {
        callbackFun("success", 200)
    } else {
        callbackFun("fail", 100)
    }
}

/**
 *
 * 转成java后直接将方法体插入了调用处
 *
 * 函数如果使用了lambda作为参数，那么这个函数应该添加inline关键字，声明为内联函数后
 * 相当于C++的 #define 宏定义 宏替换，会把代码替换到调用处，调用处没有任何函数开辟
 *
 * 如果使用了lambda作为参数却没有定义为内联函数，会在调用端生成对象来完成函数调用
 * 如：register("rzm", "", (Function2)null.INSTANCE);
 * 会造成性能损耗
 *
 *
 * String name$iv = "rzmm";
String password$iv = "";
int $i$f$register2 = false;
boolean code;
String msg;
boolean var5;
if (Intrinsics.areEqual("rzm", name$iv)) {
code = true;
msg = "success";
var5 = false;
System.out.println(msg);
} else {
code = true;
msg = "fail";
var5 = false;
System.out.println(msg);
}
 */
inline fun register2(name: String, password: String, callbackFun: (String, Int) -> Unit) {
    if ("rzm" == name) {
        callbackFun("success", 200)
    } else {
        callbackFun("fail", 100)
    }
}

/**
 * 普通函数声明为内联函数，也会在调用端直接进行代码替换，但是性能优化有限，通常
 * 内联函数只在有lambda表达式做参数时使用
 */
inline fun register3(name: String, password: String) {

}