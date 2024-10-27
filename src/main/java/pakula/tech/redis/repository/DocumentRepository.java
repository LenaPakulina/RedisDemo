package pakula.tech.redis.repository;

import org.springframework.data.repository.ListCrudRepository;
import pakula.tech.redis.model.DocumentInfo;

public interface DocumentRepository extends ListCrudRepository<DocumentInfo, Long> {
}
