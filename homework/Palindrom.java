package week1.homework;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 121; //input value
		int output = 0;  //Output where reversed value to be stored
		
		int temp = input; //Original Input value
		for ( ;temp>0; temp = temp / 10) {
			int rem = temp % 10;
			output = (output*10)+rem;
		} 
		if (input==output) {
			System.out.println(input + " " + "is a Palindrom");
		}
		else {
			System.out.println(input+" "+"is not a palindrom");
		}	
	}

}
