
fun main(args: Array<String>) {
    //immutable type inferred
    val name = "Beatrice"

    //mutable
    var myAge= 32

    //types
    var bigInt: Int = Int.MAX_VALUE

    //string interpolation
    println("Biggest Int : $bigInt")

    if(true is Boolean) {
        println("true is Boolean\n")
    }

    var letterGrade: Char = 'A'
    println("A is a Char: ${letterGrade is Char}")

    //casting
    println("3.14 to Int : ${3.14.toInt()}")
    println("A to Int : ${'A'.toInt()}")
    println("65 to Char : ${65.toChar()}")
}