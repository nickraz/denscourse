import java.util.Iterator;
import java.util.TreeSet;

public class Organization {
    private TreeSet<String> deps = new TreeSet<>();
    private TreeSet<String> heads = new TreeSet<>();

    public void add(String dep){
        heads.add(dep.split("\\\\")[0]);
        deps.add(dep);
    }

    public void printAll(boolean asc){
        Iterator<String> headIterator = asc ? heads.iterator() : heads.descendingIterator();
        while (headIterator.hasNext()){
            String val = headIterator.next();
            System.out.println(val);
            Iterator<String> depsIterator = asc ? deps.iterator() : deps.descendingIterator();
            while (depsIterator.hasNext()){
                String valit = depsIterator.next();
                if(valit.startsWith(val) && !val.equals(valit)){
                    System.out.println(valit);
                }
            }
        }
    }
}
