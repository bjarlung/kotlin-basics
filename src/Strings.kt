
fun main(args: Array<String>) {
    val myName = "Beatrice Järlung"
    // """ kan byta rad, skriver ut as is
    val longStr = """This is a
        |long string
        |yo
        |
    """.trimMargin()
    println(longStr)

    var fName: String = "Doug"
    var lName: String = "Smith"

    fName = "Sally"
    var fullName = fName + " " + lName
    println("Name : $fullName ")

    println("String length : ${myName.length}")

    //compare
    var str1 = "A random string"
    var str2 = "a random string"
    println("Strings equal: ${str1.equals(str2)}")
    println("Compare A to B: ${"A".compareTo("B")}")

    println("2nd index : ${str1.get(2)}") // alt str1[2]

    println("Index 2 - 7 : ${str1.subSequence(2, 8)}")
    println("Contains random : ${str1.contains("random")}")
}