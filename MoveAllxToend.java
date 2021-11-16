package recursion;

public class MoveAllxToend {

	public static void main(String[] args) {
		String x="sxdscxzxdsfxsdxsdaf";
		int idx=0,count=0;
		String newStr="";
		MoveX(x,idx,count,newStr);
//		System.out.println(s);

	}

	private static void MoveX(String x, int idx, int count, String newStr) {
		
		if(idx==x.length())
		{
			while(count>0)
			{
				newStr+='x';
				count--;
			}
			System.out.println(newStr);
		}
		else if(x.charAt(idx)=='x')
		{
			count++;
			MoveX(x, idx+1, count, newStr);
		}
		else {
			newStr+=x.charAt(idx);
			MoveX(x, idx+1, count, newStr);
		}
			
		
	}



	}
