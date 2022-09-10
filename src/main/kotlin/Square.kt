//shouldn't a square implement a rectangle?
//this class should be called rectangle not square

class Square(_shapeName : String) : Shape(_shapeName), Dimensionable {

    var length : Double = 0.0;
    var height : Double = 0.0;

    fun setDimensions(_length : Double, _height : Double){

        length = _length
        height = _height

//      if(_length == _height){
//          length = _length
//          height = _height
//      } else {
//          println("input sides do not make a square")
//      }

    }

    override fun getArea(): Double {
        var area = length * height
        return area
    }

    override fun printDimensions() {
        println("length = $length")
        println("height = $height")
    }


}