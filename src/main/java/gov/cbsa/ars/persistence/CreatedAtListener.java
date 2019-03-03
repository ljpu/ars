package gov.cbsa.ars.persistence;

import javax.persistence.PrePersist;
import java.sql.Timestamp;
import java.util.Date;

public class CreatedAtListener {
	@PrePersist
	public void setCreatedAt(final ITimestampable entity) {
		if(entity.getCreatedAt() == null)
			entity.setCreatedAt(new Timestamp(new Date().getTime()));
	}
}
