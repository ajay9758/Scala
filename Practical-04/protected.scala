class abc
{
	protected var a: Int =12
	def display()
	{
		a=8
		println(a)
	}
}
class new1 extends abc
{
	def display1()
	{
		a=9
		println(a)
	}
}
object access extends App
{
	var e = new abc()
	e.display() //print 8
	var e1 =new new1()
	e1.display1()  //print 9
}