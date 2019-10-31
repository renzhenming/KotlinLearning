fun main(args: Array<String>) {
    val person = Person3()
    person.age = 30

    println(person.age)

    val person2 = Person3()
    person2.age = 300
    println(person2.age)
}

/**
 * 转化为Java后会发现kotlin会自动添加get set方法，并且属性是私有的
 */
class Person3{
    var name:String = "张三"

    //控制年龄的输入不能超过150
    var age:Int = 20
    set(value) {
        field = if (value <= 150){
            //这样调用发生了Exception in thread "main" java.lang.StackOverflowError ？
            //转化为Java代码会发现这样其实是在递归调用给age设置值并且没有跳出递归的条件
            //this.age = value

            //那么应该怎么设置,如下，给内置字段field赋值即可
            value
        }else{
            0
        }
    }

    //性别一经设定不能修改
    var sex = "男"
        private set  //私有了他上边一行这个变量的set方法，转为Java会发现set方法加了private
}