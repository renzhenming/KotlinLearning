fun main(args: Array<String>) {

    val f = TomFather(Jone())
    f.wash()

}

interface Clean {
    fun wash()
}

class Jone : Clean {
    override fun wash() {
        println("jone洗碗")
    }

}

//这个时候后边的by wash似乎就没有存在的必要了，去掉也一样
class TomFather(var wash: Clean) : Clean by wash {
    override fun wash() {

        println("付钱亿元")
        wash.wash()
        println("good")
    }
}