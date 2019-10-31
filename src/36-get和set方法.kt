fun main(args: Array<String>) {
    val person = Person()
    println(person.age)
    println(person.name)
}

/**
 * 转化为Java后会发现kotlin会自动添加get set方法，并且属性是私有的
 */
class Person{
    var name:String = "张三"
    var age:Int = 20
}