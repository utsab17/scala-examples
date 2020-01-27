
 abstract class ExampleEleven {


   def price: Double
   def availability : Int
   def book(noOfItems : Int)


}

 object ExampleEleven {

   val standard = 0
   val premium = 1

   private class standardExample extends ExampleEleven {
     private var _availability = 500;
     override def price: Double = 2000
     override def availability: Int = _availability

     override def book(noOfItems : Int) = {
       _availability = _availability - noOfItems;
     }
   }

   private class premiumExample extends ExampleEleven {
     private var _availability = 800;
     override def price: Double = 1000
     override def availability: Int = _availability

     override def book(noOfItems : Int) = {
       _availability = _availability - noOfItems;
     }
   }

   def apply(itemType : Int) : ExampleEleven = {
        itemType match {

          case standard => new standardExample()
          case premium => new premiumExample()
          case _ => new standardExample()

        }

   }

   def main (args: Array[String]): Unit ={

     println("In this tutorial, we will learn about factory pattern in Scala")
     println("factory pattern is used to offer a single interface to instantiate one of the multiple classes. In this example, we have an abstract class ExampleEleven. See Line # 2")
     println("Inside the abstract class, we have declared three members - price, availability, and a function to book. See Line # 5,6,7")

     println("let's say - we need to create a library for a item purchase application. There are two choices for the items - standard and premium")
     println("Inside the object, we have created inner classes that implements the function book for each type of item. In the inner class, we have added an extra field _availability for each type of item")
     println("We also have added an apply method which returns an object of type ExampleEleven --> inside this method --> we have pattern matched the item type and returned the instance of the inner class ")
     val s = ExampleEleven(premium)

     println();
     println("Availability of premium item before booking : " + s.availability)

     println("Now, let's book 50 of premium items. See Line # 63")
     s.book(50)


     println();
     println();
     println("Availability after booking 50 items is " + s.availability)
     println();
     println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------")
   }
 }
