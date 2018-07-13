package com.game;

import java.util.Random;

import com.game.exception.InvalidGestureException;
import com.game.model.Gesture;
import com.game.model.GestureType;
import com.game.model.Paper;
import com.game.model.Rock;
import com.game.model.Scissor;

public class GestureFactory {

    public static Gesture createGesture(String gesture) {
        if(gesture.equalsIgnoreCase(GestureType.ROCK.toString()))
            return new Rock();
        else if(gesture.equalsIgnoreCase(GestureType.PAPER.toString()))
            return new Paper();
        else if(gesture.equalsIgnoreCase(GestureType.SCISSOR.toString()))
            return new Scissor();
        
        throw new InvalidGestureException(gesture);
    }
    
    
    public static Gesture getRandomGesture() {
        Random random = new Random(System.currentTimeMillis());
        int randomIndex = random.nextInt(GestureType.values().length);
        GestureType randomGestureType = GestureType.values()[randomIndex];
        return createGesture(randomGestureType.toString());
    }
}
