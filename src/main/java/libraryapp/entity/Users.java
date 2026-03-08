package libraryapp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.awt.print.Book;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity

public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; // İstifadəçinin adı
    private String surname; // İstifadəçinin soyadı
    private LocalDateTime birthDay; // İstifadəçinin doğum tarixi
    private String email; // İstifadəçinin e-poçt ünvanı
    private LocalDateTime createdAt; // Hesabın yaradılma tarixi
    private LocalDateTime modifyDate; // Hesabın son dəyişiklik tarixi
    private String password; // İstifadəçinin şifrəsi
    private String phoneNumber; // İstifadəçinin telefon nömrəsi
    private String role; // İstifadəçinin rolu (məsələn, admin, istifadəçi)
    private double balance; // İstifadəçinin balansı
    private String photo; // İstifadəçinin profil şəkli (URL və ya fayl adı)


    @ManyToMany(mappedBy = "users")
    private List<Books> books;
}
