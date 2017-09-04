package com.example.nilima.eventexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private  List<Event> eventList=new ArrayList<>();
    private RecyclerView recyclerView;
    private EventAdapter eventAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        eventAdapter=new EventAdapter(eventList);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(eventAdapter);

        prepareEventData();



    }
    private void prepareEventData(){

        Event event=new Event("Cricket","3-jan-1017","To  5-jan-2017");
        eventList.add(event);

        event=new Event("football","3-jan-1017","To  7-jan-2017");
        eventList.add(event);

        event=new Event("Cricket","3-jan-1017","To  8-jan-2017");
        eventList.add(event);

        event=new Event("Cricket","2-jan-1017","To  5-jan-2017");
        eventList.add(event);

        event=new Event("Cricket","3-jan-1017","To  5-jan-2017");
        eventList.add(event);

        event=new Event("Cricket","3-jan-1017","To  5-jan-2017");
        eventList.add(event);

        event=new Event("Cricket","3-jan-1017","To  5-jan-2017");
        eventList.add(event);

        event=new Event("Cricket","3-jan-1017","To  5-jan-2017");
        eventList.add(event);

        event=new Event("Cricket","3-jan-1017","To  5-jan-2017");
        eventList.add(event);

        event=new Event("Cricket","3-jan-1017","To  5-jan-2017");
        eventList.add(event);

        event=new Event("Cricket","3-jan-1017","To  5-jan-2017");
        eventList.add(event);

        event=new Event("Cricket","3-jan-1017","To  5-jan-2017");
        eventList.add(event);

        event=new Event("Cricket","3-jan-1017","To  5-jan-2017");
        eventList.add(event);

        event=new Event("Cricket","3-jan-1017","To  5-jan-2017");
        eventList.add(event);

        event=new Event("Cricket","3-jan-1017","To  5-jan-2017");
        eventList.add(event);

        event=new Event("Cricket","3-jan-1017","To 5-jan-2017");
        eventList.add(event);

        event=new Event("Cricket","3-jan-1017","To  5-jan-2017");
        eventList.add(event);

        event=new Event("Cricket","3-jan-1017","To  5-jan-2017");
        eventList.add(event);

        eventAdapter.notifyDataSetChanged();
    }
}
