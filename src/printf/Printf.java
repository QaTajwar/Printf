package printf;

public class Printf { public static void main (String[]args) {
	
	// printf() = an optional method to control, format and display text to the console window
	//            two arguments = format string + (object/variable/value)
	//            % [flag] [precision] [width] [conversion-character]
	
	
	
	boolean boo = true;
	char cha = '$';
	String word = "king";
	int num = 50;
	double decimal = 30.435;
	
//	 System.out.printf("My name is tajwar, %b",boo);
//	 
//	System.out.printf("%c",cha);
//	System.out.printf("%s",word);
//	System.out.printf("%d This is an example",num);
//	                                                        // mentioning any number after % gives us space in width
//	                                                               // - 10 will go ==>  ex.%-20d  
//	System.out.printf("%50s This is an example  ",word);             // vice versa for 10 <== ex.%10d
//	
//	System.out.printf("%d I like piiza "   , 1254) ; 
	System.out.printf("decimal %50f",decimal);
	
}

}
