trait Similarity {
  def isSimilar(x:Any):Boolean
  def isNotSimilar(x:Any):Boolean = ! isSimilar(x)
}

class Point (xc:Int, yc:Int) extends Similarity {
  var x : Int = xc
  var y : Int = yc

  def isSimilar (obj: Any) =
    obj.isInstanceOf[Point] &&
      obj.asInstanceOf[Point].x == x
}

object TraitsTest extends App {
  val p1 = new Point(2,3)
  val p2 = new Point(2,4)
  println(p1.isSimilar(p2))
} 