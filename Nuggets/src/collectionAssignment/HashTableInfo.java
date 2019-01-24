package collectionAssignment;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class HashTableInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	
	List<Product> prod;
	prod=new LinkedList<Product>();
	
	prod.add(new Product("P_Id","PName"));
	prod.add(new Product("P001","AAA  "));
	prod.add(new Product("P002","BBB  "));
	prod.add(new Product("P003","CCC  "));
	
	for(Product ac:prod){
		System.out.println(ac);
	}
	
	if(prod.contains(new Product("P001", " "))){
		System.out.println("found");
		prod.remove(new Product("P001", " "));
		System.out.println("deleted");
	}

	for(Product ac:prod){
		System.out.println(ac);}
}
}