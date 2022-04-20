import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    char symbol = '*';

    //System.out.print("Enter an integer: ");  
    int base = in.nextInt();
    
    while (base > 0)
    {
      int base2 = base;
      for (int i = 0; i < base; i++) 
      {
        if (i == base-1)
        {
          System.out.println(symbol);
          base2--;          
        }
        else
        {
          System.out.print(symbol);
          base2--;
        }
      }
      base--;
    }
  }
}