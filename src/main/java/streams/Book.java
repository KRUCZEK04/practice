package streams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public
class Book {
    private String title;
    private int yearOfPublication;
    private String isbn;
    private double rate;
    private List<Author> authors;
    private Genre genre;
    private int numberOfPages;
    private String publisher;
}
