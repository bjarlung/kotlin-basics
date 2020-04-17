
// A function that either accepts or returns another function
fun main(args: Array<String>) {

    val numList = 1..20
    //Collection operator -> filter
    //it - if function has only one param you don't have to declare it
    val evenList = numList.filter { it % 2 == 0 }
    evenList.forEach { n -> println(n)}

    //Call function that will dynamically return a created function

    val mult3 = makeMathFunc(3)
    println("5 * 3 = ${mult3(5)}")
    val mult4 = makeMathFunc2(4)
    println("6 mult4: ${mult4(6)}")

    val multiply2 = {num1: Int -> num1 *2}
    val numlist2 = arrayOf(1,2,3,4,5)

    mathOnList(numlist2, multiply2)

}


fun makeMathFunc(num1: Int): (Int) -> Int = {num2 -> num1 * num2}
//_______För att förstå_________
fun makeMathFunc2(num1: Int): (Int) -> Int {
    val insideFunk = {num2: Int -> num1 * num2} //har access till num1 eftersom inne
    fun inside2(num2: Int): Int {
       return num1 * num2
    }
    return insideFunk
}
fun mult4(num2: Int): Int {
    return 4 * num2
}
//___________
fun mathOnList(numList: Array<Int>, myFunk: (num: Int) -> Int) {
    for(n in numList) {
        println("mathOnList ${myFunk(n)}")
    }
}
