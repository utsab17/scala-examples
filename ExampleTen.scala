class ExampleTen {

  val add = (a: Int) => {
    a + 1
  }

  val sub = (a: Int ) => {
    a - 1
  }

}

object main12 {

  def main (args: Array[String]): Unit = {

    println();
    println("In this tutorial, we will look at function composition in Scala")
    println("In the class ExampleTen, there are two methods - add and sub. Both method take an int a as a parameter. Line # 3 and #7")

    println("In Scala, we can mix functions together. By doing so, one function holds the reference to another function in order to fulfill it's mission")

    var obj = new ExampleTen();

    println()

    println("In Line # 28, we have passed the Integer 2 to sub function of Example Ten and the result from that will be passed to the method add as an argument.")
    println((obj.add compose obj.sub) (2))

    println("to reverse the order, we can use the keyword 'andThen'")

    println((obj.add andThen obj.sub)(3))
    println("In Line # 32, argument 3 is passed to the method add and the resulting value will be passed as an argument to function sub")




  }
}
