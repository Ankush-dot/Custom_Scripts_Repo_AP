package java_learnings.basic.string.io;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class JavaStringOperations implements JavaCollectionInterfaceDemo{
	
	@Override
	public void addMember() {
		// TODO Auto-generated method stub
		System.out.println("Hi All");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Ankush";
		name = name + " Pawar";
		System.out.println("Hello " + name);
//		System.out.println(name.concat(" Pawar"));
		
		JavaStringOperations jso = new JavaStringOperations();
		jso.addMember();
		jso.count1();
		JavaCollectionInterfaceDemo.count();
		
		LocalDateTime t =  LocalDateTime.now();
		System.out.println("Before Formatting : " + t);
		
		DateTimeFormatter formatDateNdTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM:SS");
		String formatDate = t.format(formatDateNdTime);
		System.out.println("After Formatting : " + formatDate);
		
		Integer myInt = 01234567;
		String myString = myInt.toString();
		System.out.println(myString.length());
	}

	
	

}
  