import kotlin.reflect.KProperty

fun main(args: Array<String>) {
    val d = Daughter()
    //姥爷给了1000压岁钱
    d.压岁钱 = 1000   //因为委托给了Mother，所以赋值的时候会执行Mother的setValue方法，
    //实际收到的压岁钱
    println(d.压岁钱) //同样会走Mother的getValue方法

}

class Daughter {
    var 压岁钱: Int by Mother()
    var 买衣服: Int by Brother()
}

class Brother{
    operator fun getValue(daughter: Daughter, property: KProperty<*>): Int {
       return 0
    }

    operator fun setValue(daughter: Daughter, property: KProperty<*>, i: Int) {

    }
}

class Mother {
    operator fun getValue(daughter: Daughter, property: KProperty<*>): Int {
        println("daughter = $daughter property = $property")
        return 女儿的压岁钱
    }

    operator fun setValue(daughter: Daughter, property: KProperty<*>, i: Int) {
        println("daughter = $daughter property = $property i = $i")
        女儿的压岁钱 += 50
        收取的回扣 += i - 50
    }

    var 女儿的压岁钱 = 0
    var 收取的回扣 = 0
}