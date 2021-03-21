package Hi;

import java.util.*;


interface HelloWorld {
    void world();
}

class Container<T extends Object> {
    T value;
    //? -> T -> Number

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void show() {
        System.out.println(value.getClass().getTypeName());
    }

    public void demo(ArrayList<? super T> obj) {
        System.out.println("Hey user!");
    }

}


public class helloWorld {
    public static void main(String[] args) {
        System.out.println("Hello Senior Consultant");


        Collection values = new ArrayList();
        values.add(5);

        //Iterator
        Iterator i = values.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println(values);

        List list = new ArrayList();
        list.add(1);
        list.add("abcd");

        Object m = (list.get(1));
        System.out.println(list.get(1).getClass());

        //List
        List<Integer> values1 = new ArrayList<Integer>();
        values1.add(305);
        values1.add(998);
        values1.add(774);
        values1.add(236);
        values1.add(881);

        Collections.sort(values1);

        Collections.reverse(values1);
        values1.forEach(System.out::println);


        //Generics Demo
        Container<Number> obj1 = new Container();
        obj1.value = 2.0;
        obj1.show();
        ArrayList<Number> arrayList = new ArrayList<>();
        obj1.demo(arrayList);

        //Comparator implementation

//        Comparator<Integer> com = new ComImpl();
//        System.out.println("...........");
//        Collections.sort(values1,com);
//        for (Object s : values1)
//        {
//            System.out.println(s);
//        }

//        Comparator<Integer> comparator = (o1,o2) -> {
//             return o1%10>o2%10?1:-1;
//        };
//        Collections.sort(values1,comparator);
//        for (Object s : values1)
//        {
//            System.out.println(s);
//        }

        Collections.sort(values1,(o1,o2) -> {
             return o1%10>o2%10?1:-1;
        });
        for (Object s : values1)
        {
            System.out.println(s);
        }


    }
}




