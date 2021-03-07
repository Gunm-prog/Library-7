package Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


/**
 * @author gunmProg
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="book")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="book_id")
    private Long bookId;

    @Column(name="title")
    private String title;

    @ManyToOne
    @JoinColumn(name="author_id", nullable=false)
    private Author author;

    @OneToMany(mappedBy="book")
    private Set<Copy> copies;

    @Column(name="nbOfCopies")
    private int nbOfCopies;
    @Column(name="category")
    private String category;
    @Column(name="summary")
    private String summary;
    @Column(name="isbn")
    private String isbn;

}
