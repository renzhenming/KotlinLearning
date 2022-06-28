import java.util.List;

public class JavaFileTest {


    public static void is() {
        System.out.println("java中的is方法调用了");
        JvmUtils.getName();

        List<String> names1 = new AManager().getNames();
        List<String> names = new AManager2().names;

        JvmOverloadsUtils jvmOverloadsUtils = new JvmOverloadsUtils();

        //三个都要传
        jvmOverloadsUtils.checkRight2(12, "dde", "dd");
        //可以用默认参数
        jvmOverloadsUtils.checkRight(12);

        //如何让java调用方式和kotlin保持一致？这个Companion出现有点碍眼
        MyKotlinStatic.Companion.showTips();
        MyKotlinStatic.Companion.getMClassName();

        MyKotlinStatic2.showTips();
        String mClassName = MyKotlinStatic2.mClassName;
    }
}
