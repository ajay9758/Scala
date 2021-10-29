object HelloWorld {
	def main(args: Array[String]): Unit = {
  //lists are immutable ane represents linked list
  var l1: List[String] = List("asdf","qwerty","zxcv")
  
  var l2 = "abc" :: ("fgh" :: ("qwre" :: Nil  ));
  
  println(l1);
  
  println(l2);
  
  
	}
}
