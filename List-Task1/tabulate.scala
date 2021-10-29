object HelloWorld {
	def main(args: Array[String]): Unit = {
  
  var a =  List.tabulate(5)(n=>n*n)
  
  println(a)
  
  println(a.length)
  
  println(a.reverse)
  
	}
}
