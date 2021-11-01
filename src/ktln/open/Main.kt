package ktln.open

fun main()
{
//    val workers = mutableListOf<Worker>()
//    workers.add(Seller("Mikee",37))
//    workers.add(Seller("Petr",67))
//    workers.add(Seller("Sveta",56))
//    workers.add(Programmer("Sasha",37,"Kotlin"))
//    workers.add(Programmer("Natasha",57,"Java"))
//    workers.add(Director(name = "  ",57))
//    for (i in workers)
//    {
//        i.work()
//        if(i is Programmer){
//            println(i.language)
//        }
//        if (i is Cleaner){
//            i.clean()
//        }
//    }
//    val cleaners = workers.filter { it is Cleaner }.map { it as Cleaner }
//    for (i in cleaners){
//    i.clean()
//    }
//    val car: Transport = Car()
//    val bike:Transport = Bike()
//    if (car is Car) car.name = "new car name"
//    println(car.name)
//    val car1 = Car()
//    car1.startEngine()
//    travel(car1)
//    travel(object : Transport("scooter"){
//        override fun drive() {
//            println("scooter object")
//        }
//    })

val sportsman = SportsMan()
//    sportsman.invokeWaterBoy(object : Waterboy{
//        override fun bringWater() {
//            println("Give me water")
//        }
//    })
//    sportsman.invokeWaterBoy{ println("water is ok")}
//    val calc = Calc()
//    println(Calc.square(8))

    println(MyRandom.randomInt(5,10))
    println(MyRandom.randomBoolean())
    println(MyRandom.randomDayOfWeek())



}
//fun travel(transport: Transport){
//    transport.drive()
//}