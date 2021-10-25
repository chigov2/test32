package ktln

fun main(){
val a: String? = null
val b: String? = "854095843"
val c: String? = ""
    val result = (a?.length?:0) + (b?.length?:0) +(c?.length?:0)
    println(result)
}