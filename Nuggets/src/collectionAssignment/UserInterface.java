package collectionAssignment;

public class UserInterface {

	private int option;
	
	private String fname,lname;
	
	public UserInterface(int option) {
		super();
		this.option = option;
	}

	
	public UserInterface(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}


	public int getOption() {
		return option;
	}

	public void setOption(int option) {
		this.option = option;
	}

	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString(){
		return String.format("|%s  |  %s|",getFname(),getLname());
	} 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + option;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInterface other = (UserInterface) obj;
		if (option != other.option)
			return false;
		return true;
	}
	
	
	
	
}
