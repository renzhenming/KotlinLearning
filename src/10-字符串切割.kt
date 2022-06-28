fun main(args: Array<String>) {
    val str = "今天|明天|后天"
    var split: List<String> = str.split("|")
    println(split)

    val str2 = "今天|明天=后天"
    var split1: List<String> = str2.split("|", "=")
    println(split1)

    val path = "/Users/renzhenming/desktop/admin/path"
    //截取前六个字符
    println(path.substring(0, 6))
    println(path.substring(0..5))
    //截取第一个r之前的字符
    println(path.substringBefore("r"))
    //截取最后一个r之前的字符
    println(path.substringBeforeLast("r"))
    //截取第一个r之后的字符
    println(path.substringAfter("r"))
    //截取最后一个r之后的字符
    println(path.substringAfterLast("r"))
}