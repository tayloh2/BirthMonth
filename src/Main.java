//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int BirthMonth;
    System.out.println("Enter your birth month");
    BirthMonth = in.nextInt();

    if(BirthMonth >= 1 && BirthMonth <= 12)
        {
            System.out.println("Your birth month is: " + BirthMonth);
        }
        else

        {
            System.out.println("You entered an incorrect month value: " + BirthMonth);
        }

    }
}