import scala.io.StdIn.readLine
class check{

	def max_min(a : Int, b: Int) : Unit={

	def max()= {
	if(a>b)
	println( a +" is max")

	else 
	println( b +" is max")	
}

	def min()= {
	if(a < b)
	println( a +" is min")

	else
	println( b +" is min")
}
max()
min()

}
}


object q2 extends App
{

 var a : Int =0
 var b : Int = 0
 println("enter two numbers")
 a = scala.io.StdIn.readInt()
 b=  scala.io.StdIn.readInt()

 var obj = new check()

 obj.max_min(a,b)

}