package com.game.exception;

import java.util.Arrays;

import com.game.model.GestureType;

public class InvalidGestureException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public InvalidGestureException(String gesture) {
        super(gesture+" is invalid input. Supported gestures are: "+Arrays.asList(GestureType.values()));
    }
}
