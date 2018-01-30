import java.math.*;
import java.util.*;

public class Mouse {
	
	int cols = 5;
    int rows = 5;                
    Random rand = new Random();
    int colrad = rand.nextInt(5);
    int rowrad = rand.nextInt(5);
    int[][] myArray = new int[cols][rows];
    
	 Mouse (){
			              
        for (int i = 0; i < cols; i++)
          for (int j = 0; j < rows; j++)
                myArray[i][j] = 0;
        myArray[colrad][rowrad] = 1;

                  
        //display output

        for(int i = 0; i < myArray.length; i++) {
            for(int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }

            System.out.println();
           
        }                           

 }
	

}
