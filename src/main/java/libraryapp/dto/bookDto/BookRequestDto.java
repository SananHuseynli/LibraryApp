package libraryapp.dto.bookDto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import libraryapp.entity.Author;
import libraryapp.entity.Category;
import lombok.Data;

@Data
public class BookRequestDto {

    private String name;
    private String description;
    private double price;

    @Enumerated(EnumType.STRING)
    private Category category;

    private Author author;

}
