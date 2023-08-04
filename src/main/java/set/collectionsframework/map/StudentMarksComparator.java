package batch2.collectionsframework.map;

import java.util.Comparator;

public class StudentMarksComparator implements Comparator<StudentComp> {
    @Override
    public int compare(StudentComp o1, StudentComp o2) {
        return (int) (o1.getMarks() - o2.getMarks());
    }
}
