package Labs.Lab4;

public class Student implements Comparable<Student> {
    private String lastName;
    private int idNumber;

    public Student(){
        lastName="Bihonegn";
        idNumber=456789;
    }
    public Student(String lastName, int idNumber){
        this.lastName=lastName;
        this.idNumber=idNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

   /* @Override
    public int compareTo(Student o) {
        if(this.idNumber>o.idNumber)
            return 1;
        else if(this.idNumber==o.idNumber)
            return 0;
        else
            return -1;
    }*/

    @Override
    public String toString() {
        return lastName+ " " + idNumber;
    }


    @Override
    public int compareTo(Student o){
       return lastName.compareTo(o.lastName);}
}


