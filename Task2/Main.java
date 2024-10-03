import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String name = userName();
        System.out.println("Hello " + name);
        System.out.println();

        int age = userAge();
        System.out.println("You are " + age + " years old");
        System.out.println();

        int yearsToRetirement = calculateYearsToRetirement(age);
        System.out.println("You have " + yearsToRetirement + " years until retirement");
        System.out.println();
    }    

    private static String userName() {
        System.out.println("Please type your name:");
        String name = sc.nextLine();

        if (name.length() < 1) {
            name = userName();
        }      

        return name;
    }

    private static int userAge() {
        System.out.println("Please type your age:");
        int age = sc.nextInt();
        sc.nextLine();

        if (age < 0) {
            age = userAge();
        }

        return age;
    }

    private static int calculateYearsToRetirement(int age) {
        int retirementAge = 67;
        int yearsToRetirement = retirementAge - age;

        if (yearsToRetirement < 0){
            return 0;
        }
        
        return yearsToRetirement;
    }
}
