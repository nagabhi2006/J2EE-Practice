import java.util.Arrays;


public class MovieRating
{
	public static double calculate(int[] mark,int lowCount,int highCount)
	{	
			
			double average = 0;
			
			Arrays.sort(mark);
			for(int n : mark)
				System.out.print(" "+n);
			
			int size = mark.length;
			int sum = lowCount+highCount;
			int newMarks[] = new int [size-sum];
			
			for (int i = 0; i < newMarks.length; i++) 
			{
				newMarks[i] = mark[lowCount++];			
			}
			
			for (int i = 0; i < newMarks.length; i++) 
			{
				average = average+newMarks[i];
			}
			
			System.out.println("\n New Average is => "+(average/newMarks.length));
			return (average/newMarks.length);		
	}
	
	public static void main(String[] args) 
	{
		//int mark[] = {23,23,23,23,23,23,23,23};
		
		//int mark[] = {1,1,0,0,1,1,0,1,0,2};
		
		//int mark[] = {70,99,96,0,30};
		
		int mark[] = {31,52,20,86,47,76,82,27,42,29};
		
		//int mark[] = {91,90,50};
		
		int lowCount = 5;
		int highCount = 4;
		
		calculate(mark, lowCount, highCount);
				
	}
}
