
fun main(args: Array<String>) {
    val numList = 1..20
    //sum all values in a list
    val listSum = numList.reduce { acc, num -> acc + num }
    println("Reduce sum: $listSum")
    //Fold, like reduce but starts with an initial value
    val listSum2 = numList.fold(5) { acc, num -> acc + num }
    println("Fold sum : $listSum2")

    //Check if values are able to meet a condition

    //See if any of the values are even
    println("Evens: ${numList.any { it % 2 == 0 }}")
    println("All even: ${numList.all { it % 2 == 0 }}")

    val big3 = numList.filter { it > 3 }
    big3.forEach { n -> println(">3 : $n")}

    println("\n")
    //Map. Perform a value on every single item and return a new list
    val times7 = numList.map { it * 7 }
    times7.forEach { n -> println("*7 : $n")}
}