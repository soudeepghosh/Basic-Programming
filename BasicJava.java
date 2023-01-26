import java.lang.*;
import java.util.Scanner;
class BasicJava{
	public static void main(String args[]){
    /*  // Type casting 
        int a = 125;
		int b = 24;
		double c = (double)a/(double)b;
		double d = (double)a%(double)b;
		System.out.println(c);
		System.out.println(d);
    */		
	
	/*	// increment and decrement operator
		int a = 10;
		int b = 20;
		System.out.println(a++);// a=10 because a++ will update the value on next line
		System.out.println(a);// a=11 here value is updated
		System.out.println(++a);// a=12, ++a updates the value on same line 
		System.out.println(a++);//a=12, once again the is not updated here it will be updated on next line
        System.out.println(a);// a=13, over all value of a is updated
    */		
	
    /*	
		//Scanner class for user input
		Scanner sc = new Scanner(System.in);
		int a;
		//char c;
		double d;
		String s;
		
		System.out.println("Enter an integer: ");
		a = sc.nextInt();
		//c = sc.nextChar();
		System.out.println("Enter an decimal: ");
		d = sc.nextDouble();
		sc.nextLine(); // This line we have to add(It consumes the \n character)
		System.out.println("Enter your full name: ");
		s = sc.nextLine();		//
		System.out.println("a="+a+"  "+"  "+"d="+d);
		System.out.println("Name: " + s);
		
	*/
	
	/*
		//Conditional statement if-else
		//Conditional operator:  >, <, >=, <=, ==, != 
		System.out.println("Enter your age : ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>=18){
			System.out.println("You can vote.");
		}
		else{
			System.out.println("You can't vote.");
		}
	*/
    /*    // Switch case
        char grade;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade(in capital letter): ");
		grade = sc.next().charAt(0);
		
		switch(grade) {
			case 'A':
		    	System.out.println("Your grade is very good.");
                break;	
			case 'B':
		    	System.out.println("Your grade is good.Keep Studying.");
                break;	
			case 'C':
		    	System.out.println("Do hard work and keep improving.");
                break;
			default:
		    	System.out.println("Wrong Input");
        }				
		*/

        //Loop
	/*
        for(int i=0;i<10;i++){
			System.out.println("Hello World! "+i);
		}
        int j = 20;
        while(j<100){
			System.out.println(j);
			j++;
		}
    */		
	/* // Do-While	
		int a = 23;
		do {
			System.out.println(a);
			a++;
		} while(a<100);
    */
    /*  // While loop and continue statement
        int a = 0;
        while(a<=5){
			a++;
			if(a==2) continue;   // after executing the continue statement, the following lines of code will be skipped for the current iteration only. 
			System.out.println(a);
		}		
	*/  
	    
		//Array syntax 1
        /*int arr[] = new int[5];
		arr[0] = 93;
		arr[1] = 45;
		arr[2] = 37;
		arr[3] = 10;
		arr[4] = 33;*/
		/*int arr[] = {93,45,37,10,33}; //Array syntax 2
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}*/
	/*	
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++){
			System.out.println("arr["+i+"]="+arr[i]);
		}
	*/
	
	
	}
}