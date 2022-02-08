package br.com.dev.hrworker.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Object id){
        super("RESOURCE NOT FOUND ID " + id);
    }
}