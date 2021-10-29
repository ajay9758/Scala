object HelloWorld {
	def main(args: Array[String]): Unit = {
  
  var a = List.fill(5)("abc")
  
  var b = List.fill(5)(2)
  
  println(a)
  
  println(b)
  
  var c :List[String] = List("Abc" , "qwe" , "zxc");
  
  var  d = a:::(b:::c)
  
  println(d)
  
  
	}
}
