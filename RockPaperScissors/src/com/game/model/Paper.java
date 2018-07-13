package com.game.model;

public class Paper implements Gesture {

    @Override
    public GameResult check(Gesture input) {
        if(input.getType() == GestureType.ROCK)
            return GameResult.WIN;
        else if(input.getType() == GestureType.SCISSOR) 
            return GameResult.LOSE;
        
        return GameResult.DRAW;
    }

    @Override
    public GestureType getType() {
        return GestureType.PAPER;
    }

}
