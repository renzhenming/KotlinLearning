fun main(args: Array<String>) {
    println(COLOR.RED.show())
    COLOR.BLUE.update(12,12,12)
    println(COLOR.BLUE.show())
}

enum class COLOR(var r: Int, var g: Int, var b: Int) {
    RED(255, 0, 0), GREEN(0, 0, 255), BLUE(0, 255, 0);

    fun show() {
        println("r = $r g = $g b = $b")
    }

    fun update(r: Int, g: Int, b: Int) {
        this.r = r
        this.g = g
        this.b = b
    }
}