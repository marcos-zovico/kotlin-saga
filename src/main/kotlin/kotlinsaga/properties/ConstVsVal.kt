package kotlinsaga.properties

/**
    const is like val, except that they are compile-time constants.
    const are allowed only as a top-level or member of an object.

    const cannot be used with var.

    const val x = "Hello, Kotlin" //would compile

    val y = printFunction() //works.
    const val z = printFunction() //won't work. const works as a compile time constant only.

    fun printFunction()
    {
        println("Hello, Kotlin")
    }

    class A {
        const val x = "Hello, Kotlin" //won't compile. const can be only used at top level or in an object.
    }
 */