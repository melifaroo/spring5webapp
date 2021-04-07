/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.spring5webapp.domain;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author melifaro
 */
public class Book {

    private Long id;

    private String title;
    private String isbn;
    private Set<Author> authors;

    public Book() {
    }

    public Book(Long id, String title, String isbn, Set<Author> authors) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.authors = authors;
    }

    public Book(Long id, String title, String isbn) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Set<Author> getAuthors() {
        if (authors == null) {
            authors = new HashSet<Author>();
        }
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }


}
