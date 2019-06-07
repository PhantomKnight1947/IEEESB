package com.example.ieee_sb.EWFragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ieee_sb.Event;
import com.example.ieee_sb.R;

import java.util.ArrayList;

public class WorkshopFragment extends Fragment {

    public ArrayList<Event> events;
    public View view;
    public RecyclerView recyclerView;
    public RecyclerView.LayoutManager layoutManager;
    public RecyclerView.Adapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.activity_workshops, container, false);
        recyclerView = view.findViewById(R.id.workshop_recycler);
        events = new ArrayList<>();
        events.add(new Event("Techquilla",new ArrayList<String>(),"Description Here",1,"FEB",2019,"3:30 PM"));
        events.add(new Event("Wit Wars 2.0",new ArrayList<String>(),"Description Here",5,"MAY",2020,"4:15 PM"));

        layoutManager = new LinearLayoutManager(getActivity());
        adapter = new EWAdapter(events);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
