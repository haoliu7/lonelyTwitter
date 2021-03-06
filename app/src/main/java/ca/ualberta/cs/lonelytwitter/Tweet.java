package ca.ualberta.cs.lonelytwitter;

/**
 * Created by jackyliu on 2018-01-18.
 */

import java.util.ArrayList;
import java.util.Date;

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;
    private ArrayList<Mood> moods;

    public  Tweet(String message){
        this.message = message;
        this.moods = new ArrayList<Mood>();
    }

    public  Tweet(String message, Date date){
        this.message = message;
        this.date = date;
        this.moods = new ArrayList<Mood>();
    }

    public Date getDate(){
        return date;
    }

    public  void setDate(Date date){
        this.date = date;
    }

    public String getMessage(){
        return this.message;
    }

    public  void setMessage(String message) throws  TweetTooLongException{
        if (message.length()>140){
            throw new TweetTooLongException();
        }else {
            this.message = message;
        }
    }
    public  abstract Boolean isImportant();

    public void addmood(Mood mood){
        this.moods.add(mood);
    }
}
