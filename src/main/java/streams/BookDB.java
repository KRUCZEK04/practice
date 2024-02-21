package streams;

import java.util.ArrayList;
import java.util.List;

public class BookDB {

    public static List<Author> generateAuthors() {
        return List.of(
                new Author("John", "Doe", "01/15/1980", "N/A"),
                new Author("Jane", "Smith", "05/20/1975", "N/A"),
                new Author("David", "Johnson", "03/10/1990", "N/A"),
                new Author("Mary", "Brown", "07/25/1985", "N/A"),
                new Author("Michael", "Johnson", "02/18/1972", "N/A"),
                new Author("Jennifer", "Lee", "11/30/1988", "N/A"),
                new Author("Robert", "Garcia", "08/12/1965", "08/12/2000"),
                new Author("Michelle", "Rodriguez", "04/03/1983", "N/A"),
                new Author("James", "Brown", "09/24/1979", "N/A"),
                new Author("Kimberly", "Martinez", "06/07/1995", "N/A"),
                new Author("William", "Smith", "12/15/1970", "12/15/2020"),
                new Author("Emily", "Lopez", "10/29/1987", "N/A"),
                new Author("Daniel", "Taylor", "03/21/1992", "N/A"),
                new Author("Emily", "Davis", "07/08/1980", "N/A"),
                new Author("Matthew", "Hernandez", "05/02/1974", "08/12/2012"),
                new Author("Jessica", "Clark", "01/12/1989", "N/A"),
                new Author("David", "Turner", "06/25/1982", "N/A"),
                new Author("Hannah", "Moore", "09/17/1991", "N/A"),
                new Author("Kevin", "Ward", "08/06/1978", "N/A"),
                new Author("Amanda", "Perez", "04/14/1985", "N/A")
        );
    }

