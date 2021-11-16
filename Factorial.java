package mathamaticals_operations;

public class Factorial {

	public static int FactR(int x) {
		if(x==0) {
			return 1;
		}
		return x*FactR(x-1);
	}
	public static int FactI(int x) {
		int fact=1;
		while(x>0)
		{
			fact=fact*x;
			x--;
		}
		return fact;
	}
	public static void main(String[] args) {
		int x=5;
		
		System.out.println(FactR(x));
		System.out.println(FactI(x));

	}

}
