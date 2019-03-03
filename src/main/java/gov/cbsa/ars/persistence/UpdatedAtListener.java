package gov.cbsa.ars.persistence;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.sql.Timestamp;
import java.util.Date;

public class UpdatedAtListener {
    @PrePersist
    @PreUpdate
    public void setUpdatedAt(final ITimestampable entity) {
        entity.setUpdatedAt(new Timestamp(new Date().getTime()));
    }
}
