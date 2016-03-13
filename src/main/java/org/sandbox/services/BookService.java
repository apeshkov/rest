package org.sandbox.services;

import org.sandbox.domain.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BookService {

    private final Logger logger = LoggerFactory.getLogger(BookService.class);

    public List<Book> getBooks() {
        logger.info("Getting all books");
        List<Book> books = new ArrayList<Book>();
        Book b1 = new Book();
        b1.setTitle("Harry Potter and the deathly hallows part 1");
        b1.setAnnotation("Annotation1");
        b1.setDateOfPublishing(new Date());
        b1.setPageCount(817);

        Book b2 = new Book();
        b2.setTitle("Harry Potter and the deathly hallows part 2");
        b2.setAnnotation("Annotation2");
        b2.setDateOfPublishing(new Date());
        b2.setPageCount(765);

        Book b3 = new Book();
        b3.setTitle("Alice in the Wonderland");
        b3.setAnnotation("Annotation3");
        b3.setDateOfPublishing(null);
        b3.setPageCount(178);

        Book b4 = new Book();
        b4.setTitle("Hobbit. An unexpected journey");
        b4.setAnnotation("Annotation4");
        b4.setDateOfPublishing(new Date());
        b4.setPageCount(450);

        Book b5 = new Book();
        b5.setTitle("Fight club");
        b5.setAnnotation("Annotation5");
        b5.setDateOfPublishing(new Date());
        b5.setPageCount(326);

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        logger.debug("Got {} books: {}.", books.size(), books);
        return books;
    }
}
