package com.example.android.explicitintent;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {


// Do steps 6 & 7 in ChildActivity.java
// COMPLETED (6) Create a TextView field to display your message
    private TextView mTextView;
// COMPLETED (7) Get a reference to your TextView in Java


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        mTextView = (TextView) findViewById(R.id.tv_display);
    }

}
