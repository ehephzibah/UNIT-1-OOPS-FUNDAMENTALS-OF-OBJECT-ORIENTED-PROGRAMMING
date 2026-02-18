import java.util.Scanner;
class Return{
    String name;
    int price;
    String date;
    String  re;
    void details1(){
        System.out.println("BOOK RETURN DETAILS :");
        System.out.println("Name: "+ name);
        System.out.println("Price: "+price);
        System.out.println("Date of issue : "+ date);
        System.out.println("Return status: "+ re);
    }
}
public class Library{
public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            Return r = new  Return();
            System.out.println("---LIBRARY MANAGEMENT---");
            System.out.println();
            System.out.println("Enter the Year : ");
            int year = sc.nextInt();
            System.out.println("Enter the month of year: ");
            sc.nextLine();
            String month =sc.nextLine();
            System.out.println("Enter the number of books");
            int n = sc.nextInt();
            for(int i = 1;i<=n;i++){
                System.out.println();
                System.out.println("---Enter the Details---");
            System.out.println(" Enter the name of the book"+i+": ");
        sc.nextLine();
        r.name = sc.nextLine();
        System.out.println(" Enter the Price of book: ");
        r.price= sc.nextInt();
        System.out.println(" Enter the date of issue: ");
        sc.nextLine();
        r.date = sc.nextLine();
        System.out.println(" Enter the return status :");
        r.re = sc.nextLine();
        System.out.println();
        System.out.println("---ENTRY OF RETURN STATUS ("+ month+" "+year+" ) OF BOOK "+i);
        r.details1();
        System.out.println();
    }
    }
}