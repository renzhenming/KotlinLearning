fun main(args: Array<String>) {
    val testCompanion = TestCompanion()
    //伴生对象中的属性都是静态的
    println(TestCompanion.name)
    println(TestCompanion.age)

    //非静态变量，通过对象调用
    println(testCompanion.sex)
}


class TestCompanion{

    var sex = "男"

    companion object {
        var name = "李四"
        var age = 12
    }
}