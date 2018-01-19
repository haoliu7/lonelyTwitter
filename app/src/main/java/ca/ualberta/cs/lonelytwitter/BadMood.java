package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jackyliu on 2018-01-18.
 */

public class BadMood extends Mood {

    public BadMood(String BadMood){
        super(BadMood);
    }
    public BadMood(String BadMood,Date date){
        super(BadMood,date);
    }

    @Override
    public  void printMood(){
        System.out.print("I am Bad");
    }

}
