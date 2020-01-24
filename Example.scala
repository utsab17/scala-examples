

object Example  {

  val name : String = "Yash Technologies"


  val x = 500f;

  def square(x: Int) = x * x






  def main(args: Array[String]): Unit = {
    println(name.getClass)
    //In java, we know that String is an immutable object
    //java.lang.String class has methods that can be used with a String object
    //here we can notice that Scala is using the same String class which is used by java
    //further proved by the class name java.lang.String




    println(x.getClass)
    //Type inference feature of Scala is proved here
    //even though the data type of val x is not provided, Scala's type inference automatically
    //detects the data type of a variable



    println(square(5))
  }




}
