class ExampleSeven(var topic: String = "Constructors", var number: Integer = 7) {




}

object Main9 {

def main(args: Array[String]): Unit = {

  println("In this tutorial, we will learn about constructors and Lambda Expressions. When declaring a class - we can pass default field values. Please see Line # 1 ")

  println("When declaring a class, default values can be passed into it in the same line")

  println()

  println("Let's create an object of class ExampleSeven and check out it's field title.")
  var obj5 = new ExampleSeven();

  println("The object of " + obj5.getClass + " has default field values " + obj5.topic + " and " + obj5.number + " - Please see Line # 1 for clarification.");
  println()
  println("Similarly, we can override the default values at the time of object creation. Please check Line # 26")
  println()
  println()


  var obj6 = new ExampleSeven(topic = "Overriding default values");
  println("Object " + obj6 + " has values " + obj6.topic + " and " + obj6.number + ". Topic field is taken as an argument while creating the object. ")
   println("Specified field will replace the default value which is provided in class declaration")

  println("-------------------------------------------------------------------------------------------------------------------------------------------------------")


  println("LAMBDA EXPRESSIONS. In Scala, '=>' notation is used to declare lambda functions ")
  println("Expressions in Scala start with { and end with }. Therefore, a lambda expression must be surrounded with curly brackets. Please check line # 42 ")
  var g : List[Int] = List(1,2,3,5);

  println(g);

  println("Using the lambda expression, we are printing each integer in the list g multiplied by two. Check out how it is done in Line # 42")
  g.foreach{i: Int => println(i*2)}






}
}
