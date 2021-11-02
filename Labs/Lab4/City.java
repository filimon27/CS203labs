package Labs.Lab4;

public class City implements Comparable<City> {
    private String name;
    private double temperature;

    public City() {
        name = "SilverSpring";
        temperature = 45.0;
    }

    public City(String name, double temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    @Override
    public int compareTo(City other){

        if(this.temperature>other.temperature)
           return 1;
        if (this.temperature==other.temperature)
                return 0;
        else
            return -1;

    }

    @Override
    public String toString() {
        return name+ " " + temperature;
    }
}
