
import java.util.Scanner;
class Dog{
    String name1;
    int age1;
    void dogDetails(){
        System.out.println("Name of the Dog: "+ name1);
        System.out.println("Age of the Dog: "+ age1);
    }
}
class  Cat{
    String name2;
    int age2;
    void catDetails(){
        System.out.println("Name of the Cat: "+name2);
        System.out.println("Age of the Cat: "+ age2);
    }
}
public class Animal{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.print("---PET ANALYSIS---");
    System.out.println();
    System.out.println("Enter the Type of Pet");
    System.out.println("1.Dog");
    System.out.println("2.cat");
    int a = sc.nextInt();
    if(a==1){
        Dog d1 = new Dog();
        System.out.print("Enter the name of Dog");
        sc.nextLine();
        d1.name1 = sc.nextLine();
        System.out.println("Enter the age of Dog");
        d1.age1 = sc.nextInt();
        System.out.println();
        System.out.println("---DOG DETAILS---");
        d1.dogDetails();
    }
    else if(a==2){
        Cat c1 = new Cat();
        System.out.print("Enter the name of cat");
        sc.nextLine();
        c1.name2 = sc.nextLine();
        System.out.println("Enter the age of Cat");
        c1.age2= sc.nextInt();
        System.out.println();
        System.out.println("---CAT DETAILS--");
        c1.catDetails();
    }
    else{
        System.out.print("Invalid Input");
    }
    sc.close();
}
}

