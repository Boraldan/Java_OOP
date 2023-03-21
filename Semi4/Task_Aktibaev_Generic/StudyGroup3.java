package Semi4.Task_Aktibaev_Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup3<E extends Test> implements Iterable<E>{
//public class StudyGroup3<E extends Student3> implements Iterable<E>{  вариант без интерфейса TEST
    private List<E> student3List;

    public StudyGroup3() {
        student3List = new ArrayList<>();
    }
    public List<E> getStudent3List() {
        return student3List;
    }

    public void addStudent(E student3){
        student3.getId();
        student3List.add(student3);
    }

    @Override
    public Iterator<E> iterator() {
        return new StudyGroupIterator<E>(student3List);
    }

    /* Ниже вариант для реализации функционала List без описания дополнительного класса StudyGroupIterator.
       Просто передача списка этого класса.  */
//    @Override
//    public Iterator<Student3> iterator() {
//        return student3List.iterator();
//    }

}
