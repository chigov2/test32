package ktln

fun test21()
{
    val revenueByWeek = listOf(
        listOf(8,6,3,9,7),
        listOf(2,9,3,8,9),
        listOf(3,6,8,9,10),
        listOf(6,9,8,7,4),
        listOf(5,8,9,7,6)
    )

    //хотим получить среднюю выручку за день
    //val average = revenueByWeek.average()
   // val total = revenueByWeek.flatMap { it }
    val total = revenueByWeek.flatten()

    println(total)
    val average = total.average()
    println(average)

}

fun test23()
{
  val data = mapOf(
      "File1" to listOf(5,6,3,9,8),
      "File2" to listOf(59,20,5,2,3),
      "File3" to listOf(6,8,9,6,3)
  )
    //val average = data.flatMap { it.value }.average()
    //val average = data.filter { it.value.all { it >=0 } }.flatMap { it.value }.average()
    val average = data.filterNot { it.value.all { it < 0 } }.flatMap { it.value }.average()
    println(average)

}
fun main()
{
    val data= mapOf(
        "January"   to  listOf(100,250,235,547),
        "February"  to  listOf(-100,250,230,547),
        "March"     to  listOf(100,250,35,547),
        "April"     to  listOf(120,250,-235,547),
        "May"       to  listOf(5500,250,240,547),
        "June"      to  listOf(1001,250,235,547),
        "July"      to  listOf(100,250,279,547)
    )
    printInfo(data)
}

fun printInfo(data: Map<String, List<Int>>)
{
    //val validateData = data.filterNot { it.value.any { it < 0 } }
    val validateData = data.filter { it.value.all { it > 0 } }
    val averageWeek = validateData.flatMap { it.value }
    println("Average income: ${averageWeek.average()}")
                                              //listOf(100,250,235,547)
    val listOfSum = validateData.map { it.value.sum() }
    println("listOfSum: $listOfSum")
    val max = listOfSum.maxOrNull()
    val min = listOfSum.minOrNull()

    println("max: $max")

    println("min: $min")
    val averageMonth = listOfSum.average()
    println("Average: $averageMonth")

    val maxMonth = validateData.filter { it.value.sum() == max }.keys
    val minMonth = validateData.filter { it.value.sum() == min }.keys
    for (i in maxMonth)
    {
        println(i)}
    for (i in minMonth)
    {
        println(i)}
    println("maxMonth: $maxMonth")
    println("minMonth: $minMonth")

    val invalidData = data.filter { it.value.any { it <0 } }
    val errorMonth = invalidData.keys
    print("Error month: ")
    for (i in errorMonth)
    {
        print ("$i ")}
}