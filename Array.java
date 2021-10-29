package Lab2;

public class Array {

    public static void main(String[] args) {
        int min=0;
        int max=0;
        int [] arr= {1,4,-9,33,19,78,5};

        for(int i=0;i<arr.length;i++){


            if(arr[i]<min)
                min=arr[i];
            if(arr[i]>max)
                max=arr[i];


        }
        System.out.println("the max is " + max);
        System.out.println("the min is "+ min);
    }



}



