import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IntermadiateElizaApplicationClass {
    public static void main(String[] args) {
        String condition1;
        System.out.println("Enter your response here or Q to quit:");

        Scanner myScan = new Scanner(System.in);
        condition1 = myScan.nextLine();
        while ((!condition1.equalsIgnoreCase("q"))) {
            if (condition1.equalsIgnoreCase("I am feeling great")) {
                  System.out.println("Thank you");
                break;
            }
           for (int j = 0; j <= condition1.length(); j++) {
                if (condition1.contains("i")) {
                    condition1 = condition1.replace("i ", "you ");
                }  if (condition1.contains("me")) {
                   condition1 = condition1.replace("me ", "you ");
                }  if (condition1.contains("my")) {
                    condition1 = condition1.replace("my ", "your ");
                }  if (condition1.contains("am")) {
                    condition1 = condition1.replace("am ", "are ");
                }
            }
            System.out.println(condition1);
            condition1 = myScan.nextLine();
        }
    }
}
