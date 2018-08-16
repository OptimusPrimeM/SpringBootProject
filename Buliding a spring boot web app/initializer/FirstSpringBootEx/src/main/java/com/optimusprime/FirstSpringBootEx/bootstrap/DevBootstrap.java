package com.optimusprime.FirstSpringBootEx.bootstrap;

import com.optimusprime.FirstSpringBootEx.model.Author;
import com.optimusprime.FirstSpringBootEx.model.Book;
import com.optimusprime.FirstSpringBootEx.model.Publisher;
import com.optimusprime.FirstSpringBootEx.repositories.AuthorRepository;
import com.optimusprime.FirstSpringBootEx.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    /*
    * Do injected both repositories
    * */

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData() {
        Author eric = new Author("Eric", " Ev   ans");


        Publisher Harper = new Publisher("Harper Collin", "New York, America");

        Book book_1 = new Book("Domain driven Object", "1234",Harper);


        eric.getBooks().add(book_1);

        authorRepository.save(eric);
        bookRepository.save(book_1);



        Author mack = new Author("Mack", " Harvey");
        Book book_2 = new Book("Object Oriented Programming", "7588", "Object Oriented");
        mack.getBooks().add(book_2);

        authorRepository.save(mack);
        bookRepository.save(book_2);

    }
}
