package iamatum.jpa.course.repositories;

import iamatum.jpa.course.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book,Long> {
}
