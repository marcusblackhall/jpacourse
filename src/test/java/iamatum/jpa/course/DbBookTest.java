package iamatum.jpa.course;

import iamatum.jpa.course.config.AbstractIT;
import iamatum.jpa.course.domain.Book;
import iamatum.jpa.course.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DbBookTest extends AbstractIT {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    DataSource dataSource;


    @Test
    void shouldCountBookItems() {

        bookRepository.save(new Book("My book", "isbn", "publisher", null));
        long count = bookRepository.count();
        assertThat(count).isEqualTo(1);
    }


}
