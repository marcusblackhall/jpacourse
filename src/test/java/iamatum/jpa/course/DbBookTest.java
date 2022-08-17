package iamatum.jpa.course;

import iamatum.jpa.course.domain.Book;
import iamatum.jpa.course.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

import javax.sql.DataSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
//@ActiveProfiles("local")
@ComponentScan(basePackages = "iamatum.jpa.course.bootstrap")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DbBookTest {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    DataSource dataSource;

    @Test
    void shouldCountBookItems() {
        bookRepository.save(new Book("My book", "isbn", "publisher",1l));
        long count = bookRepository.count();
        assertThat(count).isEqualTo(4);
    }

}
