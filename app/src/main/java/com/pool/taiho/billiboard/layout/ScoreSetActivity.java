package com.pool.taiho.billiboard.layout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.pool.taiho.billiboard.R;

/**
 * Created by Taiho on 2016-11-24.
 */

public class ScoreSetActivity extends Activity {

    Button ballChBtn;
    Button positionChBtn;
    EditText firstName;
    EditText secondName;
    EditText firstScore;
    EditText secondScore;
    LinearLayout firstLayout;
    LinearLayout secondLayout;
    boolean color = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoreset);

        resInit();
    }

    public void resInit(){
        firstName = (EditText)findViewById(R.id.textView);
        secondName = (EditText)findViewById(R.id.textView2);

        ballChBtn = (Button)findViewById(R.id.ballChBtn);
        positionChBtn = (Button)findViewById(R.id.positionChBtn);

        firstLayout = (LinearLayout)findViewById(R.id.firstLayout);
        secondLayout = (LinearLayout)findViewById(R.id.secondLayout);

        ballChBtn.setOnClickListener(mClickListener);
        positionChBtn.setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.ballChBtn :
                    if(color) {
                        firstLayout.setBackgroundResource(R.color.secondPlayer);
                        secondLayout.setBackgroundResource(R.color.firstPlayer);
                        color = false;
                    } else {
                        firstLayout.setBackgroundResource(R.color.firstPlayer);
                        secondLayout.setBackgroundResource(R.color.secondPlayer);
                        color = true;
                    }

            }
        }
    };
}
