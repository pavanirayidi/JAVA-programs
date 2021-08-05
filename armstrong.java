import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	    int temp,digit=0,sum=0,r;
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    
	    while(n>0){
	        digit+=1;
	        n=n/10;
	        
	    }
	    System.out.println(digit);
	    temp=n;
	    while(temp>0){
	        r=temp%10;
	        sum+=(Math.pow(r,digit));
	        temp=temp/10;
	        System.out.println(sum);
	    }
		
	}
}
