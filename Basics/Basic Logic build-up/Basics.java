import java.util.*;

class Basics {
    public void printNumber(Scanner sc) {
        System.out.println("Enter number");
        int a = sc.nextInt();
        System.out.println(a);
    }

    public void studentGrade(int marks) {

        if (marks >= 90){
            System.out.println("Grade A");
            System.out.println("Explaination:  marks are greater than or equal to 90.");
        }
        else if (marks>=70){
            System.out.println("Grade B");
            System.out.println("Explaination:  marks are greater than or equal to 70.");
        }
        else if (marks >= 50){
            System.out.println("Grade C");
            System.out.println("Explaination:  marks are greater than or equal to 50.");
        }
        else if (marks >= 35){
            System.out.println("Grade D");
            System.out.println("Explaination:  marks are greater than or equal to 35.");
        }
        else{
            System.out.println("fail");
            System.out.println("Explaination:  marks are less than 35.");

        }
    }
    public void whichWeekDay(int day) {

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("tuesday");
                break;

            case 3:
                System.out.println("Wednusday");
                break;

            case 4:
                System.out.println("Thrusday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default: System.out.println("Sunday");
        }
    }

    static void PrintIntString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = sc.nextInt();
        System.out.println("You entered integer: " + num);

        System.out.println("Enter a string:");
        String str = sc.next();
        System.out.println("You entered string: " + str);
    }
    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("day =");
        int day = sc.nextInt();
        Basics b = new Basics();
        b.whichWeekDay(day);

    }
}
