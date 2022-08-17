package iamatum.jpa.course.repositories;

import iamatum.jpa.course.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
