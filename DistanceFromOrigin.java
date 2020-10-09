import java.io.*;
import java.util.*;
class Coordinate{
    int x,y;
    public Coordinate(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int distanceFromOrigin(){
        return x*x+y*y;
    }
}

class GFG {
     public static List<Coordinate> kClosestPointFromOriginUsingMaxHeap(List<Coordinate> listOfCoordinate, int k){
    if(listOfCoordinate.size() == 0) {
      return new ArrayList<>();
    }
    
    PriorityQueue<Coordinate> maxHeap = new PriorityQueue<>((n1, n2) -> n2.distanceFromOrigin() - n1.distanceFromOrigin());
    
    for(int i = 0; i < k; i++) {
      maxHeap.add(listOfCoordinate.get(i));
    }
    
    for(int i = k; i < listOfCoordinate.size(); i++) {
      if(listOfCoordinate.get(i).distanceFromOrigin() < maxHeap.peek().distanceFromOrigin()) {
        maxHeap.poll();
        maxHeap.add(listOfCoordinate.get(i));
      }
    }
    
    List<Coordinate> list = new ArrayList<>();
    
    while(!maxHeap.isEmpty()) {
      list.add(maxHeap.poll());
    }
    
    return list;
  }
 public static void main(String arg[]){
        Coordinate c1=new Coordinate(2,3);
        Coordinate c2=new Coordinate(1,4);
        Coordinate c3=new Coordinate(3,5);
        Coordinate c4=new Coordinate(0,4);
        List<Coordinate>listofcoordinate=new ArrayList<>();
        listofcoordinate.add(c1);
        listofcoordinate.add(c2);
        listofcoordinate.add(c3);
        listofcoordinate.add(c4);
        
        List<Coordinate>kClosestUsingMaxHeap=kClosestPointFromOriginUsingMaxHeap(listofcoordinate,2);
        for(Coordinate c: kClosestUsingMaxHeap){
            System.out.println(c.x+"  "+c.y);
        }
    }
}
