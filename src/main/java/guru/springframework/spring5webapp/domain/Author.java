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
public class Author {

    private Long id;

    private String firstName;
    private String lastName;
    private Set<Book> books;

    public Author() {
    }

    public Author(long id, String firstName, String lastName, Set<Book> books) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

    public Author(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        if (books == null) {
            books = new HashSet<Book>();
        }
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }


}
