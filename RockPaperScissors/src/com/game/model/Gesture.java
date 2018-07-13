package com.game.model;

public interface Gesture {
    public GameResult check(Gesture input);
    public GestureType getType();
}
