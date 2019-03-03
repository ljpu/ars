package gov.cbsa.ars.repository;

import gov.cbsa.ars.model.Shift;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "/shifts", path = "shifts")
public interface ShiftRepository extends PagingAndSortingRepository<Shift, Long> {
    List<Shift> findByType(@Param("type") String type);

    List<Shift> findByNumber(@Param("number") Integer number);

    List<Shift> findByPaid(@Param("paid") Float paid);

    List<Shift> findByPresent(@Param("present") Float present);
}
