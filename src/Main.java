import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Hobby[] Arr = new Hobby[4];

        System.out.println("Hello, tell me some information about u");

        Scanner scn = new Scanner(System.in);

        System.out.println("What is ur name");
        String name = scn.nextLine();

        System.out.println("How old are u?");
        int age = scn.nextInt();

        System.out.println("What is ur favourite dish?");
        String dish = scn.next();

        System.out.println("How long have u been cooking?");
        int howlong = scn.nextInt();


        Hobby obj1 = new Cooking(name, age, dish, howlong);
        Hobby obj2 = new Cooking("John", 19, "cream soup", 3);

        System.out.println("What is ur name");
        String name1 = scn.next();

        System.out.println("How old are u?");
        int age1 = scn.nextInt();

        System.out.println("The height of the largest wave u seen");
        int high = scn.nextInt();

        System.out.println("Where are u surfing?");
        String place = scn.next();

        Hobby obj3 = new Surfing(name1, age1, high, place);
        Hobby obj4 = new Surfing("Nick", 19, 5, "Gold Coast");

        Arr[0] = obj1;
        Arr[1] = obj2;
        Arr[2] = obj3;
        Arr[3] = obj4;

        for(Hobby a : Arr)
        {
            a.tellAboutHobby();
            System.out.println();
        }
    }
}
