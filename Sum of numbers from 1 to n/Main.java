import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner in =  new Scanner(System.in);
      int n = in.nextInt();
      int num =0;
      int sum = 0;
      for(num=0;num<=n;num++)
        sum = sum + num;
      System.out.println(sum);
	}
}