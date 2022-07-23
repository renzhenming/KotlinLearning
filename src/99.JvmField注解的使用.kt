/**
 *
 * 生成的类的格式，会将names属性私有化，然后提供get方法，那么外部调用的时候就不能直接
 * a.names这样调，必须用a.getNames(),那能不能做到a.names这样用呢
 * public final class AManager {
@NotNull
private final List names = CollectionsKt.listOf(new String[]{"章三", "里斯", "王武"});

@NotNull
public final List getNames() {
return this.names;
}
}
 */
class AManager {
    val names = listOf<String>("章三", "里斯", "王武")
}


/**
 * 给这个属性加上@JvmField注解后，就会将这个属性改为public的，并且没有get方法了，可以直接调用
 */
class AManager2 {
    @JvmField
    val names = listOf<String>("章三", "里斯", "王武")
}

fun main() {

    //都可以调用
    var m = AManager2()
    m.names

    //在java中无法这样调用，除非加上JvmField注解，见JavaFileTest
    var m2 = AManager()
    m2.names
}