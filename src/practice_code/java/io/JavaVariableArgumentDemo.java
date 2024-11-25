package practice_code.java.io;

public class JavaVariableArgumentDemo {
	
	public void show(int ...a) {
		
		for(int x:a){
			System.out.print(x + " ");
		}
	}
	
	public static void main(String[] args) {
		
		JavaVariableArgumentDemo jva = new JavaVariableArgumentDemo();
		jva.show();
		jva.show(10,20,30,50);
		jva.show(new int[] {1,3,5,7,8,3,5,7});
	}
}
