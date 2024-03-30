package basics

fun main() {

    val name1 = "Foo"
    val name2 = "Bar"

    // Try both versions
    // val name3 = String("Foo".toCharArray())
    val name3 = "Foo"

    // Comparing the contents
    println("name1 == name2: ${name1 == name2}");
    println("name1.equals(name2): ${name1.equals(name2)}")

    println("name1 == name3: ${name1 == name3}")
    println("name1.equals(name3): ${name1.equals(name3)}")

    // Comparing the memory locations
    println("name1 === name2: ${name1 === name2}")
    println("name1 === name3: ${name1 === name3}")

}