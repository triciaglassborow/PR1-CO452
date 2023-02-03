package code;

public class Forest
{
    int input;

    public static void main(String[] args)
    {

        getPossibility(50);

    }
    //calling Possibiltiy, input = %. ie 50 = 50%
    public static Possibility getPossibility(int input)
    {   
        return new Possibility(input);
    }


}
   
