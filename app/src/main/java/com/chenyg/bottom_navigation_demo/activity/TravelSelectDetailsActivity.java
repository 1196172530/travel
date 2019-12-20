package com.chenyg.bottom_navigation_demo.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.chenyg.bottom_navigation_demo.R;
import com.chenyg.bottom_navigation_demo.TravelSelectViewModel;
import com.chenyg.bottom_navigation_demo.adapter.TravelSelectAdapter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class TravelSelectDetailsActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    TravelSelectAdapter travelSelectAdapter;
    TravelSelectViewModel travelSelectViewModel;
    Button btnComment;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_select_details);

        recyclerView = findViewById(R.id.recycleViewDetails);
        travelSelectAdapter = new TravelSelectAdapter(this);
        travelSelectViewModel = ViewModelProviders.of(this).get(TravelSelectViewModel.class);
        travelSelectAdapter.setTravelMessages(travelSelectViewModel.getTravelMessages().getValue());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(travelSelectAdapter);

        btnComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
