import java.util.*

fun main(args: Array<String>) {
    for(x in 1..10){
        println("Loop: $x")
    }
    //alla bibliotek i java kan användas i kotlin
    val rand = Random()
    val magicNumber = rand.nextInt(50) + 1 //random number from 1 to 50

    // while loop
    var guess = 0
    while(magicNumber != guess) {
        guess += 1
    }
    println("Magic number was $guess")

    for(x in 1..20) {
        if(x % 2 == 0) { //even number
            continue //skips everything after, but continue the loop
        }
        println("Odd: $x")
        if(x == 15) break // stop looping
    }

    var arr3: Array<Int> = arrayOf(3,6,9)
    for(i in arr3.indices) {
        println("Mult 3 : ${arr3[i]}")
    }
    //______________!!!_______________
    for((index, value) in arr3.withIndex()) {
        println("Index : $index Value : $value")
    }
}