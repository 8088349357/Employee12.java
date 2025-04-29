package java1;

public class Employee2 {
    String name;
    int id;
    double salary;
    String address;
        public Employee2(String name, int id, double salary,String address){
            this.name = name;
            this.id = id;
            this.salary = salary;
            this.address = address;
        }
        public void displayInfo(){

            System.out.println("Employee ID :" +id);
            System.out.println("Employee Name :" +name);
            System.out.println("Salary: $" + salary);
            System.out.println("Address :" +address);
        }
        public static void main(String[] args){
            Employee2 emp1 = new Employee2("john",1234,2000,"Hubbali");
            emp1.displayInfo();
        }
    }


