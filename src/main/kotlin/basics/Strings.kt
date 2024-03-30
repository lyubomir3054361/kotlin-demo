package basics

fun main() {
    val name = "FooBar"
    println(name)
    println(name.length)
    println(name.uppercase())
    println(name.lowercase())
    println(name[0])
    println(name[3])
    println("".isEmpty())
    println(name.isEmpty())

    // String Template
    val age = 20
    val msg: String = "Name $name, Age: $age"
    println(msg)

    // Multiline Strings

    // with trimIndent()
    var email = """
        Hello 
        %s,
        How
        Are
        You
        ?
    """.trimIndent()
    println(email.format("Foo"))

    // without trimIndent()
    email = """
        Hello 
        %s,
        How
        Are
        You
        ?
    """
    println(email.format("Foo"))

}
