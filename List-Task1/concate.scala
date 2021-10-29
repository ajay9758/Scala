object HelloWorld {
	def main(args: Array[String]): Unit = {
  //lists are immutable ane represents linked list
  var l1: List[String] = List("asdf","qwerty","zxcv")
  
  var l2 = 1 :: (2 :: (3 :: Nil  ));
  
  
  var l3 = l1:::l2;
  
  var l4 = List.concat(l2,l1)
  
  var l5 = (l2.:::(l2))
  
  var l6 = (l1.:::(l2))
  
  println(l4);
  
  println(l5);
  println(l6);
  
	}
}
