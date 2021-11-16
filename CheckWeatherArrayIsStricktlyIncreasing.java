package recursion;

public class CheckWeatherArrayIsStricktlyIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []x= {1,2,3,3,4,5};
		int index=0;
		boolean b=CheckWeather(x,index);
		System.out.println(b);

	}

	private static boolean CheckWeather(int[] x, int index) {
		
		if(index==x.length-1)
			return true;
		if(x[index]<x[index+1])
		{
			return CheckWeather(x, index+1);
			
		}
			return false;
	}

}
