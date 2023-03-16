package Semi3.Aktibaev;

import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator implements Iterator<Student3> {
    private List<Student3> student3List;

    private int index;

    public StudyGroupIterator(List<Student3> student3List) {
        this.student3List = student3List;
    }

    @Override
    public boolean hasNext() {
        return index < student3List.size() ;
    }

    @Override
    public Student3 next() {
        return student3List.get(index++);
    }
}
