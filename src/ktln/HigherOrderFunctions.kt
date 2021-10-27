package ktln

fun main1() {
    val listOfNumbers = mutableListOf<Int>()
    for (i in 0..99) {
        listOfNumbers.add(i)
        println(i)
    }
    val listOfEvenNumbers = listOfNumbers.filter ( {number:Int -> number %2 == 1} )
      for (i in listOfEvenNumbers)
    {
        println(i)
    }

}

fun main()
{
    val names = listOf("Mike","Alex","Serge")
    val namesStartsFromA = names.filter { it.startsWith("S") }
    for (name in namesStartsFromA)
    {
        println(name)
    }
}