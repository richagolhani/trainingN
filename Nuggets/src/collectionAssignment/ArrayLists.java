package collectionAssignment;

import java.util.ArrayList;
import java.util.List;


public class ArrayLists {

	public static void main(String[] args) {
		List<String> strs;
		
		strs=new ArrayList<String>();
		
		strs.add("Richa");
		strs.add("Aishwarya");
		strs.add("Shradha");
		strs.add("Abeer");
		
		for(String s:strs){
			System.out.println(s);
		}
		
		if(strs.contains("xyz")){
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}
}
}