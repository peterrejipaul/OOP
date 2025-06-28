package pl_java.exercise_1;

public class CustomTime{

    int hour;   // current hour in military time
    int minute; // current minute in military time
    int second; // current second in military time

    // constructor to initialize the time to 00:00:00
    CustomTime(){
        hour = 0;
        minute = 0;
        second = 0;
    }
    // return the time to the calling method in a three-membered array
    int[] getTime(){
        return new int[] {hour, minute, second};
    }

    // increment the current time by one second  
    void incrementTime(){
        ++second;
    }
}
