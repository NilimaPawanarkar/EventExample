package com.example.nilima.eventexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by nilima on 3/9/17.
 */

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.MyViewHolder> {

    private List<Event> eventList;


    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView title,startDate,endDate;


        MyViewHolder(View view){
            super(view);
            title=(TextView) view.findViewById(R.id.tvtitle);
            startDate=(TextView) view.findViewById(R.id.tvstartdate);
            endDate=(TextView) view.findViewById(R.id.tvenddate);

        }

    }


    public EventAdapter(List<Event> eventList){
        this.eventList=eventList;
    }

    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_list, parent, false);

        return new MyViewHolder(itemView);
    }

    public void onBindViewHolder(MyViewHolder holder,int position){
        Event event=eventList.get(position);
        holder.title.setText(event.getTitle());
        holder.startDate.setText(event.getStartDate());
        holder.endDate.setText(event.getEndDate());
    }
    public int getItemCount(){
        return eventList.size();
    }

}

