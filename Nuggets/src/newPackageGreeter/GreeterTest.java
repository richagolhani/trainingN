package newPackageGreeter;
import java.util.Random;

import com.persistent.app.*;

public class GreeterTest {

public static void main(String[] args) {
		
	int len = args.length;

	Greeter obj[] = new Greeter[len];
	for(int i=0;i<len;i++)
	{
		Greeter g=new Greeter(args[i]);
		String s= obj[i].sayHello();
		String str=obj[i].sayBye();
		System.out.println(s);
		System.out.println(str);
		
		Advisor a= new Advisor();
		Random r=new Random();
		String advice=a.advices(r.nextInt(3));
		
		System.out.println(advice);
		
	}
	
	}
}
