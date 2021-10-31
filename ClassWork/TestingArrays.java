package ClassWork;

public class TestingArrays {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4};

       int [] incrementedArray=incrementArray(arr1,4);
       for ( int  a: incrementedArray)
        System.out.print( a + " ");
    }
    public static int[]incrementArray(int[] a, int increment)
    {
        int[] temp = new int[a.length]; int i;
        for (i = 0; i < a.length; i++)
            temp[i] = a[i] + increment;
        return temp;
    }
}
