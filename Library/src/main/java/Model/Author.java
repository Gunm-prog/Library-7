package Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


/**
 * @author gunmProg
 */
@Entity
@Table(name="author")
@AllArgsConstructor
@NoArgsConstructor
public class Author implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="author_id")
    private Long id;

    @Column(name="last_name", nullable=false)
    private String lastName;

    @Column(name="first_name", nullable=false)
    private String firstName;

    @OneToMany(mappedBy="author")
    private Set<Book> books;

}
