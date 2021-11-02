package com.example.ph15946_mob201_ass1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<HocTap> list;
    AdapterHocTap adapterHocTap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gridView);
        list = new ArrayList<>();
        list.add(new HocTap(0,"coures"));
        list.add(new HocTap(1,"maps"));
        list.add(new HocTap(2,"news"));
        list.add(new HocTap(3,"social"));
        adapterHocTap = new AdapterHocTap(this,list);
        gridView.setAdapter(adapterHocTap);
    }
}