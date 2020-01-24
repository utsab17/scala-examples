case class ExampleFive (name: String)

object Main7 {

  def main(args: Array[String]): Unit =
  {

    println()
    println("In this tutorial, we will learn about case class. ")

    println();
    println("Case class is a regular class, except it is good for modeling immutable data. It has all vals --> which means they are immutable")

    println();
    println("To create a case class, we need the keyword case class. Please take a look at how class ExampleFive is defined in this program");
    println("-------------------------------------------------------------------------------------------------------------------------------");
    println();

    println("To create a Scala Object of a case class, we don't use the keyword new")
    println()
    println()
    println();
    println("Case class default apply() method handles the creation of objects");
    println();


    val c = ExampleFive("Yash");
    println("Name of the company is " + c.name );
    println("I am using the object of " + c.getClass + "This line is printed from object C of class ExampleFive")
    println();

    val d = c.copy();
    println("copy() method is used to clone an object")
    println("I am using the object of " + d.getClass + "This line is printed from object D of class ExampleFive")
    println();
    println("-------------------------------------------------------------------------------------------------------------------------------")

    println("Let's verify if object c == object d!!")
    println(d == c)
  }
}