package streams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public
class Author {

    private String name;
    private String surname;
    private String dateOfBirth;
    private String dateOfDeath;
}
