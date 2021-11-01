package ktln.open

import ktln.name

class Car(override var name:String = "Car0"): Transport(name) {
    override fun drive() {
        println("Car drive fun")
    }
    fun startEngine():Boolean
    {
        println("Starting engine")
        return true
    }
}