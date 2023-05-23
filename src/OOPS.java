import java.sql.SQLOutput;
import java.util.Scanner;

public class OOPS{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Emp name");
        String name=sc.nextLine();

        System.out.println("Enter Location of Employee: ");
        String loc=sc.nextLine();

        System.out.println("Enter Emp id");
        int id=sc.nextInt();

        Emp_Data ob1=new Emp_Data(name,id,loc);
        ob1.print();
    }
}

 class Emp_Data {

    //class level variable
    String name;
    int id;
    String location;

    Emp_Data(String name,int id,String location){
        this.name=name;
        this.id=id;
        this.location=location;
    }

    //class methods
    void print(){
//        System.out.println("I am from parent class");
        System.out.println("Name "+name+" with id: "+id+" from "+location);
    }
}


