package org.example.services.dto;

import org.example.utils.Actions;
import org.example.utils.UserTypes;

public class LibraryAccessRequestDto {
    UserTypes userType;
    String userId;
    Actions action;

    public LibraryAccessRequestDto(UserTypes userType, String userId, Actions action) {
        this.userType = userType;
        this.userId = userId;
        this.action = action;
    }

    public UserTypes getUserType() {
        return userType;
    }

    public String getUserId() {
        return userId;
    }

    public Actions getAction() {
        return action;
    }

    public static class Builder {
        public UserTypes userType;
        public String userId;
        public Actions action;

        public LibraryAccessRequestDto build() {
            return new LibraryAccessRequestDto(userType, userId, action);
        }
    }
}