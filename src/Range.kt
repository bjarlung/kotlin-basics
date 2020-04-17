
fun main(args: Array<String>) {
    val oneTo10 = 1..10 //type IntRange

    val alpha = "A".."Z" //type ClosedRange<String>

    println("R in alpha: ${"R" in alpha}")

    val tenTo1 = 10.downTo(1)

    val twoTo20 = 2.rangeTo(20) //type IntRange

    val rng3 = oneTo10.step(3) //tar var tredje

    for(x in rng3) println("rng3: $x")

    for(x in tenTo1.reversed()) println("Reversed : $x")
}