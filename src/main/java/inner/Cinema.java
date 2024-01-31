package inner;

public class Cinema {


    public static class MovieStatic {

        private String title;
        public MovieStatic(String title) {
            this.title = title;
        }

        public void showTitle() {
            System.out.println("Title: " + title);
        }
    }

    public class Movie {

        private String title;
        public Movie(String title) {
            this.title = title;
        }

        public void showTitle() {
            System.out.println("Title: " + title);
        }

    }
    private Movie movie;

    public int exampleOfLocalClasses(int a, int b) {
        class LocalClass {
            public int calculate() {
                return a + b;
            }
        }

        LocalClass localClass = new LocalClass();

        int calculate = localClass.calculate();

        return calculate + 10;
    }


}
