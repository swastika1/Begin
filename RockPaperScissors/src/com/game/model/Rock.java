package com.game.model;

public class Rock implements Gesture {

    @Override
    public GameResult check(Gesture input) {
        if(input.getType() == GestureType.SCISSOR)
            return GameResult.WIN;
        else if(input.getType() == GestureType.PAPER) 
            return GameResult.LOSE;
        
        return GameResult.DRAW;
    }

    @Override
    public GestureType getType() {
        return GestureType.ROCK;
    }

    
}
