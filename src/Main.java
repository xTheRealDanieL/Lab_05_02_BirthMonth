public class Main
{
    public static void main(String[] args)
    {
        int birthMonth=8;

        if (birthMonth>=1 && birthMonth<=12)
        {
            System.out.println("Your birth month is: " + birthMonth);
        }
        else
        {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}