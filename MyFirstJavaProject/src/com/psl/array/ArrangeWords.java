package com.psl.array;

public class ArrangeWords {

	public void arrangeWords(String str)
	{
		String[] words=str.split(" ");
		String arrangedString="";
		for(int i=0;i<words.length;i++)
		{
			char[] charArr=words[i].toCharArray();
			char[] charA=words[i+1].toCharArray();
			for(int j=0;j<words.length.length;j++)
			{
				if(charArr[j]>)
			}
		}

			/*for(int k=i+1;k<words.length;k++)
			{
				
				if(words[k]<words[i])
				{
					temp=words[i];
					words[i]=words[k];
					words[k]=temp;
				}
			}
			}
			/*
			String word=words[i];
			for(int j=0;j<word.length();j++)
			{
				{
					for(int k=j+1;k<word.length();k++)
					newWord=newWord+word.charAt(j);
				}
			}
			arrangedString=arrangedString+newWord+" ";
			
		}*/
		
		//System.out.println(reversedString);
	}
	public static void main(String[] args) {
		ArrangeWords obj=new ArrangeWords();
		obj.arrangeWords("To be or not to be");
	}
}
