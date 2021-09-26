import scala.io.StdIn.readLine
class check{

	def max_min(a : Int, b: Int) : Unit={
	if(a>b)
	println( a +" is max and " +b+ " is min")

	else
	println( b +" is max and " +a+ " is min")

}
}
object q1 extends App
{

 var a : Int =0
 var b : Int = 0
 println("enter two numbers")
 a = scala.io.StdIn.readInt()
 b=  scala.io.StdIn.readInt()

 var obj = new check()

 obj.max_min(a,b)

}