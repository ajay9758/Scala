object Test
{

def f(x: AnyVal)=println("AnyVal:" +x)
def p(z: AnyRef)=println("AnyRef:" +z)

def main(args: Array[String]) 
{
    var a: Boolean = true
    var a1: Byte = 126
    var a2: Float = 2.45673f
    var a3: Int = 3
    var a4: Short = 45
    var a5: Double = 2.93846523
    var a6: Char = 'A'
    var a7: String="Scala Programming"

  //  val nullref:String=null
  //  nullref.length               java.lang.NullPointerException: Cannot invoke "String.length()" because "nullref" is null
   
   // val nullref:String=Null
   //println(nullref.length)  error: not found: value Null

	val nullref:Null=null
	println(nullref)	 //print null

    f(2)
    f('s')
    p(nullref)
    println("boolean:" + a)
    println("byte:" + a1)
    println("float:" + a2)
    println("integer:" + a3)
    println("short:" + a4)
    println("double:" + a5)
    println("char:" + a6)
    println("string:" + a7)

def g(y: (Int)=>Unit)={
	y(1)
}
g(println)

}
}