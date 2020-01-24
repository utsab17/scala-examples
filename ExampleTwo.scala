class ExampleTwo {

  def greetWelcome(): Unit ={
    println();
    System.out.println("Welcome to Example 2");
    println();
  }


  def demoWhileLoop(): Unit = {
    var number = 1;
    while (number <= 5) {
      println("Value of number : " + number);
      number += 1;
    }
  }

  def demoDoWhileLoop(): Unit ={
    var number = 6;
    do {
      println("Value of number : " + number);
    } while (number > 6);
  }

  def demoForLoop(): Unit ={
          for(w <- 0 until 10){
            println("value of w : " + w);
          }
          println();
          println();
          println();
          for (w <- 0 to 3; z <- 8 until 10){
            println("Value of w : " + w);
            println("Value of z : " + z);
          }
  }
}

class ExampleThree extends ExampleTwo {

  //override keyword is used to override a function/variable from it's parent class
  override def greetWelcome(): Unit ={
    println();
    System.out.println("Welcome to Example 3 -- this method is overriden to produce different output if called from ExampleThree object  ");
    println();
  }

}

object Main2 {

  def main(args: Array[String]): Unit = {
    var obj2 = new ExampleTwo();
    obj2.greetWelcome();
    println("Let's start with While Loop - please look at method demoWhileLoop() to understand how while loop works in Scala");
    println();
    obj2.demoWhileLoop();
    println();
    println();
    println("Do While Loops!! -->  Almost the same as while loop but the key difference is that do..while loop runs at least one time");
    println("Condition is checked only after the first execution");
    println();
    println();
    obj2.demoDoWhileLoop();
    println();
    println("----------------------FOR LOOP---------------------------")
    println();
    obj2.demoForLoop();
    println();
    println();
    println("------------Next - we will look at how we can extend a class to design an inherited class--------------------");
    var obj3 = new ExampleThree();
    obj3.greetWelcome();

    println("Notice..we have called a method of class ExampleTwo from ExampleThree object")

  }
}




