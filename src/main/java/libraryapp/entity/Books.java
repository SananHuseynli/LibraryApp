package libraryapp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double rating;
    private int view;
    private LocalDate createdDate;
    private String description;
    private double price;

    @Enumerated(EnumType.STRING)
    private Category category;

    private String comments;
    private String image;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @ManyToMany
    @JoinTable(
            name = "book_users",  // Cədvəl adı
            joinColumns = @JoinColumn(name = "book_id"),  // 'book_id' bu tərəfdəki xarici açar
            inverseJoinColumns = @JoinColumn(name = "user_id")  // 'user_id' digər tərəfdəki xarici açar
    )

    private List<Users>users;

    }