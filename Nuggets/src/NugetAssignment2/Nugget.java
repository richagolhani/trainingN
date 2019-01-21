package NugetAssignment2;
import java.util.*;
public class Nugget {
public static void main(String[] args) {
	char[][] arr=new char[3][3];
	int j=0,i;
	Scanner s=new Scanner(System.in);
	
	
	for(i=0;i<arr.length;i++)
	{
		for(j=0;j<arr.length;j++){
			arr[i][j]=s.next().charAt(0);
		}
		System.out.println(i);
		if(arr[i][j-1]==arr[i+1][j-1]&&arr[i+1][j-1]==arr[i+2][j-1]){
			System.out.println("yes");
		}
		System.out.println(j);
		System.out.println(i);
	}
	if(arr[i][j-3]==arr[i][j-2]&&arr[i][j-2]==arr[i][j-1]){
		System.out.println("yes");
	}
	for(i=0;i<arr.length;i++)
	{
		for(j=0;j<arr.length;j++){
			if(arr[i][j]==arr[i][j+1]&&arr[i][j+1]==arr[i][j+2])
				System.out.println("yes");
			else if(arr[i][j]==arr[i+1][j]&&arr[i+1][j]==arr[i+2][j])
				System.out.println("yes");

		}
		
	}
	/*if(arr[i][j-3]==arr[i][j-2]&&arr[i][j-2]==arr[i][j-1])
	{
		System.out.println("yes");
	}
	else if(i==j&&arr[i][j]==arr[i+1][j+1])
		System.out.println("yes");*/
}
}
