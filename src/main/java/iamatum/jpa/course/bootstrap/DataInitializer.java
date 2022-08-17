package iamatum.jpa.course.bootstrap;

import iamatum.jpa.course.domain.Author;
import iamatum.jpa.course.domain.Book;
import iamatum.jpa.course.repositories.AuthorRepository;
import iamatum.jpa.course.repositories.BookRepository;
import org.apache.catalina.realm.AuthenticatedUserRealm;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile({"local","default"})
public class DataInitializer implements CommandLineRunner {
    final BookRepository bookRepository;
    final AuthorRepository authorRepository;

    public DataInitializer(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        bookRepository.deleteAll();
        authorRepository.deleteAll();

        Author author = new Author();
        author.setFirstName("James");
        author.setLastName("Joyce");
         authorRepository.save(author);
        List<Author> authors = authorRepository.findAll();
        Long authorId = authors.get(0).getId();

        Book book1 = new Book("The bible","444444444","Water press",null);
        Book book2 = new Book("Ulysses","443344444","Waterstones",null);
        Book book3 = new Book("Guide to MongoDB","24565","Amsterdam books",null);

        bookRepository.saveAll(List.of(book1,book2,book3));

        bookRepository.findAll().forEach(book -> {
            System.out.println("Id: " + book.getId() +  "Title :" + book.getTitle());
        });



        System.out.printf("No. of authors : %s ",authorRepository.count());


    }
}
