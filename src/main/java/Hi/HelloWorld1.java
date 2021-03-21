package Hi;

@FunctionalInterface
interface FuncInterface {
    void abstractFun(int x);
}

class B {
    public void show()
    {
        System.out.println("I am making through February with Flying colors, I am a #BlessedThoughtworker");
    }

}

class Test {
    public static void main(String args[]) {
        FuncInterface fobj = (int x) -> System.out.println("I am making through February with Flying colors, I am a #BlessedThoughtworker");
        FuncInterface funcInterface = new FuncInterface() {
            @Override
            public void abstractFun(int x) {
                System.out.println("I am making through February with Flying colors, I am a #BlessedThoughtworker");
            }
        };
        B b = new B()
        {
            @Override
            public void show() {
                System.out.println("I am making through February with Flying colors, I am a #BlessedThoughtworker");
            }
        };
        b.show();
    }
}