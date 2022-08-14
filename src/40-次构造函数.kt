import java.net.ProtocolFamily

fun main(args: Array<String>) {
    var n = Nothing("张三", 31)
    println(n.age)

    var m = Nothing("李四", 43, 110)
//    println(m.phone) //此构造函数中定义的新字段无法调用，何解？次构造函数中
    //不能像主构造函数那样在字段前加var,所以必须声明变量接收才行

    //然后就可以调用了
    println(m.phone)

    var m3 = Manager("章三", "男", "中国")

    //每个构造函数中都包括参数的时候，默认调用的是主构造函数
    var m4 = Manager2()
}

class Nothing(var name: String, var age: Int) { //必须要有的属性

    var sex: String = ""
    var phone: Int = 0

    //次构造函数，必须要调用主构造函数
    constructor(name: String, age: Int, phone: Int) : this(name, age) {
        this.phone = phone
    }

    constructor(name: String, age: Int, sex: String) : this(name, age) {
        this.sex = sex
    }

    constructor(
        name: String, age: Int, sex: String, national: String, from: String, family: ProtocolFamily
    ) : this(name, age) {

    }
}

class Manager(_name: String, _sex: String) {
    var name = _name
    var sex = _sex

    init {
        println("Manager主构造函数被调用了")
    }

    constructor(name: String, sex: String, age: Int) : this(name, sex) {
        println("次构造函数1 name=$name sex=$sex age=$age")
    }

    constructor(name: String, sex: String, from: String) : this(name, sex) {
        println("次构造函数2 name=$name sex=$sex from=$from")
    }
}

//构造函数中也可以使用默认参数
class Manager2(_name: String = "lisi", _sex: String = "男") {

    var name: String
    var sex: String

    init {
        println("Manager2主构造函数被调用了")
        require(!_name.isNullOrEmpty())
        require(!_sex.isNullOrEmpty())
        this.name = _name
        this.sex = _sex
    }

    constructor(name: String = "zs", sex: String = "女", age: Int = 12) : this(name, sex) {
        println("次构造函数1 name=$name sex=$sex age=$age")
    }

    constructor(name: String = "ww", sex: String = "男", from: String = "chnia") : this(name, sex) {
        println("次构造函数2 name=$name sex=$sex from=$from")
    }
}