object q5 extends App
{

	 val arr = Array(5,9,3,7,8,10,66,4)
	
	println("Printing Array\n")
	for(i <- arr)
	{
		print(i +"," )
	}
	
	println("\n")
	var min = arr(0)

	for(i <-1 to (arr.length -1 )){
	if(arr(i) < min) min = arr(i)
	}

println("min number is= " + min)
} 