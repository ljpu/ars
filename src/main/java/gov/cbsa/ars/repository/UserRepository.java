package gov.cbsa.ars.repository;

import gov.cbsa.ars.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "/users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
//    List<User> findByType(@Param("type") String type);
}
