/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author melifaro
 */
@Component
public class BootStrapData implements CommandLineRunner{

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }
            
    @Override
    public void run(String... args) throws Exception {
        Author author;
        Book book;
        Publisher publisher;

        publisher = new Publisher("SFG Publishing", "", "St Petersburg", "FL", "111111");
        publisherRepository.save(publisher);
        
        author = new Author("Eric", "Evans");
        book = new Book("Domain Driven Design", "111-111-111");
        author.getBooks().add(book);
        book.getAuthors().add(author);
        
        book.setPublisher(publisher);
        publisher.getBooks().add(book);

        authorRepository.save(author);
        bookRepository.save(book);
        publisherRepository.save(publisher);

        author = new Author("Rod", "Johnson");
        book = new Book("J2EE Development without EJB", "222-222-222");
        author.getBooks().add(book);
        book.getAuthors().add(author);

        book.setPublisher(publisher);
        publisher.getBooks().add(book);
        
        authorRepository.save(author);
        bookRepository.save(book);
        publisherRepository.save(publisher);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Number of Authors: " + authorRepository.count());
        System.out.println("Number of Publishers: " + publisherRepository.count());
        System.out.println("Publisher " + publisher.getName() + " Number of Books: " + publisher.getBooks().size());
    }

}
