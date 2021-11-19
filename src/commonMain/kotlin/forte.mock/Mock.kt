package forte.mock

import kotlin.reflect.KClass


/**
 * 用来管理已经注册的Beans
 */
public class Mock
internal constructor(private val entities: MutableMap<KClass<*>, MockEntity>)
{
    internal constructor(): this(mutableMapOf())



    public companion object
}

