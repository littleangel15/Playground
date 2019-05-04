import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      Scanner in =new Scanner(System.in);
      int num = in.nextInt();
      int num1= num/100;
      int num2 = (num%100)%10;
      int sum= num1+num2;
      System.out.println(sum);
		// Type your code here
	}
}