package code;

public class Forest
{
    int input;

    public static void main(String[] args)
    {
        getPossibility();

    }

    public static Possibility getPossibility()
    {
        // created temp variables
        int tempInput;
        //Setting the possibility. ie 50% = 50
        tempInput = 50;
        //returning input
        return new Possibility(tempInput);
    }
}
   
