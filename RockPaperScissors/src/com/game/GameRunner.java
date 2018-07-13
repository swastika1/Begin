package com.game;

import java.util.Scanner;

import com.game.model.Gesture;

public class GameRunner {
    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("enter either rock paper or scissor");
    	String userInput = scan.next();
    	
        
        
        Gesture userGesture = GestureFactory.createGesture(userInput);
        Gesture computerGesture = GestureFactory.getRandomGesture();
        
        System.out.println("Computer choose: "+computerGesture.getType());
        System.out.println("Game Result ==> "+userGesture.check(computerGesture));
    }
    
}
