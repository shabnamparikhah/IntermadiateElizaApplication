import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String condition1;
        System.out.println("Good day. What is your problem?");
        Scanner myScan = new Scanner(System.in);
        condition1 = myScan.nextLine();

        while ((!condition1.equalsIgnoreCase("q"))) {
            System.out.println("Enter your response here or Q to quit:");
            condition1 = myScan.nextLine();
            if (condition1.equalsIgnoreCase("I am feeling great")) {
                //  System.out.println("Thank you");
                break;
            }
        }
        System.out.println("Thank you");
    }
}
