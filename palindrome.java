import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int temp,sum=0,r;
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    temp=n;
	    while(n>0){
	        r=n%10;
	        sum=sum*10+r ;
	        n=n/10;
	    }
	    if(temp==sum){
		    System.out.println(temp+"is a palindrome");
	    }
	    else{
	        System.out.println(temp+"is not palindrome");
	    }
		
	}
}
