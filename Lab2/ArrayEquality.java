package Lab2;

public class ArrayEquality {
    public static void main(String[] args) {

 int [] arr1={1,2,3,4};
 int [] arr2={1,2,3,4};
 int[] arr3={1,2,4,6};
    equality(arr1,arr2);
        System.out.println(equality(arr1,arr2));
        System.out.println(equality(arr1,arr3));
    }
    public static boolean equality(int[ ]arr1,int [] arr2){
        if(arr1.length!=arr2.length)
            return false;
        else{
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i])
                    return false;
            }
        }

return true;
    }
}
