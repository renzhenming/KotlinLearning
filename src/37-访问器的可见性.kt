fun main(args: Array<String>) {
    val person = Person2()
    person.age = 30
//    person.name = "尖峰时刻"
    println(person.age)
    println(person.name)

    //无法修改也就是无法调用set赋值
    //person.sex = "女"
    println(person.sex)
}

/**
 * 转化为Java后会发现kotlin会自动添加get set方法，并且属性是私有的
 */
class Person2 {
    var name: String = "张三"
        private set
    var age: Int = 20
        public set

    var sex = "男"
        private set  //私有了他上边一行这个变量的set方法，转为Java会发现set方法加了private
}