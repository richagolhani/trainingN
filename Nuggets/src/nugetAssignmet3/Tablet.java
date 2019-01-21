package nugetAssignmet3;

public class Tablet extends Medicine{

	@Override
	public String displayLabel(Company c){
		return c.getCname()+" "+c.getProducts()+"keep away from reach of sunlight";
		
	}
}
