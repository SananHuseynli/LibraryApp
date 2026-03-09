package libraryapp.service.impl;

import libraryapp.dto.bookDto.BookRequestDto;
import libraryapp.dto.bookDto.BookResponseDto;
import libraryapp.entity.Books;
import libraryapp.repo.BookRepository;
import libraryapp.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepo;
    @Override
    public BookResponseDto create(BookRequestDto request) {
        Books book=new Books();
        book.setName(request.getName());
        book.setDescription(request.getDescription());
        book.setPrice(request.getPrice());
        book.setCategory(request.getCategory());
        book.setAuthor(request.getAuthor());
         Books save = bookRepo.save(book);
        System.out.println("We saved book successfully"+ save);

        BookResponseDto responseDto=new BookResponseDto();
        responseDto.setName(save.getName());
        responseDto.setPrice(save.getPrice());
        responseDto.setAuthor(save.getAuthor());
        responseDto.setDescription(save.getDescription());
        responseDto.setImage(save.getImage());
        responseDto.setRating(save.getRating());
        return responseDto;
    }
}
