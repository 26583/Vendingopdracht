import java.util.Scanner;

public class vendingmachine
{

    public static boolean spel() {
        Scanner drink = new Scanner(System.in);
        int c;
        System.out.println("_____");
        System.out.println("\\   /");
        System.out.println(" \\ /");
        System.out.println("  |");
        System.out.println("  |");
        System.out.println(" / \\ ");
        System.out.println("-----");
        System.out.println("1. Cola");
        System.out.println("2. Fanta");
        System.out.println("3. Sprite");
        c=drink.nextInt();
        if(c==1) System.out.println("Cola is 90 cent.");
        if(c==2) System.out.println("Fanta is 90 cent.");
        if(c==3) System.out.println("Sprite is 90 cent");

        System.out.println();
        System.out.println("--------#--------");
        System.out.println("Pay in cents please");
        Scanner pay = new Scanner(System.in);
        int p;

        p=pay.nextInt();
        if(p>=90){
            System.out.println("Thank you");
            System.out.println("Your change is ");
            System.out.println(p-90 + " cents.");
        }
        else{
            System.out.println("You're " + (90-p) + " short.");
            System.out.println();
            System.out.println("Please insert the rest.");
            Scanner pay2 =new Scanner(System.in);
            int p2;
            p2=pay2.nextInt();
            int p3= 90-p;
            int p4= p+p2;
            if(p2>=p3){
                System.out.println("----------------------");
                System.out.println("Thanks.");
                System.out.println("Your change is " + (p4-90) + " cents.");


            }
            else{
                System.out.println("that's not right.");
                System.out.println("!!!!");
                System.out.println("Please choose again");
                System.out.println("----------+----------");
                spel();
            }
        }
        return true;
    }

    public static void main(String[] args) {
        spel();

    }
}
