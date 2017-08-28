package com.example.franziska.bavariary;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class FirstPage extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
    }


    Button newEntryButton = (Button) findViewById(R.id.button_new_entry);
    Button oldProjects = (Button) findViewById(R.id.button_old_projects);


    @Override
    public void onClick(View v) {
        newEntryButton.setOnClickListener(this);
        oldProjects.setOnClickListener(this);

        switch (v.getId()) {
            case R.id.button_new_entry:
                goToSecondPage();
                break;
            case R.id.button_old_projects:
                goToAlternativeSecondPage();
                break;
        }
    }

    private void goToSecondPage() {
        Intent secondPageIntent = new Intent(this, SecondPageCreateEntry.class);
        startActivity(secondPageIntent);
    }

    private void goToAlternativeSecondPage() {
        Intent alternativeSecondPageIntent = new Intent(this, AlternativeSecondPage.class);
        startActivity(alternativeSecondPageIntent);
    }
}
