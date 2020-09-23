

class Solution {
    String printLargest(String[] arr) {
        int n=arr.length;
        StringBuffer br=new StringBuffer();
        List<String>res=Arrays.asList(arr);
        Collections.sort(res,new Comparator<String>(){
            public int compare(String x ,String y)
            {
                String xy=x+y;
                String yx=y+x;
               return  xy.compareTo(yx)> 0 ? -1:1;
            }
        });
        Iterator itr=res.iterator();
        //String st="";
        while(itr.hasNext())
            br.append(itr.next());
        String st=new String(br);
        return st;
        
        
    }
    
}
