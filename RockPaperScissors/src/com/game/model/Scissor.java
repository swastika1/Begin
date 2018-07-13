package com.game.model;

public class Scissor implements Gesture {

    @Override
    public GameResult check(Gesture input) {
        if(input.getType() == GestureType.PAPER)
            return GameResult.WIN;
        else if(input.getType() == GestureType.ROCK) 
            return GameResult.LOSE;
        
        return GameResult.DRAW;
    }

    @Override
    public GestureType getType() {
        return GestureType.SCISSOR;
    }

}
