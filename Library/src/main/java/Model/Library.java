package Model;


import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * @author gunmProg
 */
@Entity
@Table(name="library")
@AllArgsConstructor
@NamedEntityGraph
public class Library implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="library_id")
    private Long id;

    @Column(name="library_name", nullable=false)
    private String libraryName;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="adress_id")
    private Adress adress;

    @Column(name="phone_number", length= 10, nullable=false)
    private String phoneNumber;

    @OneToMany(mappedBy="library")
    private Set<Copy> copies;

}
