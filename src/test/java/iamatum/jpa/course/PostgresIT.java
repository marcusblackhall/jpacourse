package iamatum.jpa.course;

import iamatum.jpa.course.repositories.AuthorRepository;
import iamatum.jpa.course.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

import javax.sql.DataSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

@ActiveProfiles("local")
@DataJpaTest
@ComponentScan(basePackages = "iamatum.jpa.course.bootstrap")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PostgresIT {

    @Autowired
    DataSource dataSource;
    @Autowired
    BookRepository bookRepository;
    @Autowired
    AuthorRepository authorRepository;

    @Test
    void shouldHaveBooks() {

        assertAll(
                () -> assertThat(bookRepository.count()).isEqualTo(3),
                () -> assertThat(authorRepository.count()).isEqualTo(1)


        );

        assertThat(bookRepository.count()).isEqualTo(3);
    }
}
