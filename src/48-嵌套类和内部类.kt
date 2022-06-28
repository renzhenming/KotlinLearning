fun main(args: Array<String>) {
    val inner1 = Outer.Inner()
    val inner2 = Outer().Inner2()
}

class Outer {
    val name = "张三"

    /**
     * kotlin中的嵌套类不同于Java，这种写法就相当于Java中的
     * 静态内部类，所以他是无法直接访问外部类的属性的
     */
    class Inner {
        fun sayname() {
            //println(name)
            println("")
        }
    }

    /**
     * 加上inner关键字后的内部类就和Java中的非静态内部类一样了
     */
    inner class Inner2 {
        fun sayname() {
            println(name)
        }
    }
}