package gov.cbsa.ars.model;

import javax.persistence.*;

@Table(name = "shifts")
@Entity
public class Shift {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String type;
    private Integer number;
    private Float paid;
    private Float present;
    @Column(columnDefinition = "TEXT")
    private String note;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Float getPaid() {
        return paid;
    }

    public void setPaid(Float paid) {
        this.paid = paid;
    }

    public Float getPresent() {
        return present;
    }

    public void setPresent(Float present) {
        this.present = present;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
