class ExampleTwelve {


}


object main13 {

  def main(args: Array[String]): Unit = {

    println("In this tutorial, we will learn about lazy val. Lazy keyword changes the val to get lazily initialized")

    lazy val number = {
      println("Initialization for the first time")
      50
    }
    System.out.println("")
    println(number)

    println("val number is a lazy val so for the first time when it accessed, it returns 'Initialization for the first time and the number 12 . Check Line # 13")

    println("If we access val number again, it only returns the number 50")
    println(number)

    println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------")

    println(":: is the cons (Constructor) operator. We can use :: to append element to the list");

    val myList = 5::7::9::11::Nil

    println(myList)

    val  myList1 = myList::(10::Nil)

    println(myList1)


  }
}