package nugetAssignmet3;

public class Syrup extends Medicine{


	@Override
	public String displayLabel(Company c){
		return c.getCname()+" ("+c.getProducts()+" store in cool place )";
		
	}
}
