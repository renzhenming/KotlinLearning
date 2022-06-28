fun main(args: Array<String>) {

    var a = SingleTon2.getInstance()
    var b = SingleTon2.getInstance()
    var c = SingleTon2.getInstance()
    println(a)
    println(b)
    println(c)

    var cc = SingleTon.mInstance
    var dd = SingleTon.mInstance
    var ee = SingleTon.mInstance

    println(cc)
    println(dd)
    println(ee)
}

//私有构造方法，防止创建对象
open class SingleTon {

    companion object {
        val mInstance: SingleTon by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            SingleTon()
        }
    }
}

open class SingleTon2 {

    companion object {
        private var mInstance: SingleTon2? = null
            get() {
                if (field == null) {
                    field = SingleTon2()
                }
                return field
            }

        fun getInstance() = mInstance!!
    }
}

object Student2 {
    fun showName() {

    }

    fun dowork() {

    }
}