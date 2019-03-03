package gov.cbsa.ars.repository;

import gov.cbsa.ars.model.Port;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource()
public interface PortRepository extends PagingAndSortingRepository<Port, Long> {
}

