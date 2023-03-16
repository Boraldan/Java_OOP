package Semi3.Aktibaev;

import java.util.Collections;

public class Service {
    private StudyGroup3 studyGroup3;
    private static int idStudent;

    public Service(StudyGroup3 studyGroup3) {
        this.studyGroup3 = studyGroup3;
        idStudent = 0;
    }
    public void addStudet(String name){
        Student3 student = new Student3(idStudent++, name);
        studyGroup3.addStudent(student);
    }

    // функция sortByName  испльзует метод Comparable в классе  Student3
    public void sortByName(){
        Collections.sort(studyGroup3.getStudent3List());
    }

    // функция sortById  испльзует метод Comparator с отдельным правилом в классе  StudentComparatorById
    public void sortById(){
        Collections.sort(studyGroup3.getStudent3List(), new StudentComparatorById());
    }
}
