import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0) {
		    int N = sc.nextInt();
		    String A = sc.next();
		    String B = sc.next();
		    
		    int countA = 0;
		    int countB = 0;
		    for(int i = 0; i<N; i++){
		        if (A.charAt(i)=='a'){
		         countA++;
		        }
		    }
		    if (B.charAt(i)=='a')
		    countB++;
		}
	}
	if(countA + countB ==N) {
	    System.out.print("YES");
	}
	else{
	    System.out.println("NO")
	}
		    
		    
		}

	

