import java.util.HashSet;
import java.util.Iterator;
 
public class HashSetExp {
 
    public static void main(String a[]){
        HashSet<String> hs = new HashSet<String>();
        //add elements to HashSet
        hs.add("Ravi");
        hs.add("Rakesh");
        hs.add("Ashok");
        hs.add("Anil");
        hs.add("Nikhil");
        Iterator<String> itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
