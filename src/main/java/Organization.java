import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Organization {

    private List<Department> departments = new ArrayList<>();

    /**
     * Печать данных с сортировкой
     * @param asc Параметр сортировки (true - по возрастанию, false - по убыванию)
     */
    public void printAll(boolean asc){
        List<String> ones = departments.stream()
                .map(dept -> dept.g1)
                .distinct()
                .sorted(asc ? Comparator.naturalOrder(): Comparator.reverseOrder())
                .collect(Collectors.toList());
        ones.forEach(s -> {
            System.out.println(s);
            departments.stream()
                    .filter(department -> department.g2 != null)
                    .filter(department -> department.g1.equals(s))
                    .sorted(asc ? Comparator.naturalOrder(): Comparator.reverseOrder())
                    .forEach(System.out::println);
        });
    }

    public boolean add(String stringDeps){
        boolean result = false;
        String[] split = stringDeps.split("\\\\");
        if(split.length == 3){
            departments.add(new Department(split[0], split[1], split[2]));
            result = true;
        } else if(split.length == 2){
            departments.add(new Department(split[0], split[1]));
            result = true;
        } else {
            departments.add(new Department(split[0]));
            result = true;
        }
        return result;
    }

    /**
     * Департаменты
     */
    private static class Department implements Comparable<Department>{
        private String g1;
        private String g2;
        private String g3;

        public Department(String g1) {
            this.g1 = g1;
        }

        public Department(String g1, String g2) {
            this.g1 = g1;
            this.g2 = g2;
        }

        public Department(String g1, String g2, String g3) {
            this.g1 = g1;
            this.g2 = g2;
            this.g3 = g3;
        }

        @Override
        public String toString() {
            return g1 + ((g2 != null) ? "\\" + g2 : "") + ((g3 != null) ? "\\" + g3 : "");
        }

        @Override
        public int compareTo(Department o) {
            return toString().compareTo(o.toString());
        }
    }


}
