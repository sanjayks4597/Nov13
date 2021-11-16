package recursion;

public class FindFirstAndLastOccurance {

	public static void firstnLast(String s,int index,char c,int first,int last) {
		if(index>s.length()-1)
		{
			System.out.println("first: "+first+" "+"last:"+last);
			return;
		}
			
		if(s.charAt(index)==c)
		{
			if(first==-1)
				first=index;
			else
				last=index;
		}
		firstnLast(s, index+1, c, first, last);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="bcdfama";
		char c='a';
		
		int first=-1,last=-1,index=0;
		firstnLast(s,index,c,first,last);

	}

}
