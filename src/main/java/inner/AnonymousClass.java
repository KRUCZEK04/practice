package inner;

public class AnonymousClass {

    public void method(int a, int b){

    }

    /**
     * Default way of instantiation
     */
    public class CountingImpl implements Counting {

        @Override
        public void count(int a, int b) {
            System.out.println("I will count from " + a + " to " + b);
        }
    }

    public void methodBasicWay(int a, int b) {
        Counting counting = new CountingImpl();
        counting.count(a, b);
    }
}
