import scala.collection.mutable

object MapSample {
  def main(args: Array[String]): Unit = {
    val treasureMap = mutable.Map[Int, String]()
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "find big X on ground.")
    treasureMap += (3 -> "Gig")
    println(treasureMap(2))
    
    val romanNumeral = Map(1-> "I", 2 -> "II", 3 -> "III")
    println(romanNumeral(3))
  }
}