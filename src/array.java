import java.util.*;
public class array
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int length;
        String output = " ";
        System.out.println("How many numbers do you need to enter?");
        length = scan.nextInt();
        int[] input  = new int[length];

            for(int i = 0; i < length; i++)
            {
                System.out.println("Enter an integer between 0 and 50.");
                input[i] = scan.nextInt();

                if (input[i] < 0 || input[i] > 50)
                {
                    System.out.println("Please enter a valid number");
                    input[i] = scan.nextInt();
                    output +=  input[i] + ", ";
                }
                else
                    {
                    output += input[i] + ", ";
                }
            }//end the for loop
        System.out.println(output);



    }//end main
}//end class array
