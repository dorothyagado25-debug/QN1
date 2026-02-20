import java.util.Scanner;

public class VUCourses {

    public static void main(String[] args) {

        //Part b: Variable Declarations
        Scanner input = new Scanner(System.in);
        String moduleCode;
        String moduleName;
        int tuition;

        //Part c
        System.out.println("===== Welcome to VUPay Course Portal =====");
        System.out.print("Enter Module Code (BSF, BIT, BCS, BCE): ");
        moduleCode = input.nextLine().toUpperCase();

        if (moduleCode.equals("BSF")) {
            moduleName = "BSc. Software Engineering";
            tuition = 900000;

            System.out.println("Course: " + moduleName);
            System.out.println("Tuition: UGX " + tuition);

        } else if (moduleCode.equals("BIT")) {
            moduleName = "BSc. Information Technology";
            tuition = 750000;

            System.out.println("Course: " + moduleName);
            System.out.println("Tuition: UGX " + tuition);

        } else if (moduleCode.equals("BCS")) {
            moduleName = "BSc. Computer Science";
            tuition = 800000;

            System.out.println("Course: " + moduleName);
            System.out.println("Tuition: UGX " + tuition);

        } else if (moduleCode.equals("BCE")) {
            moduleName = "BSc. Computer Engineering";
            tuition = 950000;

            System.out.println("Course: " + moduleName);
            System.out.println("Tuition: UGX " + tuition);

        } else {
            System.out.println("Wrong Module Code details");
        }

        input.close();
    }
}
