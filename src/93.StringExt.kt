fun String.toIntArray(): IntArray {
    var toCharArray = this.toCharArray()

    var intArr = IntArray(toCharArray.size)

    toCharArray.forEachIndexed { index, c ->
        if (Character.isDigit(c)) {
            intArr[index] = c.toInt()
        }
    }
    return intArr
}

fun String.abcdefghigklmnopq(){
    println("abcdefghigklmnopq")
}