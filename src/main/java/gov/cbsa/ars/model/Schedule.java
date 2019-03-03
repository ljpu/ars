package gov.cbsa.ars.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Table(name = "schedules")
@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotEmpty
    private String port;

    public long getId() {
        return id;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "Schedule - Port: " + this.port;
    }

}
