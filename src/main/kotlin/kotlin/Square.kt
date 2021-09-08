class Square (_name : String) : Shape (_name) {
    private var length = 0.0
    private var height = 0.0

    fun setDimensions(userLength:Double, userHeight:Double) {
        length = userLength
        height = userHeight
    }

    override fun printDimensions() {
        println("Length = $length")
        println("Height = $height")
    }

    override fun getArea(): Double {
        return length * height
    }
}