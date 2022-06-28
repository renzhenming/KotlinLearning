
class JvmOverloadsUtils {

    /**
     * kotlin调用kotlin环境下，没有任何问题，但是当java调用kotlin的时候
     * java无权使用kotlin的默认参数，所以他必须把每个参数都传入，
     * 如果向让java也能使用默认参数，就用到此注解
     *
     * 会生成相应的重载方法供使用
     *
     *
     *    // $FF: synthetic method
    public static void checkRight$default(JvmOverloadsUtils var0, int var1, String var2, String var3, int var4, Object var5) {
    if ((var4 & 2) != 0) {
    var2 = "河南";
    }

    if ((var4 & 4) != 0) {
    var3 = "章三";
    }

    var0.checkRight(var1, var2, var3);
    }

    @JvmOverloads
    public final void checkRight(int age, @NotNull String from) {
    checkRight$default(this, age, from, (String)null, 4, (Object)null);
    }

    @JvmOverloads
    public final void checkRight(int age) {
    checkRight$default(this, age, (String)null, (String)null, 6, (Object)null);
    }
     */
    @JvmOverloads
    fun checkRight(age: Int, from: String = "河南", name: String = "章三") {
        println("$age $from $name")
    }

    fun checkRight2(age: Int, from: String = "河南", name: String = "章三") {
        println("$age $from $name")
    }
}