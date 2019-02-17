import java.util.Comparator;
import java.util.TreeSet;

public class SortTreeSetDepartament {
    private TreeSet<String> tree = new TreeSet<>(reverseComparator());

    private Comparator<String> reverseComparator(){
        return (o1, o2) -> {
            int result = o2.compareTo(o1);
            if(!o1.contains("\\") && o2.contains("\\")){
                if(o1.equals(o2.split("\\\\")[0])){
                    result = -1;
                }
            } else if(o1.contains("\\") && !o2.contains("\\")){
                if(o1.split("\\\\")[0].equals(o2)){
                    result = 1;
                }
            }
            return result;
        };
    }

    public void add(String val){
        String[] parts = val.split("\\\\");
        tree.add(parts[0]);
        tree.add(val);
    }

    public void print(){
        tree.forEach(System.out::println);
    }
}
