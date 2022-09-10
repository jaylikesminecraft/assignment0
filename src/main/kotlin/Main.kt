import java.util.Scanner

fun main() {

    var mySquare = Square("Square")
    var myCircle = Circle("Circle ")
    var myTriangle= Triangle("Triangle")
    var myEquilateralTriangle = EquilateralTriangle("Equilateral Triangle")

    val scanner = Scanner(System.`in`)
    print("Enter the length and height a square(more like a rectangle): ")
    mySquare.setDimensions(scanner.nextDouble(), scanner.nextDouble())
    println("${mySquare.name} area = ${mySquare.getArea()}")

    print("Enter the radius for a circle: ")
    myCircle.setDimensions(scanner.nextDouble())
    println("${myCircle.name} area = ${myCircle.getArea()}")

    print("Enter the sides for a triangle: ")
    myTriangle.setDimensions(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble())
    println("${myTriangle.name} area = ${myTriangle.getArea()}")

    print("Enter the sides for a equilateral triangle: ")
    myEquilateralTriangle.setDimensions(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble())
    var area = myEquilateralTriangle.getArea()
    println("${myEquilateralTriangle.name} area = ${area}")


}