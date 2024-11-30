package com.java_learnings.basic.oops.io;

class Subjects
{
	private String subID;
	private String name;
	private int maxMarks;
	private int marksObtain;
	
	//constructor
	public Subjects(String subID, String name, int maxMarks) {
		//super();
		this.subID = subID;
		this.name = name;
		this.maxMarks = maxMarks;
	}
	
	

	//Getter-Setter Methods
	public String getSubID() {
		return subID;
	}
	
	public String getName() {
		return name;
	}
	public int getMaxMarks() {
		return maxMarks;
	}
	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}
	public int getMarksObtain() {
		return marksObtain;
	}
	public void setMarksObtain(int marksObtain) {
		this.marksObtain = marksObtain;
	}
	
	boolean isQualifed(int m) {
		return m>=maxMarks;
	}

	//ToString Method

	@Override
	public String toString() {
		return "\nSubjects \nsubID=" + subID + "\nname=" + name + "\nmarksObtain=" + marksObtain + "]";
	}
	
}

public class SubjectDetaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subjects sub[] = new Subjects[3];
		sub[0] = new Subjects("S101", "Physics", 100);
		sub[1] = new Subjects("S102", "Chemistry", 100);
		sub[2] = new Subjects("S103","Math", 100);
		
		for (Subjects s : sub)
		{
			System.out.println(s);
		}
		
	}

}
