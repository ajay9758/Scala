import scala.io.StdIn.readLine

object abc extends App
{
	print("Enter your first Name :")
	val f=readLine()

	print("Enter your last  Name :")
	val l=readLine()
	
	println(s"Your name is $f $l")
}