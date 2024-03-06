package com.example.sixteenpersonalties;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mrecyclerView;
    ArrayList<PersonalityModel> data = new ArrayList<>();
    int[] catImages = {R.drawable.personality_1,
            R.drawable.personality_2,
            R.drawable.personality_3,
            R.drawable.personality_4,
            R.drawable.personality_5,
            R.drawable.personality_6,
            R.drawable.personality_7,
            R.drawable.personality_8,
            R.drawable.personality_9,
            R.drawable.personality_10,
            R.drawable.personality_11,
            R.drawable.personality_12,
            R.drawable.personality_13,
            R.drawable.personality_14,
            R.drawable.personality_15,
            R.drawable.personality_16
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mrecyclerView=findViewById(R.id.recyclerview);
        String [] catFacts = {getText(R.string.fact_1).toString(), getText(R.string.fact_2).toString(),
                getText(R.string.fact_3).toString(), getText(R.string.fact_4).toString(),
                getText(R.string.fact_5).toString(), getText(R.string.fact_6).toString(),
                getText(R.string.fact_7).toString(),getText(R.string.fact_8).toString(),
                getText(R.string.fact_9).toString(),getText(R.string.fact_10).toString(),
                getText(R.string.fact_11).toString(),getText(R.string.fact_12).toString(),
                getText(R.string.fact_13).toString(), getText(R.string.fact_14).toString(),
                getText(R.string.fact_15).toString(), getText(R.string.fact_16).toString()};
        for(int i=0; i<catImages.length; i++) {
            data.add(new PersonalityModel(catImages[i], catFacts[i]));
        }

        AdapterClass adapter = new AdapterClass(data);
        mrecyclerView.setAdapter(adapter);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
    }
}