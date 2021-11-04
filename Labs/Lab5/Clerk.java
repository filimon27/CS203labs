package Labs.Lab5;

public class Clerk extends Employee{


    public Clerk(String name, int id, String department, int salary, String designation) {
        super(name, id, department, salary, designation);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int addBonus() {
        return super.addBonus()+100;
    }
}
