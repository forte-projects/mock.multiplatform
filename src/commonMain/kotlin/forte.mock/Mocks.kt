package forte.mock

import kotlin.reflect.KClass



/**
 * 描述一个Bean.
 */
public interface MockEntity<T : Any> {
    public val type: KClass<T>
    public val properties: List<MockProperty<*>>
    public fun newInstance(): T
}


/**
 * 描述一个Bean的property.
 */
public interface MockProperty<T : Any> {
    public val isRequired: Boolean
    public val defaultValue: T?
    public val isNullable: Boolean
    public val type: KClass<T>
    public fun inject(instance: T)
}

