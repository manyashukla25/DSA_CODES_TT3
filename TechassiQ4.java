import java.util.*;
public class TechassiQ4 {
    static void salary(float[] arr, int index)
    {
        if(index==arr.length){
            
            return;
        }
   
       arr[index]=arr[index]*1.1f;
       salary(arr,index+1);
    }

    public static void main(String[] args) {
        float[] arr={10000,15000,19000};
        salary(arr,0);
        System.out.println("Updated Salary are :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
