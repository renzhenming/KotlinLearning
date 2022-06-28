fun main(args: Array<String>) {
    val person = Person()
    println(person.age)
    println(person.name)
    person.age = 12
    println(person.age)
}

/**
 * 转化为Java后会发现kotlin会自动添加get set方法，并且属性是私有的
 */
class Person {
    var name: String = "张三"
        set(value) {
            field = "${value}的爸爸"
        }
        get() = if (field.isNullOrEmpty()) "null" else field
    var age: Int = 20
        set(value) {
            field += value
        }
        get() = if (field < 0) 0 else field
}