package br.com.dev.hruser.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Object id){
        super("RESOURCE NOT FOUND ID " + id);
    }
}