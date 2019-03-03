package gov.cbsa.ars.persistence;

import java.sql.Timestamp;

public interface ITimestampable {
	Timestamp getCreatedAt();

	void setCreatedAt(Timestamp createdAt);

	Timestamp getUpdatedAt();

	void setUpdatedAt(Timestamp updatedAt);
}
