package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901\n" +
                "         __\n" +
                " _(\\    |@@|\n" +
                "(__/\\__ \\--/ __\n" +
                "   \\___|----|  |   __\n" +
                "       \\ }{ /\\ )_ / _\\\n" +
                "       /\\__/\\ \\__O (__\n" +
                "      (--/\\--)    \\__/\n" +
                "      _)(  )(_\n" +
                "     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){

        char myChar = 'Z';
        int hex = 0xface;
        int i = 012;
        long l = 80L;
        float f = 44e-1f;
        float f2 = 5.5f;
        double d1 = 8.88e1;
        double d2 = 99.9;

        int d = (int) l;
        int e = (int) f;
        int h = (int) f2;
        int g = (int) d1;
        int r = (int) d2;

        System.out.println(myChar + hex + i + d + e + h + g + r);
    }

    //todo Task 4
    public void addTwoNumbers(){
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        sum = num1 + num2;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        System.out.println("Before Swap:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("x: y: After Swap:");
        x = x ^ y;
        y = y ^ x;
        x = x ^ y;

        System.out.println("x: " +x);
        System.out.println("y: " +y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1 > n2) {
            System.out.println("n1: n2: n1 > n2");
        }

        else if(n1 < n2) {
            System.out.println("n1: n2: n2 > n1");
        }

        else {
            System.out.println("n1: n2: n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner x = new Scanner(System.in);
        int rev = x.nextInt();

        if (rev < 0 || rev >=100000){
            System.out.println("Enter annual Revenue: Invalid Revenue");
        }
        else if(50000<= rev && rev <80000) {
            System.out.println("Enter annual Revenue: Good Sales Revenue");
        }
        else if(0<= rev && rev <20000){
            System.out.println("Enter annual Revenue: Poor Sales Revenue");
        }
        else if(rev >= 20000 && rev < 50000){
            System.out.println("Enter annual Revenue: Average Sales Revenue");
        }
        else if(rev >= 80000 && rev < 100000) {
            System.out.println("Enter annual Revenue: Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner p = new Scanner(System.in);
        int cc = p.nextInt();
        switch (cc) {
            case 1:
                System.out.println("Enter CommissionClass: Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Enter CommissionClass: Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Enter CommissionClass: Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Enter CommissionClass: Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Enter CommissionClass: Your Commission Rate was set to 0.0");
                break;
        }
    }

    //todo Task 9
    public void leapyear(){
        Scanner lp = new Scanner(System.in);
        int lpyear = lp.nextInt();

        boolean isLpyear = ((lpyear % 4 == 0) && (lpyear % 100 !=0) || (lpyear % 400 == 0));
        if (isLpyear){
            System.out.println("Year: Leapyear");
        }
        else{
            System.out.println("Year: Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        int numb, r = 0;
        Scanner n = new Scanner(System.in);
        numb = n.nextInt();
        while(numb != 0){
            int remainder = numb%10;
            r = r *10 +remainder;
            numb = numb/10;
        }
        System.out.println("Number: " +r);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}