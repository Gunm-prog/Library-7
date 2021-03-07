package Model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author gunmProg
 */
@Entity
@Table(name="cover")
@AllArgsConstructor
@NoArgsConstructor
public class Cover implements Serializable {

    private static final long servialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="cover_id")
    private Long coverId;

    @Column(name="title", nullable=false)
    private String title;

    @Column(name="url_path", nullable=false)
    private String urlPath;

}
