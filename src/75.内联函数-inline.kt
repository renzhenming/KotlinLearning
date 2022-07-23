import kotlin.concurrent.thread

fun main() {
    //转成java后，  register("rzm", "", (Function2)null.INSTANCE);
    register("rzm", "") { msg, code ->
        println(msg)
    }

    println("=========================================")

    /**
     * inline 关键字不止可以内联自己的内部代码，还可以内联自己内部的内部的代码，
     * 意思是什么呢，就是你的函数在被加了 inline 关键字之后，编译器在编译时不仅会把函数内联过来，
     * 而且会把它内部的函数类型的参数——那就是那些 Lambda 表达式——也内联过来。换句话说，
     * 这个函数被编译器贴过来的时候是完全展开铺平的：
     */

    register2("rzmm", "") { msg, code ->
        println(msg)
    }

    println("=========================================")

    register3("","")
}

/**
 * 转成java后，  register("rzm", "", (Function2)null.INSTANCE);
 *
 * 因为 Java 并没有对函数类型的变量的原生支持，Kotlin 需要想办法来让这种自己新引入的概念在 JVM 中落地。
 * 而它想的办法是什么呢？就是用一个 JVM 对象来作为函数类型的变量的实际载体，让这个对象去执行实际的代码。
 * 也就是说，在我对代码做了刚才那种修改之后，程序在每次调用 register() 的时候都会创建一个对象来执行
 * Lambda 表达式里的代码，虽然这个对象是用一下之后马上就被抛弃，但它确实被创建了。
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

//crossinline
//inline 关键字不止可以内联自己的内部代码，还可以内联自己内部的内部的代码。什么叫「内部的内部」？就是自己的函数类型的参数。
inline fun test(f: () -> Unit) {
//    thread {
//        f()
//    }
}

inline fun test2(crossinline f: () -> Unit) {
    thread {
        f()
    }
}

inline fun test3(crossinline f: () -> Unit) {
    thread{ f() }
}

inline fun test4(noinline f: () -> Unit) {
    thread { f() }
}