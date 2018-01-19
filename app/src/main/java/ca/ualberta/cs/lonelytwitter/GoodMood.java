package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jackyliu on 2018-01-18.
 */

public class GoodMood extends Mood {

    public GoodMood(String GoodMood){
        super(GoodMood);
    }
    public GoodMood(String GoodMood,Date date){
        super(GoodMood,date);
    }

    @Override
    public  void printMood(){
        System.out.print("I am good");
    }

}
