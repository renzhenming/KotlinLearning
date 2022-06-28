fun main(args: Array<String>) {

}

//kotlin的类都是final类型，不能被继承，需要加上open关键字
open class Father {
    open var name: String = "张三"
    open var age: Int = 20

    open fun heshui() {
        println("father 爱喝水")
    }
}

//Father类有一个默认构造函数，需要被调用，加上括号
class Son : Father() {

    //通过override关键字覆盖父类中的同名字段，但是在父类中默认这个字段
    //不能被覆盖，需要加上open关键字,
    override var name: String = "张三"
    override var age: Int = 20

    //同样，方法也需要被加上open才能重写，重写的一方必须加上override
    override fun heshui() {

    }
}