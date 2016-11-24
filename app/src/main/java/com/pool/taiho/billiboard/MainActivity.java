package com.pool.taiho.billiboard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import com.pool.taiho.billiboard.layout.ChooseTypeActivity;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resInit();
    }

    public void resInit() {
        videoView = (VideoView)findViewById(R.id.videoView);
        final MediaController mediaController = new MediaController(this);
        Uri video = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.wildlife);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(video);
        videoView.requestFocus();
        videoView.setOnTouchListener(this);
        videoView.start();
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Intent intent = new Intent(getApplicationContext(), ChooseTypeActivity.class);
        startActivity(intent);
        return false;
    }
}
