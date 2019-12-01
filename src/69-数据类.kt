fun main(args: Array<String>) {
    val new = News("标题","内容","图片","时间")
    println(new.title)
    println(new.desc)
    println(new.image)
    println(new.time)
    println(new.component1())
    println(new.component2())
    println(new.component3())
    println(new.component4())

    val(title,des,image,time) =  News("标题","内容","图片","时间")
    println(title)
}

/**
 * kotlin使bean对象的创建更加容易，可以创建一个文件，然后把所有的bean类都这样写在这个文件中
 */
data class News(var title:String,var desc:String,var image:String,var time:String)
data class Another(var title:String,var desc:String,var image:String,var time:String)
data class Other(var title:String,var desc:String,var image:String,var time:String)