class EquilateralTriangle(_shapeName : String) : Triangle (_shapeName) {

    override fun setDimensions(_sideA : Double, _sideB : Double, _sideC : Double){
        if(_sideA == _sideB && _sideB == _sideC){
            sideA = _sideA
            sideB = _sideB
            sideC = _sideC
        } else {
            println("input sides do not make an equilateral triangle")
        }
    }

}
