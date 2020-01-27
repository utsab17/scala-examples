

class ExampleEight {

  var array = Range(1, 20, 2)


  var newArray = Array.ofDim[Int](2,2);

  newArray(0)(0) = 2;
  newArray(0)(1) = 1;
  newArray(1)(0) = 3;
  newArray(1)(1) = 4;

}



object Main10{

  def main (args: Array[String]) : Unit = {

    println("In this tutorial, we will learn about Arrays and Multi-dimensional arrays. We can create Arrays with Range() method which takes starting number, and an upper limit")
    println("it will then generate an array with those numbers. Range() method can optionally also take JUMP as third parameter, which will be used specify a sequence in the array");
    var a = new ExampleEight()

    println();
    println("Please check out how this array is created in Line # 7. " + "---> " +  a.array.toList)

    println();
    println("Now, we will apply lambda expression to print each element of the array. Please check how it is done in Line # 27.")
    println(a.array.foreach{i : Int => println(i)})


    println("----------------------------------------------------------------------------------------------------------------------------------------------")
    println("Multidimensional Array ---Array.ofDim[Int](n1, n2) is used to create a multidimensional array. Check out how it is done in Line # 7")

    for(i <- 0 to 1){
      for(j <- 0 until 2){
        print(i, j)
        println("=" + a.newArray(i)(j))
      }
    }





  }
}