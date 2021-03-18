package kotlinsaga.properties

/**
 * lazy is lazy initialization. Your val property won’t be initialized until you use it for
 * the first time in your code. Henceforth, the same value would be used. The value is
 * present in the lazy() function which takes the value in the form of a lambda.
 *
 *  val x: Int by lazy { 10 }
 *
 *  lateinit modifier is used with var properties and is used to initialize the var property at a later stage.
 *  Normally, Kotlin compiler requires you to specify a value to the property during initialization.
 *  With the help of lateinit you can delay it.
 */


fun main(args: Array<String>) {
    var a = A()
    a.x = "Hello Kotlin"
}

class A {
    lateinit var x: String
}