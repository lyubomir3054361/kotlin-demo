package basics

const val PI = 3.14 // static final
val pi = getPiValue()

fun main() {
    val name = "FooBar" // read only. final

    var number = 42; // mutable
    number = 43;

}

fun getPiValue(): Double = 3.14