package com.praticandoweb.webservice.services.exceptions;

public class ResourcesNotFoundException extends RuntimeException {

    public ResourcesNotFoundException(Object id) {
        super("Resource not found. id " + id);
    }
}
