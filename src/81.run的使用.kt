fun main() {


    /**
     * run:
     * 1.持有this
     * 2.返回最后一行
     */


    var str = "hello world, i am coming"
    str.run {
        //run持有this，以最后一行为返回值
        this.length < 5
    }.run {
        if (this) "this string's length is under 5" else "this string's length is over five"
    }.run {
        println(this)
    }

    //let也可以实现这个效果
    str.let {
        it.length < 5
    }.let {
        if (it) "this string's length is under 5" else "this string's length is over five"
    }.let {
        println(it)
    }

    //apply不行，因为apply返回值是调用者本身
}