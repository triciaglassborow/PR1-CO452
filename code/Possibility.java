package code;


public class Possibility 
{
    // creating variables 
    int input;
    int random_int;
    boolean outcome;

    //constructor
    public Possibility(){}

    public static boolean getPossibility(int input){

        int min = 1; // Minimum value of range
        int max = 100; // Maximum value of range
        // Generate random int value from min to max
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);

         // comparing random and input
        if(random_int <= input)
        {
            return true;

        }
        else
        {
            return false;
        }
        
    }

  

}
