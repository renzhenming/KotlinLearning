fun main(args: Array<String>) {

    val f = MeFather()
    f.wash()
}

interface Wash {
    fun wash()
}

class MySon : Wash {
    override fun wash() {
        println("儿子洗碗")
    }

}

//Wash能力委托给MySon
class MeFather : Wash by MySon()