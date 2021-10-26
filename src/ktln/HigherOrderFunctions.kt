package ktln

fun main() {
    val listOfNumbers = mutableListOf<Int>()
    for (i in 0..99) {
        listOfNumbers.add(i)
        println(i)
    }
    val listOfEvenNumbers = listOfNumbers.filter ( {number:Int -> number %2 == 1} )
    //println(listOfEvenNumbers)
    for (i in listOfEvenNumbers)
    {
        println(i)
    }

}