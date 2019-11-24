fun main(args: Array<String>) {
    val p = People()
    //成员方法一般调用方式
    p.sayHelloTo("张三")
    //加上中缀表达式后的调用方式，类似Range，Pair
    p sayHelloTo2 "李四"
}

/**
 * 中缀表达式作用让代码更加简洁易懂,还可以用来定义一些关键字 如 Range的to
 *
 * 使用条件：
 * 1.必须是成员函数
 * 2.必须只有一个参数
 * 3.参数不能是可变参数和默认参数
 */
class People{
    fun sayHelloTo(name:String){
        println("你好 ${name}")
    }

    infix fun sayHelloTo2(name:String){
        println("你好 ${name}")
    }
}