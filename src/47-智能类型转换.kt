abstract class Animal2

class Chicken:Animal2(){
    fun daming(){
        println("鸡肉在唱歌")
    }

}

class HotDog:Animal2(){
    fun beichi() {
        println("热狗在唱歌")
    }
}

fun main(args: Array<String>) {
    val chicken:Animal2 = Chicken()
    val hotDog:Animal2 = HotDog()
    //抽象类中没有定义方法，所以这里不能像多态一样去调用，在Java中，需要判断类型
    //然后强制转换为对应的类对象才可以调用相应的方法，但是在kotlin中可以省去强转
    //这一步,这就是智能类型转换
    if (chicken is Chicken){
        chicken.daming()
    }
    if (hotDog is HotDog){
        hotDog.beichi()
    }
}