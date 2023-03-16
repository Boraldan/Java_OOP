package Semi4.Task_Aktibaev_Generic;

import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator<E> implements Iterator<E> {
    private List<E> student3List;

    private int index;

    public StudyGroupIterator(List<E> student3List) {
        this.student3List = student3List;
    }

    @Override
    public boolean hasNext() {
        return index < student3List.size() ;
    }

    @Override
    public E next() {
        return student3List.get(index++);
    }
}
