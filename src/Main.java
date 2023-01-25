import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many Student? ");
        int numOfStudent = scanner.nextInt();
        ArrayList<Student> studentList = new ArrayList<Student>();
        System.out.println("How many Staff? ");
        int numOfStaff = scanner.nextInt();
        ArrayList<Staff> staffList = new ArrayList<Staff>();

        for (int i = 0; i < numOfStudent; i++){
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("address: ");
            String address = scanner.nextLine();
            System.out.println("program: ");
            String pragram =scanner.nextLine();
            System.out.println("year: ");
            int year = scanner.nextInt();
            double fee = scanner.nextDouble();
            studentList.add(new Student(name, address, pragram, year, fee));
        }
        for (int i = 0; i < numOfStaff; i++){
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("address: ");
            String address = scanner.nextLine();
            System.out.println("school: ");
            String school =scanner.nextLine();
            System.out.println("pay: ");
            double pay = scanner.nextDouble();
            staffList.add(new Staff(name, address, school, pay));
        }

    }


    static void creatStaff(){

    }
    static void creatStudent(){

    }
    static void test(){
        Staff staff1 = new Staff("1", "111", "school", 11);
        Staff staff2 = new Staff("2", "222", "school", 22);
        Student studen1 = new Student("Studen1", "1111", "Pro1", 1, 111);
        Student studen2 = new Student("Studen2", "2222", "Pro2", 2, 222);
        Student studen3 = new Student("Studen3", "1111", "Pro1", 1, 111);
        Student studen4 = new Student("Studen4", "1111", "Pro1", 1, 111);
        Student studen5 = new Student("Studen5", "1111", "Pro1", 1, 111);
        System.out.println(staff1.getName());
    }

}