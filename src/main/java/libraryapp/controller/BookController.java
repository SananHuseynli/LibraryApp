package libraryapp.controller;


import libraryapp.dto.bookDto.BookRequestDto;
import libraryapp.dto.bookDto.BookResponseDto;
import libraryapp.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/books")
public class BookController {

    private final BookService service;

    @PostMapping("/create")
    public BookResponseDto create(@RequestBody BookRequestDto request) {
        return service.create(request);
    }
}


