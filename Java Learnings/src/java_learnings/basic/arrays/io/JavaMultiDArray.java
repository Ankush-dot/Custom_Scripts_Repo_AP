package java_learnings.basic.arrays.io;

import java.util.Random;

public class JavaMultiDArray 
{	
	public static void main(String[] args) 
	{
		int nums[][] = new int[3][4];
		//int random = 0;
		
		for(int i = 0; i<3;i++) 
		{
			for(int j=0;j<4;j++) 
			{
				nums[i][j] = (int)(Math.random()*100);
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
			
		}
	}


}
