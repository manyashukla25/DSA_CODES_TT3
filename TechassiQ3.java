import java.util.*;
public class TechassiQ3 {
    static void hi(int[] arr,int index, int largest)
    {
        if(index==arr.length){
            System.out.println("The largest element is : "+largest);
            return;
        } 
        if(largest<arr[index])
        {
            largest=arr[index];
        }
        hi(arr, index+1, largest);  
    }

    public static void main(String[] args) {
        int[] arr={2,1,-22,15,68,1};
        hi(arr, 0,-9999);    
    }
   
}
