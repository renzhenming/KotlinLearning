fun main(args: Array<String>) {
    println(COLOR.RED.r)
}

enum class COLOR(var r:Int,var g:Int,var b:Int){
    RED(255,0,0),GREEN(0,0,255),BLUE(0,255,0)
}