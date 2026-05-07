
public class RainWatertrap {
    public static void main(String []args){
        int arr[]={0,1,2,0,3,1,0,4};
        int n=arr.length;
        int l_wall = 0, r_wall=0;
        int left[]=new int[n];
        int right[]=new int[n];
        for(int i=0;i<n;i++){
            left[i]=l_wall;
            l_wall = Math.max(l_wall, arr[i]);
        }
        for(int i=n-1;i>=0;i--){
            right[i]= r_wall;
            r_wall = Math.max(r_wall, arr[i]);
        }
        int result = 0;
        int trapped = 0;
        for(int i=0;i<n;i++){
            trapped = Math.min(left[i],right[i])-arr[i];
            if(trapped > 0){
                result+=trapped;
            }
        }
        System.out.println(result);
    }
}
