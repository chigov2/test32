package ktln

fun main1() {
    val listOfNumbers = mutableListOf<Int>()
    for (i in 0..99) {
        listOfNumbers.add(i)
        println(i)
    }
    //val listOfEvenNumbers = listOfNumbers.filter ( {number:Int -> number %2 == 1} )
    val listOfEvenNumbers = listOfNumbers.filter { it %2 == 1}
      for (i in listOfEvenNumbers)
    {
        println(i)
    }

}

fun main3()
{
    val names = listOf("Mike","Alex","Serge")
    val namesStartsFromA = names.filter { it.startsWith("S") }
    for (names1 in namesStartsFromA)
    {
        println(names1)
    }
}

fun main6()
{
    val numbers = (0..100).toList()
    //val doubleNumbers = numbers.map {num:Int -> num * 2 }
    //val doubleNumbers = numbers.map {it -> it * 2 }
    val employees = numbers.map { "Employee #$it" }
    for(i in employees)
    {
        println(i)
    }
}
fun main2()
{
    val array = arrayOf(12,56,98,36,254,45)
    //val sortedArray = array.sorted()
    val sortedArray = array.sortedDescending()
    for (i in sortedArray){
        println(i)
    }
}

fun main_()
{
    val initArray = mutableListOf<Int>()
    for (i in 0 until 1000){
        initArray.add((Math.random()*1000).toInt())
    }
    val result = initArray.filter { it % 5 == 0 || it % 3 == 0}.map { it*it }
        .sortedDescending().map { "\"$it\""  }

    for (i in result)
    {
        println(i)
    }
}

fun main()
{
    val array = (0..100).toList()
    val employees = array.map { "Employee #$it" }
    val first30 = employees.dropLast(30)
    for (i in first30)
    {
        println(i)
    }
}