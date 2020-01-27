import scala.collection.mutable.Stack;
class ExampleNine {

  var s = Stack[Int]();

}

object main11 {

  def main (args: Array[String]) : Unit = {
    println("---------------------------------------------------------------------------------------------------------------------------------------")
    println();
    println("In this tutorial, we will learn about Stacks in Scala. We import stacks from scala.collection.mutable.Stack")

    println("we have created a Stack in Line # 4. ")

    var obj = new ExampleNine();
    obj.s.push(5)
    obj.s.push(6)
    obj.s.push(7)
    obj.s.push(8)


    println("push() is used to push an element to the stack. Stack follows last-in, first-out principle")
    println("Element that is pushed last will be the element that will be returned first")



    println("------------------------------------------------------------------------------------------------------------------------------------------")
    println("we have pushed integer 5,6,7,8 to the stack in the same order ")
    println("Lets see what our stack looks like at the moment -->  " + obj.s.toString);

    println();
    println();
    println("pop() function is used to remove and return the topmost element from the stack");
    println("size() function is used to return the size of the stack")

    println("let's remove the topmost element from the stack. Please check Line # 39")
    var b = obj.s.pop();
    println("The returned element is " + b)
    println();
    println("Stack after removal of the topmost element becomes " + obj.s.toString())
    println("The size of the stack becomes " + obj.s.size)

  }

  println("--------------------------------------------------------------------------------------------------------------------------------------------")

}
