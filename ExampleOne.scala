class ExampleOne {

  //topics covered in class ExampleOne are Enumeration, Pattern-Matching, ReadLine, defining functions,

  private var info : String = "Please take a look at how this is printed to the console.."
  private var title: String = "Scala Programming Language - Tutorial"
  private val companyName: String = "Yash Technologies"

  def displayNumber(): Unit ={
    println(title);
    println(info);
  }

  def displayCompanyName(): Unit = {
    println(companyName);

  }

  def convertStringToInt(x : String): Int = {
    return x.toInt;
  }


  def letsPatternMarch(x : Int) : String = x match {

    case 0 => "Pattern matched to case 0 - please take a look at how this is being printed"
    case 1 => "Pattern matched to case 1 - please take a look at how this is being printed"
    case 3 => "Pattern matched to case 3 - please take a look at how this is being printed"
    case 4 => "Pattern matched to case 4 - please take a look at how this is being printed"
    case 5 => "Pattern matched to case 5 - please take a look at how this is being printed"
    case _ => "ooops....you entered a number which is not in between 0-5 but no problem, it is still pattern matched to case _. "
  }
}




object Main extends Enumeration
{

  type Languages = Value

  val first = Value("Scala")
  val second = Value("Java")
  val third = Value("Python")
  val fourth = Value("C++")



  def main(args: Array[String]): Unit = {
    var obj = new ExampleOne(); //creating the object of class ExampleOne
    obj.displayCompanyName(); //calling the method displayComanyName() of class ExampleOne
    obj.displayNumber();
    println("Println is utilized in printing values/strings to the console. It computes a trailing newline.");
    print("Print works like println but print DOES NOT compute a trailing newline. ");
    printf("Printf is used in writing format strings, it places extra arguments %d", 25);
    println();
    println("scala.io.StdIn.readline() is used to read input as a string from the keyboard.")
    println("Please provide any value:");
    val result = scala.io.StdIn.readLine(); //scala.io.StdIn.readline() is used to read input as a string from the keyboard
    printf("You Entered: %s", result);
    println();
    println("Here, the user input " + result + " belongs to " + result.getClass + " because the function scala.io.StdIn.readLine() converts provided input to a String. ");

    println("Now let's take a look at PATTERN-MATCHING. ")
    println();
    println();
    println("let's start by providing an integer between 0 and 5");

    val result1 = scala.io.StdIn.readLine();

    println("you entered " + result1 + " but it is of type String so let's convert it to an integer first");

    val newInt = obj.convertStringToInt(result1); //please take a look at how String can be casted to an Int in the method convertToString
    printf("%s has successfully been converted from String to Int %d .", result1, newInt)
    println();
    println();
    val newStr = obj.letsPatternMarch(newInt); //method which uses pattern-matching
    println(newStr);
    println();

    println();
    println("Now, lets look at Enumeration. Scala Provides an Enumeration class which we can extend in order to create our enumeration.")
    Main.values.foreach {

      case d if (d == Main.third) =>
        println(s"My Favorite Programming Language =  $d.")
      case _ => None
    }

    println();
    println();
    println();
    println("Similarly, we can order enumerate through values")

    println(s"Main programming languages = ${Main.values}");
    println();
    println();


  }
  }
