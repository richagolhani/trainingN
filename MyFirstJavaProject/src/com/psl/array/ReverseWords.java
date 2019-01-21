package com.psl.array;

public class ReverseWords {

	public void reverseWords(String str)
	{
		String[] words=str.split(" ");
		String reversedString="";
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseWord=reverseWord+word.charAt(j);
			}
			reversedString=reversedString+reverseWord+" ";
			
		}
		System.out.println(str);
		System.out.println(reversedString);
	}
	public static void main(String[] args) {
		ReverseWords obj=new ReverseWords();
		obj.reverseWords("To be or not to be");
	}
}
