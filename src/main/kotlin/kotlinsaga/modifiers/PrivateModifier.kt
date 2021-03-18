package kotlinsaga.modifiers

/** Private Modifiers do not allow the declarations to be visible outside the current scope. */

var setterVisibility: String = "abc"
    private set

open class Pr{
    open protected val i = 0

    fun iValue() : Int
    {
        setterVisibility = "10"
        return setterVisibility as Int
    }
}
/** Since kotlin allows multiple top level definitions the above code works. */

/** The below doesn’t */


private open class ABC{
    private val x = 6
}

private class BDE : ABC()
{
    fun getX()
    {
        // return x  cannot be accessed here.
    }
}

/** x is visibile only from inside its class.
 We can set private constructors in the following way:
*/

class PRIV private constructor(a: String) {

}

/** By default classes have public constructors. Wherever the class goes the constructor follows.
We need to set the visibility modifier on the constructor in the definition itself.
Thus Kotlin uses the protected and internal modifiers differently from Java. Also Java’s default modifier is package-private which doesn’t exist in Kotlin, yet.
This brings an end to this quick tutorial on Visibility Modifiers in Kotlin
*/