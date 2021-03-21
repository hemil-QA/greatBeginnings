package Generics;

import java.util.ArrayList;
import java.util.List;

public class genericsImplementation {

    static <X> X doubleValue(X value) {
        return value;
    }

    static <X extends List> void duplicate(X list) {
        List sampleList = new ArrayList();
        sampleList.addAll(list);
    }

    static double sumOfNumberList(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    static void addACoupleOfValues(List<? super Number> numbers) {
        numbers.add(1);
        numbers.add(1.0);
        numbers.add(1.0f);
        numbers.add(1l);
    }

    public static void main(String[] args) {

        MyCustomList<Long> list = new MyCustomList<>();
        list.addElement(5l);
        list.addElement(6l);
        System.out.println(list);
        Long value = list.get(0);
        System.out.println(value);
        System.out.println(list);

        MyCustomList<Integer> list1 = new MyCustomList();
        list1.addElement(Integer.valueOf(5));
        list1.addElement(Integer.valueOf(7));
        Integer value1 = list1.get(0);
        System.out.println(value1);
        System.out.println(list1);

        String value2 = doubleValue(new String());
        Integer number = doubleValue(Integer.valueOf(5));
        ArrayList list2 = doubleValue(new ArrayList<>());
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
        duplicate(numbers);
        System.out.println(numbers);


        List<Integer> arr = new ArrayList<Integer>(4);
        // using add() to initialize values
        // [10, 20, 30, 40]
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        System.out.println("List: " + arr);
        // element at index 2
        int element = arr.get(2);
        System.out.println("The element at index 2 is " + element);


        System.out.println(sumOfNumberList(List.of(1, 2, 3)));
        System.out.println(sumOfNumberList(List.of(1.1, 1.2, 1.4)));
        System.out.println(sumOfNumberList(List.of(1l, 2l, 3l)));


        List emptyList = new ArrayList<Number>();
        addACoupleOfValues(emptyList);
        System.out.println();

    }
}
