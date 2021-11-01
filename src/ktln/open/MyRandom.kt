package ktln.open

class MyRandom {
    companion object{
        const val MONDAY = "Monday"
        const val TUESDAY = "TUESDAY"
        const val WEDNESDAY = "WEDNESDAY"
        const val THURSDAY = "THURSDAY"
        const val FRIDAY = "FRIDAY"
        const val SATURDAY = "SATURDAY"
        const val SUNDAY = "SUNDAY"
        fun randomInt(from:Int,to:Int) = (Math.random()*(to-from+1)).toInt() + from
        fun randomBoolean() = randomInt(0,1) > 0
        fun randomDayOfWeek():String{
            return when (randomInt(1,7)){
                1 -> MONDAY
                2 -> TUESDAY
                3 -> WEDNESDAY
                4 -> THURSDAY
                5 -> FRIDAY
                6 -> SATURDAY
                else -> SUNDAY
            }
        }
    }
}