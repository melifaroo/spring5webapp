/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author melifaro
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
