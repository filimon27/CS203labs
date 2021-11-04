package Labs.Lab5;

public class Furnitures extends AssetTracking {
    String name;

    public Furnitures(String name, String [] category, int serialnumber) {
        super(category, serialnumber);
        this.name = name;
    }

    @Override
    public String[] getCategory() {
        return super.getCategory();
    }

    @Override
    public int getSerialnumber() {
        return super.getSerialnumber();
    }

    public String getName() {
        return name;
    }

    @Override
    public void add() {
       super.add();

    }

    @Override
    public void modify() {
        super.modify();
    }

    @Override
    public void delete() {
        super.delete();
    }

    @Override
    public int compareTo(AssetTracking o) {
        return super.compareTo(o);
    }
}