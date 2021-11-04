package Labs.Lab5;

import java.util.ArrayList;
import java.util.List;

public class AssetTrackingTest {
    public static void main(String[] args) {
       AssetTracking assetTracking= new AssetTracking( new String[]{},456);
       assetTracking.add();
        final int length = assetTracking.category.length;
        System.out.println(length);
        Furnitures furnitures= new Furnitures("sofa", new String[]{assetTracking.category[0]}, 456);
       //AssetTracking sofa= new AssetTracking(new String[]{"sofa"},467);
      //sofa.add();
//        furnitures.add();
//        furnitures.delete();
        assetTracking.delete();
        System.out.println(length);

       // System.out.println(furnitures.getCategory());



    }
}
