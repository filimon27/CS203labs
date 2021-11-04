package Labs.Lab5;

public class CompactDisks extends AssetTracking{

    String name;

    public CompactDisks(String name,String[] category, int serialnumber) {
        super(category, serialnumber);
        this.name = name;
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
