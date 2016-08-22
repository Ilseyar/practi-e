package ru.itis.listapplication;

public class Lesson {

    private String mName;
    private String mTime;
    private String mRoom;

    public Lesson(String name, String time, String room) {
        mName = name;
        mTime = time;
        mRoom = room;
    }

    public String getName() {
        return mName;
    }

    public String getTime() {
        return mTime;
    }

    public String getRoom() {
        return mRoom;
    }
}
