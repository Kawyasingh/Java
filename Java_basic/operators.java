import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //operators
        int a = 1;
        int b = 2;
        int diff = a * b;
//        System.out.println(diff);

        int numb = 1;
        numb++;
//        System.out.println(numb);

        //Maths
        //5,6
//        System.out.println(Math.max(5,6));

        // random
        System.out.println((int)(Math.random()*100));

        //How to take INPUT?
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input your Age: ");
//        String name = sc.nextLine();
//        System.out.println(name);

        //Comparison Operators
        //a == b
        //a != b
        //a < b
        //a > b
        //a <= b
        //a >= b

        // conditional Stmnt
//        boolean isSunUp = true;
//        if(isSunUp == true)
//            System.out.println("day");
//        else
//            System.out.println("night");

        int age =3;
        if (age>18)
            System.out.println("can vote");
        else
            System.out.println("can't vote");

    }
}