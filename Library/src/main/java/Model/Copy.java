package Model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


/**
 * @author gunmProg
 */
@Entity
@Table(name="copy")
@AllArgsConstructor
@NoArgsConstructor
public class Copy implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="copy_id")
    private Long copyId;

    @Column(name="available", nullable=false)
    private boolean available;

    @ManyToOne
    @JoinColumn(name="book_id", nullable=false)
    private Book book;

    @ManyToOne
    @JoinColumn(name="library_id", nullable=false)
    private Library library;

}
