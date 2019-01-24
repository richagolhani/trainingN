package collectionAssignment;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



public class UserInterfaceMain {

	public static void main(String[] args) {
		
		List<UserInterface> UI;
		
		UI=new LinkedList<UserInterface>();
		
		/*UserInterface u=new UserInterface();
		Scanner sc=new Scanner(System.in);
		u.setOption(sc.nextInt());*/
		
		UI.add(new UserInterface(1));
		UI.add(new UserInterface(1));
		UI.add(new UserInterface(1));
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		
		List<UserInterface> Name;
		Name=new LinkedList<UserInterface>();
		while(choice!=3){
		
		if(choice==1){
			Name.add(new UserInterface(args[0],args[1]));
		}
		if(choice==2){
				for(UserInterface ac:Name){
				System.out.println(ac);}
		}
		if(choice==3){System.exit(0);}
		choice=sc.nextInt();
	}	
}
	
}
