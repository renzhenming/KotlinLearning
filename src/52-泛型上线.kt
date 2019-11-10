fun main(args: Array<String>) {
    val teacher = MiddleTeacher()
    val teacher2 = Teacher2()
    val classOne = ClassOne(teacher)
    val classOne2 = ClassOne(teacher2)

    val classTwo = ClassTwo(teacher)
    //这里报错，因为teacher2不是Teacher的子类
    //val classTwo2 = ClassTwo(teacher2)
}

class Teacher2

abstract class Teacher

class MiddleTeacher:Teacher()

class HighTeacher:Teacher()

/**
 * 这里泛型定义的可以装任何对象
 */
class ClassOne<T>(teacher:T){

    fun print(){

    }
}

/**
 * 这里定义了泛型上限，指定必须是Teacher或其子类
 */
class ClassTwo<T:Teacher>(teacher:T){

    fun print(){

    }
}