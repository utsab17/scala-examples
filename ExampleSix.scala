class ExampleSix {

}

object Main8 {

  def main(args: Array[String]): Unit = {

    println("In this tutorial, we will learn about Scala's Type Inference, difference between val and var.")

    println("Let's start by initializing a list without declaring it's data type")

    val list = List(1, 2, 3)

    println("Here is the list ---> " + list)
    println();

    println("Now we will check if this list is an instance of Seq[Int] --> we use variable.isInstanceOf() method for type checking ")
    println();
    val typeInference = list.isInstanceOf[Seq[Int]]


    println(typeInference);
    println("Notice that Scala type inference feature gives programmers the freedom to choose whether to declare the data type")

    println("-------------------------------------------------------------------------------------------------------------------------")

    println("Difference between val and var. Variable declared using the val keyword is immutable. On the other hand, var keyword is used to declare a mutable variable")
    val x : Int = 5;
    //x = 10;

    println("We have assigned val x to 5. Once assigned, it can't be changed. Please uncomment Line # 30 and re-run to see the error we will get if we try to change the value of x")

    println();
    println("Let's declare a var y and assign it to 'YASH technologies");
    var y : String = "YASH Technologies"

    println("y = " + y)
    println("Let's see what happens when we reassign another String to the same variable y")

    y = "Yash Technologies, Inc."
    println("y = " + y)

    println();
    println("In conclusion, variables declared using var can be changes but variables declared using val cannot.")
    println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------")
  }
}
