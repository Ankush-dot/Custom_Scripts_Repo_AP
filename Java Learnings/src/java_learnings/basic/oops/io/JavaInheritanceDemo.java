package java_learnings.basic.oops.io;

public class JavaInheritanceDemo {
	public static void main(String[] args) {
		SciAdvCalc obj  = new SciAdvCalc();
		int r1 = obj.add(12, 8);
		int r2 = obj.sub(11, 9);
		int r3 = obj.multi(12, 8);
		int r4 = obj.div(100, 10);
		double r5 = obj.power(4, 2);
		
		System.out.println(r1+ " | " + r2 + " | " +  r3 + " | " + r4 + " | " + r5);
		
	}

}
