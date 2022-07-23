fun main(args: Array<String>) {
    val inner = Outer2().Inner3()
    inner.sayname()
}

class Outer2 {
    val name = "张三"
    var age = 12

    class Inner4 {
        fun go(){
            //访问不到
//            println(name)
        }
    }

    inner class Inner3 {
        val name = "李四"
        var age = 13
        fun sayname() {
            println(name)

            //访问外部类属性，等同于Java中的Outer2.this.name
            println(this@Outer2.name)
            println(age)

            println(this@Outer2.age)
        }
    }
}