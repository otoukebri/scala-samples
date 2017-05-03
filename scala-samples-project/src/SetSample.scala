

object SetSample {
  def main(args: Array[String]): Unit = {
   //mutable set
    var jetSet = Set("Boeing", "Aibus");
    jetSet += "Lear";
    println(jetSet.contains("Cessna"))
  }
}