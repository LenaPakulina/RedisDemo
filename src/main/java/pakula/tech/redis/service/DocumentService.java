package pakula.tech.redis.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pakula.tech.redis.model.DocumentInfo;
import pakula.tech.redis.repository.DocumentRepository;

import java.util.Random;

@Service
@AllArgsConstructor
public class DocumentService {
    private final DocumentRepository documentRepository;

    public DocumentInfo getDocumentInfo(Long id) {
        return documentRepository.findById(id).orElse(null);
    }

    public DocumentInfo getRandomDocumentInfo() {
        long count = documentRepository.count();
        long documentNum = new Random().nextLong(1, count);
        return getDocumentInfo(documentNum);
    }
}
