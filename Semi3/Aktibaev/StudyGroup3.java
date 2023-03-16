package Semi3.Aktibaev;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup3 implements Iterable<Student3>{
    private List<Student3> student3List;

    public StudyGroup3() {
        student3List = new ArrayList<>();
    }
    public List<Student3> getStudent3List() {
        return student3List;
    }

    public void addStudent(Student3 student3){
        student3List.add(student3);
    }

    @Override
    public Iterator<Student3> iterator() {
        return new StudyGroupIterator(student3List);
    }

    /* Ниже вариант для реализации функционала List без описания дополнительного класса StudyGroupIterator.
       Просто передача списка этого класса.  */
//    @Override
//    public Iterator<Student3> iterator() {
//        return student3List.iterator();
//    }

}
