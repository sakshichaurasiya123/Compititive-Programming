 static int noOfOpenDoors(Long N) {
        // code here
       // if(N%2==0)
       //     return (int) (N/2);
       // else if(N%2!=0){
       //     return (int)((N/2)+1);   
       // }
       long res=(long)Math.sqrt(N);
        int r=(int) res;
        return r;
    }
