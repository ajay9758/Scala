class fun{
	def check(s1 :String , s2:String , s3:String ,arr:Array[Char]):Unit ={
		println(s1.compareTo(s2)) //0

		println(s2.toLowerCase()) //

		println("Index of 'd' is=" + (s3.indexOf('d'))) //2

		println("Index of substring is = " +(s3.indexOf("ng")))	

		println(String.copyValueOf(arr))

	
}
}

object demo
{
	def main(args:Array[String]){
	
	var s1 = "ABC"
	var s2 = "ABC"
	var s3 = "coding"

	var arr = Array('s' ,'c','a','l','a')
	
	var obj = new fun()
	obj.check(s1 , s2 , s3 ,arr)

}
}