import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num =0;
      for(num=0; num<=2*n; num++){
        if(num%2 == 1)
          System.out.println(num);
      }
	}
}