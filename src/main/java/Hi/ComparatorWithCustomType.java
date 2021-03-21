package Hi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorWithCustomType {
    public static void main(String[] args) {

        List<Student1> list = new ArrayList<>();
        list.add(new Student1(2, 60));
        list.add(new Student1(4, 80));
        list.add(new Student1(5, 90));

        Collections.sort(list, (o1, o2) -> {
            return o1.marks > o2.marks ? -1 : o1.marks < o2.marks ? 1 : 0;
        });

        for (Student1 i : list) {
            System.out.println(i);
        }
    }
}

class Student {
    int rollNo;
    int marks;

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }

    public Student(int rollNo, int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }
}
