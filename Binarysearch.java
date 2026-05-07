
import java.util.*;
public class Binarysearch{
    public int binarysearch(int arr[],int target){
            int low=0;int high=arr.length-1;
            while(low<=high){
                int mid = (low+high)/2;
                if(arr[mid]==target)
                    return mid;
                else if(arr[mid]>target)
                    high=mid-1;
                else if(arr[mid]<target)
                    low=mid+1;
            }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int len = scan.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[]= new int[len];
        for(int i=0;i<len;i++){
            arr[i]=scan.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target=scan.nextInt();
        Binarysearch bs = new Binarysearch();
        int result=bs.binarysearch(arr,target);
        if(result==-1){
            System.out.println("Element Not found");
        }else{
        System.out.println("The element "+target+" is in index "+result);
            }
        scan.close();
    }
}