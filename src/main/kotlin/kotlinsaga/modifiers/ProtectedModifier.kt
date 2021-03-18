package kotlinsaga.modifiers

/**
A Protected Modifier in Kotlin:
CANNOT be set on top-level declarations.
Declarations that are protected in a class, can be accessed only in their subclasses.

open class Pr{
    protected val i = 0
}

class Another : Pr() {

    fun iValue() : Int
    {
        return i
    }
}

Classes which are not a subclass of Pr cannot access i
Declarations that are protected, when overridden would have the same protected modifier in the subclass unless you explicitly change them. */


open class Pr2{
    open protected val i = 0
}

class Another2 : Pr2(){

    fun iValue() : Int
    {
        return i
    }

    override val i = 5 //protected visibility
}

/** The concept of Protected Modifiers in Kotlin that’s defined above differs from that in Java. */