    public static List<Book> generateBooks(List<Author> authors) {
        List<Author> authorsForBook1 = new ArrayList<>();
        authorsForBook1.add(authors.get(1));
        Book book1 = new Book("The Great Novel", 2005, "978-1234567890", 4.8,
                authorsForBook1, Genre.FICTION, 350, "Best Publishers");

        List<Author> authorsForBook2 = new ArrayList<>();
        authorsForBook2.add(authors.get(2));
        Book book2 = new Book("Another Book", 2010, "978-0987654321", 4.5,
                authorsForBook2, Genre.MYSTERY, 400, "Amazing Books");

        List<Author> authorsForBook3 = new ArrayList<>();
        authorsForBook3.add(authors.get(3));
        Book book3 = new Book("Science and Technology", 2018, "978-5555555555", 4.2,
                authorsForBook3, Genre.SCIENCE_FICTION, 250, "Tech Publications");

        List<Author> authorsForBook4 = new ArrayList<>();
        authorsForBook4.add(authors.get(4));
        Book book4 = new Book("Cooking Delights", 2015, "978-7777777777", 4.9,
                authorsForBook4, Genre.COOKING, 180, "Chef's Haven");

        List<Author> authorsForBook5 = new ArrayList<>();
        authorsForBook5.add(authors.get(5));
        Book book5 = new Book("Thrilling Adventure", 2012, "978-3333333333", 4.7,
                authorsForBook5, Genre.ADVENTURE, 300, "Adventure Publications");

        List<Author> authorsForBook6 = new ArrayList<>();
        authorsForBook6.add(authors.get(6));
        Book book6 = new Book("Art of Design", 2016, "978-4444444444", 4.9,
                authorsForBook6, Genre.ART, 200, "Creative Designs");

        List<Author> authorsForBook7 = new ArrayList<>();
        authorsForBook7.add(authors.get(7));
        authorsForBook7.add(authors.get(9));
        Book book7 = new Book("Cooking Classics", 2010, "978-5555555555", 4.6,
                authorsForBook7, Genre.COOKING, 180, "Gourmet Kitchen");

        List<Author> authorsForBook8 = new ArrayList<>();
        authorsForBook8.add(authors.get(8));
        Book book8 = new Book("Mindfulness Meditation", 2018, "978-6666666666", 4.5,
                authorsForBook8, Genre.SELF_HELP, 250, "Mindful Living");

        List<Author> authorsForBook9 = new ArrayList<>();
        authorsForBook9.add(authors.get(9));
        Book book9 = new Book("The History of Everything", 2015, "978-7777777777", 4.8,
                authorsForBook9, Genre.HISTORY, 400, "History Press");

        List<Author> authorsForBook10 = new ArrayList<>();
        authorsForBook10.add(authors.get(10));
        Book book10 = new Book("Children's Tales", 2008, "978-8888888888", 4.6,
                authorsForBook10, Genre.CHILDREN, 120, "Kids Stories Inc.");

        List<Author> authorsForBook11 = new ArrayList<>();
        authorsForBook11.add(authors.get(11));
        Book book11 = new Book("Philosophy: A Journey", 2007, "978-1111111111", 4.5,
                authorsForBook11, Genre.PHILOSOPHY, 320, "Deep Thinkers Publishing");

        List<Author> authorsForBook12 = new ArrayList<>();
        authorsForBook12.add(authors.get(12));
        Book book12 = new Book("The Science of Cosmos", 2019, "978-2222222222", 4.8,
                authorsForBook12, Genre.SCIENCE_FICTION, 380, "Stellar Press");

        List<Author> authorsForBook13 = new ArrayList<>();
        authorsForBook13.add(authors.get(13));
        Book book13 = new Book("The Drama of Life", 2014, "978-3333333333", 4.7,
                authorsForBook13, Genre.DRAMA, 260, "Theater Publications");

        List<Author> authorsForBook14 = new ArrayList<>();
        authorsForBook14.add(authors.get(14));
        Book book14 = new Book("The Musician's Guide", 2011, "978-4444444444", 4.9,
                authorsForBook14, Genre.MUSIC, 210, "Harmony House");

        List<Author> authorsForBook15 = new ArrayList<>();
        authorsForBook15.add(authors.get(15));
        Book book15 = new Book("Mindful Parenting", 2017, "978-5555555555", 4.6,
                authorsForBook15, Genre.SELF_HELP, 180, "Parenting Experts");

        List<Author> authorsForBook16 = new ArrayList<>();
        authorsForBook16.add(authors.get(16));
        Book book16 = new Book("The Mystery of Shadows", 2013, "978-6666666666", 4.5,
                authorsForBook16, Genre.MYSTERY, 280, "Enigma Press");

        List<Author> authorsForBook17 = new ArrayList<>();
        authorsForBook17.add(authors.get(17));
        Book book17 = new Book("The Art of Leadership", 2016, "978-7777777777", 4.8,
                authorsForBook17, Genre.BIOGRAPHY, 320, "Leadership Insights");

        List<Author> authorsForBook18 = new ArrayList<>();
        authorsForBook18.add(authors.get(18));
        Book book18 = new Book("The Sports Encyclopedia", 2012, "978-8888888888", 4.6,
                authorsForBook18, Genre.SPORTS, 400, "Sports Authority");

        List<Author> authorsForBook19 = new ArrayList<>();
        authorsForBook19.add(authors.get(19));
        Book book19 = new Book("Traveler's Tales", 2018, "978-9999999999", 4.7,
                authorsForBook19, Genre.TRAVEL, 300, "Wanderlust Books");

        List<Author> authorsForBook20 = new ArrayList<>();
        authorsForBook20.add(authors.get(18));
        Book book20 = new Book("The Science of Happiness", 2010, "978-0000000000", 4.9,
                authorsForBook20, Genre.SELF_HELP, 250, "Positive Living");
        List<Author> authorsForBook21 = new ArrayList<>();
        authorsForBook21.add(authors.get(1));
        authorsForBook21.add(authors.get(13));
        Book book21 = new Book("Coding Essentials", 2018, "978-1010101010", 4.7,
                authorsForBook21, Genre.EDUCATION, 280, "Tech Mastery");

        List<Author> authorsForBook22 = new ArrayList<>();
        authorsForBook22.add(authors.get(2));
        authorsForBook22.add(authors.get(12));
        Book book22 = new Book("Romantic Escapades", 2019, "978-1212121212", 4.9,
                authorsForBook22, Genre.ROMANCE, 210, "Love Stories Inc.");

        List<Author> authorsForBook23 = new ArrayList<>();
        authorsForBook23.add(authors.get(3));
        Book book23 = new Book("Thriller Chronicles", 2016, "978-1313131313", 4.8,
                authorsForBook23, Genre.THRILLER, 320, "Suspenseful Reads");

        List<Author> authorsForBook24 = new ArrayList<>();
        authorsForBook24.add(authors.get(3));
        Book book24 = new Book("Historical Journeys", 2013, "978-1414141414", 4.6,
                authorsForBook24, Genre.HISTORY, 390, "Heritage Press");

        List<Author> authorsForBook25 = new ArrayList<>();
        authorsForBook25.add(authors.get(10));
        Book book25 = new Book("The Mindful Explorer", 2017, "978-1515151515", 4.5,
                authorsForBook25, Genre.TRAVEL, 250, "Explorer's Guild");

        List<Author> authorsForBook26 = new ArrayList<>();
        authorsForBook26.add(authors.get(6));
        Book book26 = new Book("Innovative Designs", 2014, "978-1616161616", 4.9,
                authorsForBook26, Genre.ART, 220, "Creative Studios");

        List<Author> authorsForBook27 = new ArrayList<>();
        authorsForBook27.add(authors.get(7));
        Book book27 = new Book("The Cooking Maestro", 2011, "978-1717171717", 4.7,
                authorsForBook27, Genre.COOKING, 280, "Chef's Delight");

        List<Author> authorsForBook28 = new ArrayList<>();
        authorsForBook28.add(authors.get(8));
        Book book28 = new Book("Mindful Living", 2015, "978-1818181818", 4.8,
                authorsForBook28, Genre.SELF_HELP, 240, "Life Insights");

        List<Author> authorsForBook29 = new ArrayList<>();
        authorsForBook29.add(authors.get(11));
        Book book29 = new Book("The Mystery of Time", 2012, "978-1919191919", 4.7,
                authorsForBook29, Genre.MYSTERY, 290, "Timeless Publications");

        List<Author> authorsForBook30 = new ArrayList<>();
        authorsForBook30.add(authors.get(12));
        authorsForBook30.add(authors.get(18));
        authorsForBook30.add(authors.get(3));
        Book book30 = new Book("Children's Fun and Games", 2016, "978-2020202020", 4.9,
                authorsForBook30, Genre.CHILDREN, 180, "Playful Publishing");

        return List.of(book1, book2, book3, book4, book5, book6, book7, book8,
                book9, book10, book11, book12, book13, book14, book15,
                book16, book17, book18, book19, book20, book21, book22,
                book23, book24, book25, book26, book27, book28, book29, book30
        );

    }
}
