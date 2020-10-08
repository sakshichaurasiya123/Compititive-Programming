import java.util.*;
public class Solution {
    static int[] array;
    static int[] temp;
    static int len;
    
    
    static void merge(int low,int mid,int high){
          
           
        for(int i=low;i<=high;i++)
            temp[i] = array[i];
        int i=low,j=mid+1,k=low;
        
        while(i<=mid && j<=high){
            if(temp[i] <= temp[j]){
                array[k] = temp[i];
                i++;
            }else{
                array[k] = temp[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
                array[k] = temp[i];
                k++;
                i++;
        }
        
    }
    static void devide(int l,int u){
        if(l<u){
            int mid = l+(u-l)/2;
            devide(l,mid);
            devide(mid+1,u);
            merge(l,mid,u);
        }
    }
    static void sort(int[] arr){
        array = arr;
        len = arr.length;
        temp = new int[len];
        devide(0,len-1);
        
    }
   
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = scan.nextInt();
        sort(arr);
        for(int a : array)
            System.out.print(a+" ");
    }
}
