public class FindMaxMinArray {
    public static void main (String[] args) {
        int [] arr={2,1,100,6,8,-5,7};
        int max = arr[0];
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("MAX " + max);
        System.out.println("MIN " + min);
    }
}
