package java_learnings.basic.arrays.io;

public class IncreaseSizeOfArray {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,4,5,6};
		int[] b = new int[2*a.length];
		
		System.out.println("length of Array a is : " + a.length);
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		a=b;
		
		System.out.println("after length of Array a is : " + a.length);
		
		for(int x:a) {
			System.out.print(x+",");
		}
		System.out.println("");
		for(int z:b) {
			System.out.print(z+",");
		}
		
//		for(int i=a.length-1,j=0;i>=0;i--,j++) {
//				b[j]=a[i];
//		}
//		for(int x:a) {
//			System.out.print(x+",");
//		}
//		System.out.println("");
//		for(int z:b) {
//			System.out.print(z+",");
//		}
	}

}
