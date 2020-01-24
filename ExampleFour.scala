trait MyTrait {
  def pet
  def pet_color
  def greet
}

trait MyTrait1 {
  def greetAgain: Unit = {
    println("This method is defined in trait MyTrait1. Please have a look. ")
  }
}

class ExampleFour extends MyTrait {
  override def pet(): Unit = println("I have a Dog")

  override def pet_color(): Unit = println("It is White in color")

  def pet_name(): Unit = println("Tommy")

  override def greet: Unit = println("Welcome to Tutorial on Traits. Traits are like interface in Java but more powerful. This line is printed by greet method of class ExampleFour")
}

class Ex4 extends MyTrait {
  override def greet: Unit = println("This line is printed by the method of Class Ex4")

  override def pet: Unit = println("I have a Cat")

  override def pet_color: Unit = println("It is Black in color")
}

class Ex5 extends MyTrait with MyTrait1 {
  override def pet: Unit = println("I have a Horse")

  override def pet_color: Unit = println("It is Brown in color")

  override def greet: Unit = println("Please take a look at how this line is printed. This is coming from a class which has inherited two traits. Check out how it is done")
}

  object Main6 {
    def main(args: Array[String]): Unit = {
      println();
      println();

      var obj = new ExampleFour();

      obj.greet
      obj.pet
      obj.pet_color()
      println();

      var obj1 = new Ex4();
      obj1.greet
      obj1.pet
      obj1.pet_color

      println()
      println("----------------------------------------------------------------------------------------------------------------------")
      println();
      var obj2 = new Ex5();
      obj2.greet
      obj2.pet
      obj2.pet_color
      obj2.greetAgain


    }
  }

