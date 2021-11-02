package Labs.Lab4;
import java.util.*;

public class CityTester {
    public static void main(String[] args) {
        List<City>myCity= new ArrayList<City>();
        myCity.add(new City("Dc",45.7));
        myCity.add(new City("Alexandria",55));
        myCity.add(new City("Baltimore",35));
        myCity.add(new City("Manhattan",30));

        Collections.sort(myCity);
        for( City c : myCity)
            System.out.println(c);


    }
}
