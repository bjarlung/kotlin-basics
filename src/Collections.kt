
fun main(args: Array<String>) {
    //mutable - changeable
    var list1: MutableList<Int> = mutableListOf(1,2,3,4,5)
    //immutable - unchangeable
    val list2: List<Int> = listOf(1,2,3)

    list1.add(6)

    println("1st item L1 : ${list1.first()}")
    println("Last item L1 : ${list1.last()}")

    println("2nd indec L1 : ${list1[2]}")

    var list3 = list1.subList(0, 3) // ingen kopia, länkar till samma objekt

    println("Lenght L1 : ${list1.size}")

    list3.clear()
    println("Lenght2 L1 : ${list1.size}") // när man tar bort lista 3 tar man bort alla de värden som är med i lista 1 också
    list1.removeAt(1) //specific index
    println("Lenght3 L1 : ${list1.size}")
    list1[1] = 10 //add at specific index

    list1.forEach { n -> println("Mutable list : $n")}

    //Maps modifiable collection with key value pairs
    //value can be anything - Any
    //value can be null - ?
    val map = mutableMapOf<Int, Any?>()
    map[1] = "Derek"
    map[2] = 42
    println("Map size : ${map.size}")
    map.put(3, "Pittsburg") //add a key value, same as map[3] = "Pittsburg"
    map.remove(2)
    for((x, y) in map){
        println("Key : $x. Value : $y")
    }

    //load values when you first start it
    val map2 = mutableMapOf(1 to "Doug", 2 to 25)
    map2.forEach{println(it)}


}