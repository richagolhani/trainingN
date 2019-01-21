package NugetAssignment2;


import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		
	
		char[][] c = new char[3][3];
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < 3; i++ ){
			for(int j = 0; j< 3 ; j++)
			{
				c[i][j] = sc.next().charAt(0);
			}
		}
		System.out.println(winner(c));
	}
		public static String winner(char[][] c)
		{
			int i = 0 , j = 0;
			
			for(int k=0;k<3;k++){
				if((c[k][j] == c[k][j+1])&&(c[k][j+1] == c[k][j+2]))
				{
					return c[k][j] + " Wins";
				}}
				for(int k=0;k<3;k++){
				if((c[i][k] == c[i+1][k])&&(c[i+1][k] == c[i+2][k]))
				{
					return c[i][k] + " Wins";
				}}
			
			if((c[i][j] == c[i+1][j+1]) && (c[i+1][j+1] == c[i+2][j+2])) 
			{
				return c[i][j] + " Wins";
			}
			else if((c[i][j+2] == c[i+1][j+1])&&(c[i+1][j+1] == c[i+2][j]))
			{
				return c[i][j+2] + " Wins";
			}
			
			else
			{
				return "draw match";
			}
			
						
		}
	
}
