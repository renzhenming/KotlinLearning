fun main() {
    var nameList = listOf<String>("章三", "a里斯", "王武")
    var ageList = listOf<Int>(12, 14, 15)

    var zip = nameList.zip(ageList)
    println(zip)
}