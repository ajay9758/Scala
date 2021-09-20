import scala.util.control.Breaks._
class number
{
 	def check(x :Int): Unit ={
	var check = false
	for(i <- 2 to x/2){
	if(x % i ==0){
	check = true
	}
	}
	if(check == true){
	println(" Not prime")
	}
	else{
	println("it is prime")
	}
    }
}

object Prime
{
	def main(args: Array[String]): Unit =
{
	var obj = new number()
	println("enter a number: ")
	var n : Int =0
	n = scala.io.StdIn.readInt()
	obj.check(n)
	
}
}
	