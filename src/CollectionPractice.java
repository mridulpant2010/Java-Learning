import java.util.*;

public class CollectionPractice {


    public static void main(String[] args) {

        //use of the hashset in java.
        HashSet<String> hs = new HashSet<>();
        hs.add("1");
        hs.add("2");
        hs.add("3");
        hs.add("4");
        hs.add("4");
        hs.remove("3");

        Iterator it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //java hashset from another collection
        ArrayList<String> al = new ArrayList<>();
        al.add("50");
        al.add("43");
        al.add("12");
        al.add("12");
        //converting the arraylist into a hashset.
        HashSet<String> j2=new HashSet<>(al);
        Iterator its = j2.iterator();
        while(its.hasNext()){
            System.out.println(its.next());
        }

        //creating a hashmap in java.

        HashMap<Integer,String> hmap= new HashMap<>();
        hmap.put(1,"mango");
        hmap.put(2,"buttons");
        hmap.put(3,"checks");

        for (Map.Entry m:hmap.entrySet()){
            System.out.println(m.getKey()+" : "+m.getValue());
        }
    }

}

