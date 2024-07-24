import java.util.Scanner;

public class Main
{
    public static void main(String[] Ravi)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any caracter : ");
        char ch = scanner.next().charAt(0);

        if((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90))
        {
        System.out.println(ch + " is A ALPHABET");

        } else if(ch >= '0' && ch <= '9')
        {
        System.out.println(ch + " is A DIGIT");

        } else
        {
        System.out.println(ch + " is A SPECIAL CHARACTER");
        }
    }
}
