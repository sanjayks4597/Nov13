package common_questions;

public class FindMinimumInArray {

	public static void main(String[] args) {
		
		int x[]= {4,5,6,3,-7,9};
		int idx=0;
		int min=Integer.MAX_VALUE;
		
		int min1=FindMin(x,idx,min);
		System.out.println(min1);

	}

	private static int FindMin(int[] x, int idx,int min) {
		if(idx==x.length)
		{
			return min;
		}
		
		if(x[idx]<min)
		{
			min=x[idx];
			return FindMin(x, idx+1, min);
		}
		else
			return FindMin(x, idx+1, min);
	}

}
