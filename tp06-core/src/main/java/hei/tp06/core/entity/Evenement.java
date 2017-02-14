package hei.tp06.core.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by N0stress on 14/02/2017.
 */
public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    public long getId() {
        return id;
    }

    private Date start;

    private Date end;

    private String title;

    private String description;

    private String color;

}
