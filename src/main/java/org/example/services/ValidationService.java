package org.example.services;

import org.example.services.dto.ValidationRequestDto;
import org.example.utils.UserTypes;

public class ValidationService {
    public boolean validateUser(ValidationRequestDto request) {
        return request.getUserType() == UserTypes.LIBRARIAN;
    }

    public boolean validateInput(String input) {
        String [] allowedInputs = {"L", "G", "M", "H"};
        for (String allowedInput : allowedInputs) {
            if (allowedInput.equals(input)) {
                return true;
            }
        }
        return false;
    }
}
