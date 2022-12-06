import java.util.Scanner;

public class Management extends Library{
    Scanner scanner = new Scanner(System.in);
    @Override
    void displayBook() {
        System.out.println("=======>Welcome to Library Management<======");
        System.out.println("____________________________________________");
        System.out.println("1.Food");
        System.out.println("2.History");
        System.out.println("3.Science Fiction");
        System.out.println("4.Politics");
        System.out.println("5.Novel");
        System.out.println("6.Children");
    }
    void payment(){
        System.out.println("The price Of the Books are 160 Taka");
        System.out.println("Enter Quantity: ");
        int quantity =scanner.nextInt();
        System.out.println("Books You want to buy");
        for(int i=0; i<quantity; i++){
            System.out.println("Enter Your choice: ");
            scanner.nextInt();
        }
        scanner.nextLine();
        System.out.println("Enter Your Bkash Number: ");
        scanner.nextLine();
        System.out.println("Enter your OTP: ");
        String otp = scanner.nextLine();
        if(otp.equals("1234")){
            System.out.println("Your Total Is: "+quantity*160);
        }else System.out.println("Wrong OTP\nPlease Try Again");

    }
}
