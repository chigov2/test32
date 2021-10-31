package ktln

import ktln.Enum2.*

fun main(){
    val month: Enum2 = MAY
    val season: String = when(month){
        DECEMBER,JANUARY,FEBRUARY -> "Зима"
        MARCH,APRIL, MAY -> "Весна"
        JULY,JULY,AUGUST -> "Лето"
        SEPTEMBER,OCTOBER,NOVEMBER -> "Зима"
        else ->  "Not found"
    }
    println(season)
}