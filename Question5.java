import java.util.Arrays;
import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    //System.out.print("Enter a number: ");  
    int noOfInputs = in.nextInt();
    int arr[] = new int[noOfInputs+1];

    for (int i = 0; i < noOfInputs; i++) 
    {
      int num = in.nextInt();
      arr[i] = num;
    }
    Arrays.sort(arr);
    System.out.print(arr[noOfInputs]);
  }
}