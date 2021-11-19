package forte.mock


/**
 * 永远得到null的 mockValue
 */
@Suppress("UNCHECKED_CAST")
public fun <T> nullMockValue(): MockValue<T> = NullMockValue as MockValue<T>
private object NullMockValue : MockValue<Any?> {
    override fun getValue(): Any? = null
}