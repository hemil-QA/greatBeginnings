package Hi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SetImplementation {
    public static void main(String[] args) {

        List<Student1> list = new ArrayList<>();
        list.add(new Student1(2, 60));
        list.add(new Student1(4, 80));
        list.add(new Student1(5, 90));

        Collections.sort(list);

        for (Student1 i : list) {
            System.out.println(i);
        }
    }
}


    class Student1 implements Comparable<Student1> {
        int rollNo;
        int marks;

        @Override
        public String toString() {
            return "Student{" +
                    "rollNo=" + rollNo +
                    ", marks=" + marks +
                    '}';
        }

        public Student1(int rollNo, int marks) {
            this.rollNo = rollNo;
            this.marks = marks;
        }

        @Override
        public int compareTo(Student1 s) {
            return this.marks > s.marks ? -1 : this.marks < s.marks ? 1 : 0;
        }
    }




