import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int num1= in.nextInt();
      int num2= in.nextInt();
      int num3=in.nextInt();
      int total= num1+num2+num3;
      int avg= (total/3);
      System.out.println(avg);
	}
}