package Labs.Lab5;

public class Manager extends Employee{

    public Manager(String name, int id, String department, int salary, String designation) {
        super(name, id, department, salary, designation);
    }

    @Override
    public int addBonus() {
        return super.addBonus()+300;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
