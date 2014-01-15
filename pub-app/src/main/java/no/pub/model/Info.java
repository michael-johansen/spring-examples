package no.pub.model;


import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by matmoe on 15.01.14.
 */
public class Info {

    private long id;

    @NotBlank
    @Length(min = 3,max = 64)
    private String type;

    @NotBlank
    @Length(min = 3,max = 64)
    private String info;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
