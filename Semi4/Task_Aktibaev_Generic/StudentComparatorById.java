package Semi4.Task_Aktibaev_Generic;

import java.util.Comparator;

public class StudentComparatorById implements Comparator<Student3> {
    @Override
    public int compare(Student3 o1, Student3 o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
