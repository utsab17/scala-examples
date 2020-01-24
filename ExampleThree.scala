import java.io.IOException

abstract class examplethree {

  final def greet(): Unit ={
    println();
    println("----------Welcome to Example Three---------")
    println("Here we will cover Abstract Class, Exception Handling, Singleton and COompanion")
    println();
    println();
    println("In this example, we will demonstrate the use of abstract class")
    println();
    println();
  }

  final def myMethod(): Unit = {
    println("This is printed from the Final Method myMethod() of the abstract class")
  }

  def welcome()
}

class Ex3 extends examplethree {

  private var number : Integer = 4;
  override def welcome(): Unit = println("This method was overridden in class Ex3 which extends abstract class examplethree.")

  def demoCatchingException(n: Int): Unit ={
    try {
      var result = n/0
    } catch {
      case i: IOException => { println("IO Exception occurred") }
      case a: ArithmeticException => { println("Arithmetic Exception occurred") }
      }
    }
  }

object Ex3 {
  def main(args: Array[String]): Unit ={
    println();
    var obj1 = new Ex3();
    println("Welcome to companion objects tutorial. Companion Objects are objects which have the same name as their class.")
    println(obj1.number);
    println("Please  check how this is being printed. Companion objects can access private methods and fields of its class" );
    println();
    println();
    println("-----------------------------------------------------------------------------------------------------------");
    println();

    println("Please click somewhere in Object Main5 and run the program to continue the tutorial")
  }
}



object Main5 {
  def main(args: Array[String]): Unit ={
    var obj = new Ex3();
    obj.greet();
    obj.myMethod()
    obj.welcome()
    println();
    println("----------------------------------------------------------------------------------");
    println("Now, let's understand how to catch exceptions and react accordingly in Scala")
    println();

    obj.demoCatchingException(5)

    println("--------------------------------------------------------------")

    println("Let's take a look at Singleton Objects ---> Object Main5 is a single object --> instead of static keyword, we use Singleton object inn Scala")
    println("Singleton object provides an entry point to your program execution")
    println()
    println()
    println("To learn about companion object, please click somewhere inside companion object Ex3 and re-run the program")

  }
}