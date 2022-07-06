fun main(args: Array<String>) {
    //两个int值可以相加减，那么两个对象怎么相加减？
    var man1 = Man("李四", 30)
    var man = Man("张龙", 23)
    var man2 = man + man1
    println(man2.name)
    println(man2.age)
}

class Man(var name: String, var age: Int) {
    /**
     * 运算符重载需要找到运算符对应的方法，如+号对应的方法就是plus
     * kotlin和C++运算符重载不一样，C++可以直接operator+()这样写
     * kotlin只能写方法名
     *
     * 要查看一个类可以重载哪些方法，可以通过operator fun 类名. 会自动提示
     */
    operator fun plus(man: Man): Man {
        var temp = Man("", 0)
        temp.age = this.age + man.age
        temp.name = this.name + man.name
        return temp
    }

    operator fun not() {

    }

    operator fun Man.minus(man: Man): Man {
        return Man("", 1);
    }
}