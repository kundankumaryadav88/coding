public class Max_value {
    public static int value(int arr[]){
        int ans = 0;
        for(int i = 0; i  < arr.length;i++){
            for(int j = i+1;j < arr.length && j!= i;j++){
                if((Math.abs(arr[i] - arr[j]) - Math.abs(i - j)) > ans){
                    ans = (Math.abs(arr[i] - arr[j]) - Math.abs(i - j));
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int arr[] = {4, 5, 6, 8};
        System.out.println(value(arr));

    }
}
