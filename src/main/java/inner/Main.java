package inner;


import java.util.List;

public class Main {


    public static void main(String[] args){
        List<String> books = List.of("Władca pierścieni", "Harry Potter", "Nowy testament 213123123");

        books.stream()
                .filter(book -> book.length() > 12)
                .limit(1)
                .forEach(book -> System.out.println(book));

    }

    public static void normalMethod(Runnable test){
        test.run();
        System.out.println("HEJ");
    }

}
