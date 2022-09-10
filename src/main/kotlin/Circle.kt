import kotlin.math.PI

class Circle(_shapeName : String) : Shape(_shapeName), Dimensionable {

    var radius : Double = 0.0

    fun setDimensions(_radius : Double){
        radius = _radius
    }

    override fun getArea(): Double {
        var area = radius*radius* PI
        return area
    }

    override fun printDimensions() {
        println("radius = $radius")
    }
}