class fun
{
	def sq(v :Int): Int = 
	{v*v}
	
	def cube(v :Int):Int = 
	{v*v*v}

	def fp(v :Int):Int = 
	{v*v*v*v}


}

object fun
{
	def main(args:Array[String]):Unit =
{
	println("Enter a number");
	var n :Int = 0
	n = scala.io.StdIn.readInt()
	var obj = new fun()

	println(" Square = " + obj.sq(n))
	println(" Cude = " + obj.cube(n))
	println(" Fourth power = " + obj.fp(n))
}
}