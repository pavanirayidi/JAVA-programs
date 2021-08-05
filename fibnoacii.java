import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n1=0,n2=1,i,n3;
	    Scanner sc=new Scanner(System.in);
	    int count=sc.nextInt();
		System.out.print(n1+" "+n2);
		for(i=2;i<=count;++i){
		    n3=n2+n1;
		    System.out.print(" "+n3);
		    n1=n2;
		    n2=n3;
		}
	}
}
