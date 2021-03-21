package Hi;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

    public static void main(String[] args) {

        //ramdom order
        Set<Integer> set1 = new HashSet<>();
        //proper order
        Set<Integer> set = new TreeSet<>();
        set.add(50000);
        set.add(70000);

        for (Integer i : set)
        {
            System.out.println(i);
        }
//        Collections.sort(set,
//                () -> System.out.println(""));


    }

    static class Teacher {


       static int noOfYearsExperience;
       static int salary;

        @Override
        public String toString() {
            return "Teacher{" +
                    "noOfYearsExperience=" + noOfYearsExperience +
                    ", salary=" + salary +
                    '}';
        }

        public Teacher(int noOfYearsExperience, int salary) {
            this.noOfYearsExperience = noOfYearsExperience;
            this.salary = salary;
        }


    }
}
