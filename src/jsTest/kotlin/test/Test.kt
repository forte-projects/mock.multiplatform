package test

import kotlin.test.Test


data class User constructor(val age: Int, val name: String?)

class Test {

    @Test
    fun test() {
        val t = User::class.js.asDynamic()

        println(t.length)
        println(" , ")
        println(t.prototype.length)
        println(" , ")
        println(t.constructor)

        println(" , ")
        println(t.constructor.length)

    }

}