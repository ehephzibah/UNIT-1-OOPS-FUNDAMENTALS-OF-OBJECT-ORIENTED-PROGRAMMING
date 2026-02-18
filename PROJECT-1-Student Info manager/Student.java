import java.util.Scanner;
class StudentInfo{
    String name;
    int age;
    String dept;
    long phone;
    void details(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Department: "+dept);
        System.out.println("Phone number: "+ phone);
    }
}
public class Student{
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        StudentInfo s1 = new StudentInfo();
        System.out.println("---STUDENT INFO MANAGEMENT---");
        System.out.println("Enter the Number of Students: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println();
        System.out.println("Enter name of Student "+ i+" :");
        sc.nextLine();
        s1.name = sc.nextLine();
        System.out.println("Enter age of Student "+i+" :");
        s1.age = sc.nextInt();
        System.out.println("Enter Department of Student"+i+" :");
        sc.nextLine();
        s1.dept = sc.nextLine();
        System.out.println("Enter Phone number of Student "+i+" :");
        s1.phone = sc.nextLong();
        System.out.println();
        System.out.println("---STUDENT "+i+"INFORMATION---");
        s1.details();
        }
    }
}