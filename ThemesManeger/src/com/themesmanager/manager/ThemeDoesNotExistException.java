package com.themesmanager.manager;

/**
 *
 * @author emman
 */
public class ThemeDoesNotExistException extends RuntimeException {

    public ThemeDoesNotExistException(String message) {
        super(message);
    }

}
