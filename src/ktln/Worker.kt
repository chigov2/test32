package ktln

import java.util.*

class Worker (val name: String, val position: String,val startYear:Int) {
    val experiance: Int//переопределение геттера
    get() = Calendar.getInstance().get(Calendar.YEAR) - startYear

    fun work()
    {
        println("Working: ")
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Worker

        if (name != other.name) return false
        if (position != other.position) return false
        if (startYear != other.startYear) return false
        if (experiance != other.experiance) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + position.hashCode()
        result = 31 * result + startYear
        result = 31 * result + experiance
        return result
    }
}