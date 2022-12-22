package in.co.decimal.pattern;

import java.util.Scanner;

public class Main {
    // TimeComplexity of this approach is : O(LogN)
    private static int maxIndexOf2(int []arr, int index){
        int i=0;
        int j=arr.length-1;
        int max = Integer.MIN_VALUE;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] == index ){
                max = mid;
                i=mid+1;
            }else if(arr[mid] < index){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return max;
    }

    // TimeComplexity of this approach is : O(LogN)
    private static int minIndexOf2(int[] arr, int index){
        int i=0;
        int j= arr.length-1;
        int min = Integer.MAX_VALUE;
        while(i<=j){
            int mid= (i+j)/2;
            if(arr[mid] == index){
                min = mid;
                j=mid-1;
            }else if(arr[mid]<index){
                    i=mid+1;
            }else{
                j = mid-1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        int index = scanner.nextInt();
        int maxIndex = maxIndexOf2(arr,index);
        int minIndex = minIndexOf2(arr,index);
        System.out.println(minIndex+" "+maxIndex);
        scanner.close();
    }

}
