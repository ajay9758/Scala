import util.control._
import scala.io.StdIn._

class Brek{
 def breakContinue() = {
        var breakObj = new Breaks
        
	breakObj.breakable{
            println("\nBreak :\n")
            for (i <- 1 to 10){
                if (i == 3)
		{
                    println("Found 3")
                    breakObj.break
                }
                println(i+" is not equal to 3")
            }
        }

        println("\nContinue:\n")
        for (i <- 1 to 10){
            breakObj.breakable{
                if (i == 3){
                    println("Found 3")
                    breakObj.break
                }
                println(i+" is not equal to 3")
            }
        }
    }
}

object q4 extends App
{
	var obj = new Brek()
	obj.breakContinue()
	
}