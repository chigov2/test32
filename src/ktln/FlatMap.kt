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

fun main()
{
  val data = mapOf(
      "File1" to listOf(5,6,3,9,8),
      "File2" to listOf(1059,-200,5,2,3),
      "File3" to listOf(6,8,9,6,3)
  )
    //val average = data.flatMap { it.value }.average()
    val average = data.filter { it.value.all { it >=0 } }.flatMap { it.value }.average()
    println(average)

}
