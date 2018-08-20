package com.optimusprime.FirstSpringBootEx.bootstrap;

import com.optimusprime.FirstSpringBootEx.model.Author;
import com.optimusprime.FirstSpringBootEx.model.Book;
import com.optimusprime.FirstSpringBootEx.model.Publisher;
import com.optimusprime.FirstSpringBootEx.repositories.AuthorRepository;
import com.optimusprime.FirstSpringBootEx.repositories.BookRepository;
import com.optimusprime.FirstSpringBootEx.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    /*
    * Do injected both repositories
    * */

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData() {
        Author eric = new Author("Eric", " Ev   ans");
        Publisher harper = new Publisher();
        harper.setName("harper");
        Book book_1 = new Book("Domain driven Object", "1234", harper);
        eric.getBooks().add(book_1);

        publisherRepository.save(harper);
        bookRepository.save(book_1);
        authorRepository.save(eric);


        Author mack = new Author("Mack", " Harvey");
        Book book_2 = new Book("Object Oriented Programming", "7588",harper);
        mack.getBooks().add(book_2);

        bookRepository.save(book_2);
        authorRepository.save(mack);

    }
}
