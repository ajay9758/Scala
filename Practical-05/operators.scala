class operators{

	def arithmeticOperator(a: Int ,b: Int ):Unit = {
		
		
		println("Addition of a + b = " + (a + b)); 			     
		println("Subtraction of a - b = " + (a - b));    
		println("Multiplication of a * b = " + (a * b)); 
		println("Division of a / b = " + (a / b));	
		println("Modulus of a % b = " + (a % b));			
		println("=======================================")
	}
	
	def relationalOperator(a: Int ,b: Int )= {
		
		
	
		println("Equality of a == b is : " + (a == b));		
    	println("Not Equals of a != b is : " + (a != b));  
		println("Greater than of a > b is : " + (a > b));	
		println("Lesser than of a < b is : " + (a < b));	
 		println("Greater than or Equal to of a >= b is : " + (a >= b));
    	println("Lesser than or Equal to of a <= b is : " + (a <= b));
		println("=======================================")
	}
	
	def logicalOperator(c: Boolean ,d: Boolean ):Unit = {
		
		
		/*Logical Operator: !(), ||, &&*/
     	println("Logical Not of !(c && d) = " + !(c && d));	
		println("Logical Or of c || d = " + (c || d));	
		println("Logical And of c && d = " + (c && d));	
		println("=======================================")
		
	}
	
	
	def bitwiseOperator(a: Int ,b: Int ):Unit = {
		var c:Int=0
		
    	
    
		/*Bit-wise Operator: &, |, ^, ~, <<, >>, >>>*/
		c = a & b;
		println("Bitwise And of a & b = " + c); 
	
 
    	c = a | b;
    	println("Bitwise Or of a | b = " + c);	
        	
		c = a ^ b;
		println("Bitwise Xor of a ^ b = " + c);	
	
		/*
		1 ^ 1 = 0
		0 ^ 0 = 0
		1 ^ 0 = 1
		0 ^ 1 = 1
		*/
		
		c = ~a;
		println("Bitwise Ones Complement of ~a = " + c); 
		
		
		c = a << 3;
		println("Bitwise Left Shift of a << 3 = " + c);	
		
		
		c = a >> 3;
		println("Bitwise Right Shift of a >> 3 = " + c);	
		
		
		c = a >>> 4;
		println("Bitwise Shift Right a >>> 4 = " + c);	
		
		
		
		println("=======================================")
	}
	
	def assignmentOperators(a: Int ,b: Int ):Unit = {
		var c: Int=0
		
		
		/*Assignment Operators: +=, -=, *=, /=, %=, <<=, >>=, &=, ^=, |=*/
    	c = a + b;
    	println("simple addition: c= a + b = " + c);		// simple addition
		c += a;
    	println("Add and assignment of c += a = " + c);		// Add AND assignment
		
		c -= a;
    	println("Subtract and assignment of c -= a = " + c);// Subtract AND assignment
		
		c *= a;
    	println("Multiplication and assignment of c *= a = " + c);// Multiply AND assignment
     
		c /= a;
    	println("Division and assignment of c /= a = " + c);// Divide AND assignment
     
		c %= a;
    	println("Modulus and assignment of c %= a = " + c);// Modulus AND assignment
		
		c <<= 3;
    	println("Left shift and assignment of c <<= 3 = " + c);// Left shift AND assignment
     
		c >>= 3;
    	println("Right shift and assignment of c >>= 3 = " + c);// Right shift AND assignment
     
    	c &= a;
    	println("Bitwise And assignment of c &= 3 = " + c);// Bitwise AND assignment
    	
     	c ^= a;
    	println("Bitwise Xor and assignment of c ^= a = " + c);// Bitwise exclusive OR and assignment
     
    	c |= a;
    	println("Bitwise Or and assignment of c |= a = " + c);// Bitwise inclusive OR and assignment
		
		println("=======================================")
	}
}

	object SampleObject{	
	def main(args: Array[String]): Unit = {
		
		var obj= new operators()			
		
		obj.arithmeticOperator(50,30)
		println()
		obj.relationalOperator(50,30)
		println()
		obj.logicalOperator(false,true)
		println()
		obj.bitwiseOperator(20,18)
		println()
		obj.assignmentOperators(20,18)
		
	}	
}
