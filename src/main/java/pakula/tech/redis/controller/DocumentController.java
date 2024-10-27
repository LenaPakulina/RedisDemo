package pakula.tech.redis.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pakula.tech.redis.model.DocumentInfo;
import pakula.tech.redis.service.DocumentService;

@RestController
@AllArgsConstructor
public class DocumentController {
    private final DocumentService documentService;

    @GetMapping("/getRandomDocument")
    public DocumentInfo getRandomDocumentInfo() {
        return documentService.getRandomDocumentInfo();
    }

    @GetMapping("/document/{id}")
    public DocumentInfo getDocumentInfo(@PathVariable Long id) {
        return documentService.getDocumentInfo(id);
    }
}
