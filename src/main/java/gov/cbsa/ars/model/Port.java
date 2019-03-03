package gov.cbsa.ars.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Table(name = "ports")
@Entity
public class Port {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotEmpty
    private String name;
    private String cstr;
    private String region;
    private Integer code;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCstr() {
        return cstr;
    }

    public void setCstr(String cstr) {
        this.cstr = cstr;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
