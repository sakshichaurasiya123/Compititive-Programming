import java.util.*;
public class Solutin{
    public static void main(String kj[]){
        Scanner scan = new Scanner(System.in);
        int count=0,cn=0,ct=0;
        int n = scan.nextInt();
        int m = scan.nextInt();
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
        for(int i=0;i<n;i++)
            al1.add(scan.nextInt());//al1[2,4]
        for(int i=0;i<m;i++)
            al2.add(scan.nextInt());//al2[16,32,96]
        for(int i=0;i<n;i++){
            for(int j=1;j<=100;j++){
                int value = al1.get(i);
                if( (value%j) == 0 ){
                    if( ( Collections.min(al1)<=j) )
                          hs.add(j);//[2,4]
                }
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=1;j<=100;j++){
                int value = al2.get(i);//36
                if( (value%j) == 0 ){
                    if( (Collections.min(al1)<=j) )
                    hs.add(j);//hs[2,4,16,36,96]
                }
                    
                }
            }
            Iterator itr = hs.iterator();
            while(itr.hasNext()){
                int value = (int)itr.next();
                for(int i=0;i<al2.size();i++){
                    int value1 = al2.get(i);
                    if(value1%value==0)
                        ct++;
                }
                if(ct == al2.size()){
                    for(int j=0;j<al1.size();j++){
                        int valueofal1 = al1.get(j);
                        if((value%valueofal1)==0)
                            count++;         
                    }
                if(count == n)
                    cn++;
                 count=0;
                }
                ct=0;
            }
        System.out.println(cn);
    }
}
