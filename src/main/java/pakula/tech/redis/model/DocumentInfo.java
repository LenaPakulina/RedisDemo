package pakula.tech.redis.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Entity
@Table(name = "documents")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DocumentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private String title;

    private String description;

    @Column(name = "created_dt")
    private LocalDateTime created = LocalDateTime.now();
}
