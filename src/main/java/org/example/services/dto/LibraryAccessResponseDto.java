package org.example.services.dto;

public class LibraryAccessResponseDto{
    public int transactionId;
    public String message;
    public boolean success;

    public LibraryAccessResponseDto(int transactionId, String message, boolean success){
        this.transactionId = transactionId;
        this.message = message;
        this.success = success;
    }

    public int getTransactionId(){
        return transactionId;
    }

    public String getMessage(){
        return message;
    }

    public boolean getSuccess(){
        return success;
    }

    public static class Builder{
        public int transactionId;
        public String message;
        public boolean success;

        public LibraryAccessResponseDto build(){
            return new LibraryAccessResponseDto(transactionId, message, success);
        }
    }
}