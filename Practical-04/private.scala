class abc
{
	private var a: Int =12
	def display()
	{
		a=8
		println(a)
	}
}

object access extends App
{
	var e = new abc()
	e.a   error
	//e.display()  print 8
}