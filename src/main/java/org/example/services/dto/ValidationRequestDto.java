package org.example.services.dto;

import org.example.utils.UserTypes;

public class ValidationRequestDto {
    public UserTypes userType;

    public ValidationRequestDto(UserTypes userType) {
        this.userType = userType;
    }

    public UserTypes getUserType() {
        return userType;
    }

    public static class Builder {
        public UserTypes userType;

        public ValidationRequestDto build() {
            return new ValidationRequestDto(userType);
        }
    }
}
