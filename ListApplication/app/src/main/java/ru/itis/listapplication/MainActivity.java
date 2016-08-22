package ru.itis.listapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Lesson> lessons = fillLessons();

        rv = (RecyclerView) findViewById(R.id.recycler_view);
        rv.setLayoutManager(new LinearLayoutManager(rv.getContext()));
        LessonAdapter adapter = new LessonAdapter(lessons);
        rv.setAdapter(adapter);
    }

    private ArrayList<Lesson> fillLessons(){
        ArrayList<Lesson> lessons = new ArrayList<Lesson>();
        for (int i = 1; i <= 10; i++) {
            Lesson lesson = new Lesson(
                    "lesson " + i,
                    "time " + i,
                    "room " + (i + 100)/4
            );
            lessons.add(lesson);
        }
        return lessons;
    }
}
