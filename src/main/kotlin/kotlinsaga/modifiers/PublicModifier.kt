package kotlinsaga.modifiers

/**
A Public Modifier is the default modifier in Kotlin.
Just like the Java public modifier, it means that the
declaration is visible everywhere.
 */


class Hello {
}

public class H {
}

fun hi() {}
public fun hello() {}

val i = 0
public val j = 5

/**
All the above declarations are the in the top level of the file.
ALL are public. If we don’t mention the declaration of the members
of the class, they are public(unless they are overridden).
 */
