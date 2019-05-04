import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m= 3;
    int count;
    for(count=1; count<=n;count++)
      if(count%3 == 0){
      System.out.print(count +",");
      }else
   
       System.out.print(count);
      
    
  }
}