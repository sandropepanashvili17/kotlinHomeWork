import kotlin.math.pow
import kotlin.math.sqrt

class Point (val x:Double, val y:Double){

    override fun toString(): String {
        return "$x $y"
    }

    public fun distanceBetween(point:Point):Double{

        val res: Double = sqrt((point.x - this.x).pow(2) + (point.y-this.y).pow(2));

        return res
    }

}