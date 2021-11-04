package Labs.Lab5;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee= new Employee("ABel",5478,"Engineering",85000,"Software architecture");
        Clerk clerk= new Clerk("yared",8909,"accounting",56000,"Accountant");
        Manager manager= new Manager("Filimon",4365,"Engine",90000,"E.engineer");



        System.out.println(employee);
       System.out.println(employee.addBonus());

        System.out.println(clerk);
        System.out.println(clerk.addBonus());

        System.out.println(manager);
        System.out.println(manager.addBonus());

        System.out.println(manager.equals(clerk));
        System.out.println(manager.equals(manager));


        }
}

