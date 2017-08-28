package com.example.franziska.bavariary;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FourthPageEditEntry extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_page_edit_entry);
    }

    ImageView camera = (ImageView) findViewById(R.id.cameraView);
    ImageView edit = (ImageView) findViewById(R.id.editView);
    ImageView gallery = (ImageView) findViewById(R.id.galleryView);

    @Override
    public void onClick(View v) {
        camera.setOnClickListener(this);
        edit.setOnClickListener(this);
        gallery.setOnClickListener(this);

        switch (v.getId()){
            case R.id.cameraView:
                openCamera();
                break;
            case R.id.editView:
                openEditor();
                break;
            case R.id.galleryView:
                openGallery();
                break;
        }


    }

    private void openGallery() {

    }

    private void openEditor() {

    }

    private void openCamera() {

    }
}
