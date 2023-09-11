import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        int currentYear = 2023;

        System.out.println(getInputFromScanner(currentYear));

//        int currentYear = 2022;
//        String userDateOfBirth = "1998";
//
//        // convert string to integer
//        int dateOfBirth  = Integer.parseInt(userDateOfBirth);
//
//        System.out.println("Age = " + (currentYear - dateOfBirth));

    }

    // will only run on terminal
    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your name??");

        System.out.println("Hi " + name + ", Thanks for coming!!!");

        return "";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Hi What's your name?");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + " Thanks for your response!!!");


        System.out.println("Hi What's your Date of birth?");
        String dateOfBirth = scanner.nextLine();

        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "Heeey... You're " + age + " years old";
    }
}
