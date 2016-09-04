package be.ari.informix.hibernate.poc;

import be.ari.informix.hibernate.poc.Person;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * TODO provide documentation
 *
 * @author Anrichir
 * @version $Id$
 */
public interface PersonRepository extends PagingAndSortingRepository<Person, Integer> {
}
