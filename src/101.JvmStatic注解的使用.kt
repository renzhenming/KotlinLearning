fun main() {
    println(MyKotlinStatic.mClassName)
    println(MyKotlinStatic.showTips())

    //在java中怎么调？都要通过Companion这个类，见类JavaFileTest
}

class MyKotlinStatic {
    companion object {

        //转java后，私有化，并提供get函数
        val mClassName = "MyKotlinStatic"

        fun showTips() {
            println("showTips method")
        }
    }
}

class MyKotlinStatic2 {
    companion object {

        //转java后，私有化，并提供get函数
        @JvmField //转为public,去掉get方法
        val mClassName = "MyKotlinStatic"

        ////中专了一下，在MyKotlinStatic2提供一个同名的showTips静态方法，然后
        //再帮我们去生成的Companion中调用showTips
        //   public static final void showTips() {
        //      Companion.showTips();
        //   }
        //相当于把Companion.showTips()封装到类的内部了，这样以来，java可以和kotlin一样调用了
        //见类JavaFileTest
        @JvmStatic
        fun showTips() {
            println("showTips method")
        }
    }
}