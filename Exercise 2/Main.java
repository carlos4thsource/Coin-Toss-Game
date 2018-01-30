import javax.swing.JOptionPane;

public class Main {
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int won = 0;
		int loose = 0;
		int i=0;
	do {
		String msg = JOptionPane.showInputDialog(null,"Wanna play? \n 1) Yes \n 2)No","Question",JOptionPane.QUESTION_MESSAGE);
		i = Integer.parseInt(msg);
		

	switch(i)
	{
	case 1: 
		System.out.println("Let's play \n");
		Mouse obj = new Mouse();
		
		for (int j=1; j<6;j++)
		{
			String msg2 = JOptionPane.showInputDialog(null,"Insert coordenates Y,X - Oportunity no. " + j,"Coordenates ",JOptionPane.QUESTION_MESSAGE);
			String[] coord = msg2.split(",");
			
						
			boolean found=Cat.find(Integer.parseInt(coord[0]), Integer.parseInt(coord[1]),obj.myArray);
						
			
			if (found) {
				JOptionPane.showMessageDialog(null, "MOUSE FOUND","Result",JOptionPane.INFORMATION_MESSAGE); 
				won++;
				break;
			}
			loose++;
		}
				
		
		break;
	
	case 2: 
		JOptionPane.showMessageDialog(null, "You won " + won + " times\n" + "You loose " + loose + " times","Close game",JOptionPane.INFORMATION_MESSAGE);
		break;
	}
	
	}while(i==1);

	}

}
