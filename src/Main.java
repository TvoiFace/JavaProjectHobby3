import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello, tell me some information about u");
        Hobby obj1 = new Hobby();
        Hobby obj2 = new Hobby("Swimming",17, '1', 10, 2, 1, true );
        Hobby obj3 = new Hobby();
        Scanner scn = new Scanner(System.in);
        System.out.println("What is ur hobby?");
        String hobby = scn.nextLine();
        obj1.setHobby(hobby);
        System.out.println("How old are u?");
        int age = scn.nextInt();
        obj1.setAge(age);
        char quant = '1';
        obj1.setQuant(quant);
        System.out.println("How much do u like it (1...10)?");
        long love = scn.nextInt();
        obj1.setLove(love);
        System.out.println("how long have you been doing this?");
        float howlong = scn.nextFloat();
        obj1.setHowlong(howlong);
        System.out.println("how much time do you spend on a hobby?");
        double hour = scn.nextDouble();
        obj1.setHour(hour);
        System.out.println("how many times a week do you do this?");
        short times = scn.nextShort();
        obj1.setTimes(times);
        System.out.println("Would you like to do this in the future (True/False)?");
        boolean key = scn.nextBoolean();
        obj1.setKey(key);
        System.out.println("Rate the survey (1...10)");
        byte mark = scn.nextByte();
        obj1.setMark(mark);

        Hobby Arr[];
        Arr = new Hobby[3];
        Arr[0] = obj1;
        Arr[1] = obj2;
        Arr[2] = obj3;
        for(int i = 0; i < 3; i++)
        {
            Arr[i].tellAboutHobby();
            System.out.println("\n");
        }
    }
}
