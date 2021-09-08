import kotlin.math.*

open class Triangle (_name : String) : Shape (_name)  {
    private var side1 = 0.0
    private var side2 = 0.0
    private var side3 = 0.0
    private var perimeter = side1 + side2 + side3

    fun setDimensions(userSide1:Double, userSide2:Double, userSide3:Double){
        side1 = userSide1
        side2 = userSide2
        side3 = userSide3
        perimeter = userSide1 + userSide2 + userSide3
    }

    override fun printDimensions() {
        println("Side 1 = $side1")
        println("Side 2 = $side2")
        println("Side 3 = $side3")
    }



    override fun getArea(): Double {
        val s = perimeter/2
        return sqrt(s * (s-side1) * (s-side2) * (s-side3))
    }
}