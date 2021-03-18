package kotlinsaga.properties

/**
 * Currently, there are a few variants of getters and setters in Kotlin. Let’s look at each of them separately
 * by creating a Kotlin class as shown below.
 **/
class GettersAndSetters {

    var name: String
        set(value) = println(value)
        get() = this.tutorial

    var tutorial : String = "Kotlin"
        set(value) {
            println("Old value was $field New Value is $value")
        }
        get() {
            return "${field.length}"
        }
}

fun main(args: Array<String>) {

    var a = GettersAndSetters()
    println(a.name)
    a.name = "Kotlin Getters And Setters"

    println(a.tutorial)
    a.tutorial = "Kotlin Properties"
}

/**

    In the above code, we use the setters to print the old and new values after the new one is set.
    We haven’t initialized the property name. Hence it takes the value of the getter. The getter of the name property invokes the property tutorial. Hence the initial value of name is fetched from the getter of tutorial
    field holds the backing value of a property.

    We can further specifier a modifier on the setters and getters too.

    var name: String
    private set(value) = println(value)
    get() = this.tutorial

    The visibility modifier on a get must be the same as the property.
    Now the above property cannot be set from any function outside the class.

 */
