package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class StudentInfo {

    void testStudents(ArrayList<Student> a1, Predicate<Student> pr) {
        for (Student s : a1) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }

}

class Test {
    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolai", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();




        info.testStudents(students, s -> s.avgGrade > 8);
        System.out.println("--------------------------------------");
        info.testStudents(students, s -> s.age < 30);
        System.out.println("--------------------------------------");
        info.testStudents(students, s -> s.age > 20 && s.avgGrade < 9.5 && s.sex == 'f');




//        Collections.sort(students, (s1, s2) -> s1.course-s2.course);
//        System.out.println(students);



//        System.out.println("--------------------------------------");
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age < 30;
//            }
//        });
//

//        System.out.println("--------------------------------------");
//        info.printStudentsUnderAge(students, 30);
//        System.out.println("--------------------------------------");
//        info.printStudentsMixCondition(students, 20, 9.5, 'f');


    }

}

//
//interface StudentChecks {
//    boolean check(Student s);
//}


//class CheckOverGrade implements StudentChecks {
//
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade > 8;
//    }
//}