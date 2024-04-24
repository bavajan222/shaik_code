package collections;

//import java.util.Vector; or
import java.util.*;


public class Vector_Practise {

	public static void main(String[] args) {
	
		Vector v1=new Vector();
		v1.add("shaik");
		v1.add("jan");
	    v1.add(0, "nawaz");
	    v1.add("sasi");
	    v1.add("harati");
	    v1.add("nagesh");
	    
	    
	    Vector v2=new Vector();
	    v2.add("name");
	    v2.add("devillers");
		System.out.println(v1);//[nawaz, shaik, jan, sasi, harati, nagesh]

		
		
		v1.addAll(v2);
		System.out.println(v1);
//[nawaz, shaik, jan, sasi, harati, nagesh, name, devillers]

		v1.addAll(0, v2);
		System.out.println(v1);
//[name, devillers, nawaz, shaik, jan, sasi, harati, nagesh, name, devillers]
      System.out.println(v1.get(0));//name
    v1.remove(1);
    System.out.println(v1);
//[name, nawaz, shaik, jan, sasi, harati, nagesh, name, devillers]
    v1.remove("sasi");
    System.out.println(v1);//sasi will remove
    v1.removeAll(v2);
    System.out.println(v1);//v2 elements are removed present in v1
    
    
    
   // v1.clear();
   // System.out.println(v1);//all elements are removed from v1 []
    
    
    
    System.out.println(v1.contains("jan"));//true
   
  System.out.println(v1.containsAll(v2));//false
  
  
		//[nawaz, shaik, jan, sasi, harati, nagesh]
		//System.out.println("the size is:" +v1.size());
		//System.out.println("the size is:" +v1.capacity());
	}

}
