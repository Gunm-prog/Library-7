package Model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author gunmProg
 */
@Entity
@Table(name="adress")
@AllArgsConstructor
@NoArgsConstructor
public class Adress implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="adress_id")
    private Long libraryId;

    @Column(name="number", nullable=false)
    private int number;

    @Column(name="street", length= 50, nullable=false)
    private String street;

    @Column(name="zipcode", length= 5, nullable=false)
    private int zipcode;

    @Column(name="city", nullable=false)
    private String city;

}
