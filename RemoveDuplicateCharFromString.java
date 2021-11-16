package common_questions;

public class RemoveDuplicateCharFromString {

	public static void main(String[] args) {
		

		String s="sdfagcgfx";
		boolean map[]=new boolean[26];
		String newStr="";
		int idx=0;
		RemoveDuplicateChar(s,map,idx,newStr);
		
	}

	private static void RemoveDuplicateChar(String s, boolean[] map,int idx, String newStr) {
		
		if(idx==s.length())
		{
			System.out.println(newStr);
		}
		else if(map[s.charAt(idx)-'a']==false)
		{
			map[s.charAt(idx)-'a']=true;
			newStr+=s.charAt(idx);
			RemoveDuplicateChar(s, map, idx+1, newStr);
		}
		else
			RemoveDuplicateChar(s, map, idx+1, newStr);
		
	}

}
