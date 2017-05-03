

object ListSample {
  def main(args: Array[String]) {
    val oneTwo = List(1, 2);
    val threeFour = List(3, 4);
    //new list since list does not mutate
    val oneTwoThreeFour = oneTwo ::: threeFour;
    println("hello world2" + oneTwoThreeFour);
    //concat an element at the beginning of the list
    var oneTwoFive = 5 :: oneTwo;
    val empty = oneTwoThreeFour.isEmpty;
    println(oneTwoFive);
    println("is list empty: " + empty);
    println("list lenght is : " + oneTwoFive.length);
    oneTwoThreeFour.foreach(print)
  }
}