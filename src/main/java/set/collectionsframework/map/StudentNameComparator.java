package batch2.collectionsframework.map;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<StudentComp> {
    @Override
    public int compare(StudentComp o1, StudentComp o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
