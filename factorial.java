import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int temp,product=1,r;
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    
	    while(n>0){
	        product=product*n;
	        n=n-1;
	        
	    }
	    System.out.println(product);
		
	}
}
