package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jackyliu on 2018-01-18.
 */
public abstract class Mood {
    private Date date;

    private String currentMood;

    public Mood(String currentMood){
        this.currentMood =currentMood;
        this.date = new Date();
    }
    public Mood(String currentMood,Date date){
        this.currentMood = currentMood;
        this.date = date;
    }
    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date = date;
    }

    public void setCurrentMood(String currentMood){
        this.currentMood = currentMood;
    }
    public  abstract void printMood();
}
