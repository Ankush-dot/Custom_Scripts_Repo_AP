package practice_code.java.io;

public class FindGCDNumbers {
	
	static int gcd(int m, int n) {
		
		while(m!=n) {
			if(m>n) 
				m= m-n;
			else
				 n=n-m;
		}
		return m;
		
	}
	
	public static void main(String[] args) {
		int a=10 ,b = 20;
		System.out.println(gcd(a,b));
	}

}
