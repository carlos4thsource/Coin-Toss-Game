import java.util.Random;
public class Main {
	
	public static void main (String[] args) {
		int [] values=new int [3];
		int x=0;
		boolean y=true;
		Random numRandom=new Random();
		for(int a=0;a<3;a++) {
			values[a]=numRandom.nextInt(3);	
			System.out.println("Result of the intent: "+values[a]);
			
			if (a==0) {
				x=values[a];
			}
			else {
				if (x==values[a]) {
					x=values[a];
				}
				else {
					x=values[a];
					y=false;
				}
			}
		}
		
		if (y==true) {
			System.out.println("You Won!");}
		
		else 
		{System.out.println("You Lost!");}
			
			
		}
	}
	
