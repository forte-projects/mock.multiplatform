package forte.mock

/**
 * 获取一个随机值的 MockValue.
 */
public fun interface MockValue<T> {
    public fun getValue(): T
}

