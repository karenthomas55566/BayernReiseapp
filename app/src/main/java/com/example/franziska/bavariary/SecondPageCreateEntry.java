package com.example.franziska.bavariary;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondPageCreateEntry extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page_create_entry);
    }

    Button go_button = (Button) findViewById(R.id.go_button);
    Button back_button = (Button) findViewById(R.id.action_back);
    TextView projectTitle = (TextView) findViewById(R.id.project_title);
    EditText projectDate = (EditText) findViewById(R.id.date);

    @Override
    public void onClick(View v) {
        go_button.setOnClickListener(this);
        back_button.setOnClickListener(this);
        projectTitle.setOnClickListener(this);
        projectDate.setOnClickListener(this);
        switch (v.getId()){
            case R.id.go_button:
                Intent goIntent = new Intent(this, ThirdPagePin.class);
                startActivity(goIntent);
                break;
            case R.id.action_back:
                Intent backIntent = new Intent(this, FirstPage.class);
                startActivity(backIntent);
                break;
            case R.id.project_title:
                enterTitle();
                break;
            case R.id.date:
                enterDate();
                break;
        }
    }

    private void enterDate() {

    }

    private void enterTitle() {

    }
}


