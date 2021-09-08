import java.util.Scanner

fun main(args: Array<String>) {

    // Objects
    var mySquare = Square("Square")
    var myCircle = Circle("Circle")
    var myTriangle = Triangle("Triangle")
    var myEquilateralTriangle = EquilateralTriangle("Equilateral Triangle")

    // Scanner
    val reader = Scanner(System.`in`)

    // Input
    println("Enter square length: ")
    val length:Double = reader.nextDouble()
    println("Enter square height: ")
    val height:Double = reader.nextDouble()

    mySquare.setDimensions(length,height)

    println("Enter circle radius: ")
    val radius:Double = reader.nextDouble()

    myCircle.setDimensions(radius)

    println("Enter value for side 1 of the triangle: ")
    val side1:Double = reader.nextDouble()
    println("Enter value for side 2 of the triangle: ")
    val side2:Double = reader.nextDouble()
    println("Enter value for side 3 of the triangle: ")
    val side3:Double = reader.nextDouble()

    myTriangle.setDimensions(side1, side2, side3)

    // Output
    println("\nShape name: Square")
    mySquare.printDimensions()
    val squareArea = mySquare.getArea()
    println("Area = $squareArea\n")

    println("Shape name: Circle")
    myCircle.printDimensions()
    val circleArea = myCircle.getArea()
    println("Area = $circleArea\n")

    println("Shape name: Triangle")
    myTriangle.printDimensions()
    val triangleArea = myTriangle.getArea()
    println("Area = $triangleArea")






}