package Labs.Lab5;

public class Employee {
    private String name;
    private  int id;
    private String department;
    private int salary;
    private String designation ;
    private static final int DEFAULT_BONUS=200;

    public Employee(String name, int id, String department, int salary, String designation) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null) return false;
        if(!(obj instanceof Employee) )return false;
        Employee e= (Employee)obj;
        return designation.equals(e.designation);
    }
    public int addBonus(){
        salary=salary+DEFAULT_BONUS;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                '}';
    }
}
