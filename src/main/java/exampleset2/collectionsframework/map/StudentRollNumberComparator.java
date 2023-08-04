package batch2.collectionsframework.map;

import batch2.collectionsframework.map.StudentComp;

import java.util.Comparator;

public class StudentRollNumberComparator implements Comparator<StudentComp> {

    @Override
    public int compare(StudentComp o1, StudentComp o2) {
        return o1.getRollNumber() - o2.getRollNumber();
    }
}
