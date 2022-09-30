package pl_java.exercise_1;

public class CustomTime{

    final int MAX_HOURS = 23;
	final int MAX_MINS = 59;
	final int MAX_SECS = 59;

    int hour;   
    int minute; 
    int second; 

    void setTime(int newHour, int newMinute, int newSecond){
        hour = newHour;
		minute = newMinute;
		second = newSecond;
    }

    int[] getTime(){
        return new int[] {hour, minute, second};
    }

    void incrementTime(){
        ++second;
    }
}