import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(in);
        System.out.println("Enter the information ");

        System.out.print("Name write: ");
        String name = scanner.nextLine();

        System.out.print("Phone number write +998 ");
        int phone = scanner.nextInt();

        scanner=new Scanner(in);

        System.out.print("Province (district): ");
        String province = scanner.nextLine();

        System.out.print("City write: ");
        String city = scanner.nextLine();

        System.out.print("Is your school number: ");
        int school = scanner.nextInt();

        System.out.println("Additional information: ");
        String information = scanner.nextLine();

        System.out.println("===============");
        System.out.println("Name: "+name);
        System.out.println("+998 "+phone);
        System.out.println("City: "+city);
        System.out.println("Province: "+province);
        System.out.println("school number: "+school+"-school");
        System.out.println("Additional information: "+information);






    }
}