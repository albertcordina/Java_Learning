import java.util.Scanner;

class Example {

    public double num1, num2, num3;

    public double average() {
        System.out.print("The average is ");
        return (num1 + num2 + num3) / 3;
    }
}

public class LinkTwoClasses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Example link = new Example();

        System.out.println("THE AVERAGE OF THE THREE NUMBERS\n");
        System.out.print("Enter the first number: ");


        link.num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");

        link.num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        link.num3 = scanner.nextDouble();

        scanner.close();

        double average = link.average();

        System.out.print(average);

        scanner.close();
    }
}
