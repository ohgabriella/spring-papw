package br.unipe.papw.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unipe.papw.api.model.Person;

/**
 * This use JpaRepository that extends the PagingAndSortingRepository that extends CRUDRepository.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
