package libraryapp.service;

import libraryapp.dto.bookDto.BookRequestDto;
import libraryapp.dto.bookDto.BookResponseDto;

public interface BookService {

    BookResponseDto create(BookRequestDto request);

}
