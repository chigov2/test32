package ktln.open

abstract class Transport(open val name: String?) {
    abstract fun drive()
}