package Labs.Lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AssetTracking implements Comparable<AssetTracking> {
    Scanner sc= new Scanner(System.in);
    String [] category;
    int serialnumber;

    public String[] getCategory() {
        return category;
    }

    public int getSerialnumber() {
        return serialnumber;
    }

    public AssetTracking(String[] category, int serialnumber) {
        this.category = category;
        this.serialnumber = serialnumber;
    }

    public void add() {

        category= new String[4];
        for (int i = 0; i < category.length; i++) {
            System.out.println(" add the appliance you want");
            String asset=sc.nextLine();
            category[i]=asset;
            System.out.println( category[i] + " added successfully");

        }



    }

    public void modify( ){
        System.out.println(" modify the appliance you want");
        String modifyAsset=sc.nextLine();
        int index=sc.nextInt();
        category[index]= modifyAsset;
        System.out.println(category);

    }
    public void delete( ){
        System.out.println(" enter the index of the appliance you want to delete");
        int index= sc.nextInt();
        if(category.length!=0){
        category[index]=null;
         //   final int i = category.length--;
        }

    }

    @Override
    public int compareTo(AssetTracking o) {
        if (serialnumber>o.serialnumber)
            return 1;
        else if(serialnumber==o.serialnumber)
            return  0;
        else
            return -1;
    }
}
