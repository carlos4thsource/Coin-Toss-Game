import java.util.Random;
public class Main {

	public static void main (String[] args) {
		Game g=new Game();
		int result2;
		Random numRandom=new Random();
		for(int a=0;a<10;a++) {
			result2=numRandom.nextInt(2);
			if (result2==1)
				g.heads=g.heads+1;
			else
				g.tails=g.tails+1;
				
		}
		g.result=g.heads+g.tails;
		
		System.out.println("Number of tosses: "+g.result);
		System.out.println("Number of heads: "+g.heads);
		System.out.println("Number of tails: "+g.tails);
	}	
}
