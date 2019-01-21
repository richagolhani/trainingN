package nugetAssignmet3;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		Medicine me[]=new Medicine[10];
		int value;
	
	
		Company c=new Company();
		Medicine m=new Medicine();
		Tablet t=new Tablet();
		Syrup sy=new Syrup();
		
		c.setCname(" Ciplox ,");
		c.setCaddress(" XYZ ");
		
		String str=m.displayLabel(c);
		System.out.println(str);
		
		for(Medicine med:me){
		Random r =new Random();
		value=r.nextInt(3);
		if(value==1)
			{c.setProducts("Tablets ");
			String s=t.displayLabel(c);
			System.out.println(s);}
		else if(value==2)
			{c.setProducts("Syrup ");
			String s=sy.displayLabel(c);
			System.out.println(s);}
		}
		
}
}
