import java.util.List;

public class TechassiQ1 {
    static int cal(List<Integer> arr, int index)
    {
        if(index==arr.size())
            return 1;
        else
        {
            int cur=arr.get(index);
            return cur*cal(arr, index+1);
        }
    }
    public static void main(String[] args) {
        List<Integer> myList=List.of(2, 3, 4, 5);
        int product=cal(myList, 0);
        System.out.println("Prduct = "+product);
    }


    
}
