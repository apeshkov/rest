package org.sandbox.resources;

import org.sandbox.domain.Book;
import org.sandbox.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Александр on 30.01.2016.
 */
@Component
@Path("books")
public class BookResource {

    @Autowired
    private BookService bookService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getBooks() {
        return bookService.getBooks();
    }
}
