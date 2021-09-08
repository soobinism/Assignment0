import kotlin.math.PI

class Circle (_name : String) : Shape (_name)  {
    private var radius = 0.0

    fun setDimensions(userRadius:Double){
        radius = userRadius
    }

    override fun printDimensions() {
        println("Radius = $radius")
    }

    override fun getArea(): Double {
        return PI * radius * radius
    }
}