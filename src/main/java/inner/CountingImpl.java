package inner;

public class CountingImpl implements Counting{
    @Override
    public void count(int a, int b) {
        System.out.println(a+ b);
    }


}
