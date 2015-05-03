

import java.util.ArrayList

object Test {

  def main(args: Array[String]) {
    //    val filesHere = (new java.io.File(".")).listFiles

    //for( file <-filesHere  if file.isFile  if file.getName.endsWith(".cache"))  println(file)

    //    for(i <- 1 to 4)

    //         println("interation: " + i)
    //    println(new TestClass().gcd(3, 2))

    //    val files = (new java.io.File(".")).list()
    //    for(file <- files)
    //    {
    //      println(file)
    //    }

    val filesHere = (new java.io.File(".")).listFiles
    def getFiles = {
      for {file <- filesHere if file.getName.contains(".project")} yield file
    }
    def fileLines(file: java.io.File) =
      scala.io.Source.fromFile(file).getLines().toList
  
    def grep(pattern: String) =
      for {
        file <- filesHere if file.getName.endsWith(".project")
        line <- fileLines(file) if line.trim.matches(pattern)
      } println(file + ":" + line.trim)

   for{
     f <- getFiles 
    }println(f.getName)
    val firstArg = "salt"
val a = firstArg match {
  case "salt" => ("pepper")
  case "chips" => ("salsa")
  case "eggs" => ("bacon")
  case _ => ("huh?")
}
    
    println(a)
    
    
    import scala.util.control.Breaks._
import java.io._

//val in = new BufferedReader(new InputStreamReader(System.in))
//var i = 0
//breakable {
//  while(true) {
//    i = i+1
//    println("? " +(i))
//    
//    if(in.readLine()=="") break
//  }
//}

    import java.util.{Date, Locale}
    import java.text.DateFormat._
    val now = new Date
    
       val df =getDateInstance(LONG, Locale.CHINESE)
       println(df format now)
   
       
       new LongLines().processFile1("./test.txt", 4)
   var i = 0
   var incr = (i:Int, j:Int, j4:Int, j3:Int, j2:Int, j1:Int) => i+1
   println("a " + incr)
   
   
   
   val someNumbers = List ( -11, -10, - 5, 0, 5, 10)
   someNumbers.filter ( x => x>4 ).foreach ( aa => println(aa) )
   someNumbers.filter ( _> -4 ).foreach ( aa => println(aa) )
   val f = (_:Int) + (_:Int) - (_:Int)
   println(f(2,3,4)) 
   someNumbers.foreach { println(_)}
   def sum = (_:Int) + (_ :Int) + (_ :Int)

   val b = sum ( 1 , _ :Int, 3)
   println(b(5))
   var xx = new ArrayList[String]()
//   xx.add("a":Nothing)
  // var more = 10
    def makeIncreaser(more:Int) = (x:Int) => x + more
    
    val inc1 = makeIncreaser(1)
    println(inc1(32))
    xx.add("a")
    xx.toArray().foreach { println }
//   var xx 
    def echo (args: String *) = for (arg <- args) println(arg)

    val arr= Array("What's","up","doc?")
    echo(arr: _*)
    println(arr(2))
    var jetSet = Set("Boeing", "Airbus")  
jetSet += "Lear"  
println(jetSet.contains("Lear"))

import scala.collection.mutable.Set  
val movieSet = Set("Hitch", "Poltergeist")  
movieSet.+= ("Shrek")  
println(movieSet) 

import scala.collection.immutable.HashSet  
val hashSet = HashSet("Tomatoes", "Chilies")  
println(hashSet + "Coriander") 


import scala.collection.mutable.Map  
val treasureMap = Map[Int, String]()  
treasureMap += (1 -> "Go to island.")  
treasureMap += (2 -> "Find big X on ground.")  
treasureMap += (3 -> "Dig.")  
println(treasureMap(2)) 
val oneTwo = List(1, 2)  
val threeFour = List(3, 4)  
val oneTwooneTwoThreeFour = oneTwo ::: threeFour  
println(oneTwo + " and " + threeFour + " were not mutated.")  
println("Thus, " + oneTwooneTwoThreeFour + " is a new List.")

val twoThree = List(2, 3)  
val oneTwoThree = 1 :: twoThree  
println(oneTwoThree)  

    
    val pair = (99, "Luftballons","test")  
println(pair._1)  
println(pair._2)
println(pair._3)
    
  }

}