import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String name=in.next();
		char arr[]=name.toCharArray();
	    Arrays.sort(arr);
	    TreeMap<Character, Integer> map=new TreeMap<Character, Integer>();
	    for(int i=0; i<arr.length; i++){
	        int f=1;
	        for(int j=i+1; j<arr.length; j++){
	            if(arr[i]==arr[j]){
	                f++;
	               i++;
	            }
	        }
	        map.put(arr[i],f);
	    }
	    for(Map.Entry<Character,Integer> v:map.entrySet())
	        System.out.print(v.getKey()+""+v.getValue());
	}
}
