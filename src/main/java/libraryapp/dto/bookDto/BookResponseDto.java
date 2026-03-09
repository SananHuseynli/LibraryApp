package libraryapp.dto.bookDto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import libraryapp.entity.Author;
import libraryapp.entity.Category;
import lombok.Data;

@Data
public class BookResponseDto {

    private String name;
    private String description;
    private Author author;
    private double price;
    @Enumerated(EnumType.STRING)
    private Category category;
    private double rating;
    private String image;
}
