package Lambda;


interface Game {
    void play();
}

@FunctionalInterface
        //When Interface has exactly one abstract method
interface Cab {
    void bookCab();
    double bookCab(String source, String destin);
    void bookCab(String source, String destin);
}

interface Series {
    void play(String type);
}

//class UberX implements Cab {
//
//    @Override
//    public void bookCab() {
//        System.out.println("Hey!");
//    }
//
//    @Override
//    public void bookCab(String source, String destin) {
//
//    }
//}

public class lambdaDemo {

    public static void main(String[] args) {
        Game football = () -> System.out.println("hey!");
        football.play();

        Cab cab = () -> {
            System.out.println("Hey!!");
        
    }
}
