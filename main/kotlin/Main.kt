import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
 val point = Point(1.0,2.0)
 val point2 = Point(3.0,4.0)
    //println(point.toString())
    println(point.equals(point2))
    println("/////////////////////////")
    println(point.distanceBetween(point2))

}