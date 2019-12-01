fun main(args: Array<String>) {
    println(SingleTon.instance.name)
}

//私有构造方法，防止创建对象
class SingleTon private constructor(){

    val name = "张三"

    companion object {
        //by lazy懒加载并且只会加载一次
        val instance by lazy {
            SingleTon()
        }
    }
}