package Wrapper;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahal
 */
public class Hangman {

   static String[] hiddentexts = {"baddog","eggbun","laptop"};
    
    public static String generateHiddenText(){
        
        
        int randomindex = new Random().nextInt(hiddentexts.length);
        
        return hiddentexts[randomindex];
        
    }
    
}
