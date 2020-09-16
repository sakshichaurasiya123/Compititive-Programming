
class Solution {
    void zigZag(int arr[], int n) {
        boolean flag=true;
        for(int i=0; i<n-1; i++){
            if(flag){
                if(arr[i]>arr[i+1])
                {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            else
            {
                if(arr[i]<arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            flag=!flag;
        }
    }

}
