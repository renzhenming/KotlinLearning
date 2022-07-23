fun main(args: Array<String>) {

    val f = MeFather1()
    f.wash()

    //这样写法就更像代理模式了
    val f2 = MeFather3(MySon2())
    f2.wash()

    val f3 = MeFather3(MyWife())
    f3.wash()

    var ff = MeFather2()
    ff.wash()
}

interface Wash2 {
    fun wash()
}

class MySon2 : Wash2 {
    override fun wash() {
        println("儿子洗碗")
    }

}

class MyWife : Wash2 {
    override fun wash() {
        println("妻子洗碗")
    }

}

class MeFather1 : Wash {
    override fun wash() {
        println("MeFather1 洗碗")
    }
}

//Wash能力委托给MySon
class MeFather2 : Wash2 by MySon2()

//Wash能力委托给所有实现Wash2接口的对象,只要是实现了接口的对象都可以使用
class MeFather3(var wash: Wash2) : Wash2 by wash