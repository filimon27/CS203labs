package Labs.Lab4;
import java.util.*;
public class StudentTester {
    public static void main(String[] args) {
        ArrayList<Student>studentArrayList= new ArrayList<Student>();

        studentArrayList.add(new Student("Zewdie",235678));
        studentArrayList.add(new Student("Lemma",902345));
        studentArrayList.add(new Student("Desta",901123));

        Collections.sort(studentArrayList);
        for ( Student s : studentArrayList)
            System.out.println(s);







    }

}
