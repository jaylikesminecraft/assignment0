import kotlin.math.sqrt

open class Triangle(_shapeName : String) : Shape(_shapeName), Dimensionable {

    var sideA : Double = 0.0
    var sideB : Double = 0.0
    var sideC : Double = 0.0

    open fun setDimensions(_sideA : Double, _sideB : Double, _sideC : Double){
        sideA = _sideA
        sideB = _sideB
        sideC = _sideC
    }

    override fun getArea(): Double {
        val s = 0.5 * (sideA + sideB + sideC)
        return sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }

    override fun printDimensions() {
        println("sideA = $sideA")
        println("sideB = $sideB")
        println("sideC = $sideC")
    }
}
