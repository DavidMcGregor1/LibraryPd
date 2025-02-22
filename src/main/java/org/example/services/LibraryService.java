package org.example.services;

import org.example.services.dto.LibraryAccessRequestDto;
import org.example.services.dto.LibraryAccessResponseDto;
import org.example.services.dto.ValidationRequestDto;

public class LibraryService {

    ValidationService validationService;

    public LibraryService(ValidationService validationService) {
        this.validationService = validationService;
    }

    public LibraryAccessResponseDto accessLibrary(LibraryAccessRequestDto request) {

        var builder = new ValidationRequestDto.Builder();
        builder.userType = request.getUserType();

     boolean isValid = validationService.validateUser(builder.build());
        if (isValid) {
            return new LibraryAccessResponseDto(1, "Access granted", true);
        } else {
            return new LibraryAccessResponseDto(1, "Access denied", false);
        }
    }
}