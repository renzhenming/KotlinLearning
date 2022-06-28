@file:JvmName("JvmUtils")
//指定文件名，
fun getName(): String {
    return "name"
}

fun main() {
    println(getName())
}

/**
 * 转换成java后是这个样子
 * 我们创建的是文件，并没有指定类名，那么在生成的时候，kolin会默认用当前文件名作为
 * 类名生成一个类，但是这样这个类名就有点奇怪了
 * 所以我们用JvmName来指定生成类的类名
 */
//@JvmName(
//    name = "JvmUtils"
//)
//public final class JvmUtils {
//    @NotNull
//    public static final String getName() {
//        return "name";
//    }
//
//    public static final void main() {
//        String var0 = getName();
//        System.out.println(var0);
//    }
//
//    // $FF: synthetic method
//    public static void main(String[] var0) {
//        main();
//    }
//}