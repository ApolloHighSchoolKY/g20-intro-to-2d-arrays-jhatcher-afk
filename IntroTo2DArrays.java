import java.util.Arrays;
import java.util.Collections;

public class IntroTo2DArrays{

  public static void main(String[] args){
    
    int[][] twoDee = new int[3][5];

    //Store incremental values in row major order
    int val = 1;
    for(int row = 0; row< twoDee.length;row++)
    {
        for(int col = 0; col<twoDee[row].length;col++)
        {
          twoDee[row][col] = val;
          val++;
        }
        //This spot here represents the complention of one row
        System.out.println(Arrays.toString(twoDee[row]));
    }
        
    //Print out the total sum of each row in the following format:
    //Row 0: 15
    //Row 1: ..
    //Row 2: ..
    int sum = 0;

    for(int row = 0; row< twoDee.length;row++)
    {
        for(int col = 0; col<twoDee[row].length;col++)
        {
          sum +=twoDee[row][col];
        }

        System.out.println("Row " + row + ":" + sum);
        sum = 0;
    }

    //Print out the sum of each column in the following
    //format:
    //Column 0: ??
    int sum2 = 0;

    for(int col = 0; col<twoDee[0].length;col++)
    {
        for(int row = 0; row< twoDee.length;row++)
        {
          sum2 +=twoDee[row][col];
        }

        System.out.println("Column " + col + ":" + sum2);
        sum2 = 0;
    }
  }
}
