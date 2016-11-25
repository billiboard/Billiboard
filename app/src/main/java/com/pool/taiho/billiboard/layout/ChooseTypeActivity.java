package com.pool.taiho.billiboard.layout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pool.taiho.billiboard.R;

/**
 * Created by Taiho on 2016-11-24.
 */

public class ChooseTypeActivity extends Activity implements Button.OnClickListener{

    private Button scoreBtn;
    private Button boardBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosetype);
        resInit();
    }

    public void resInit() {
        scoreBtn = (Button)findViewById(R.id.scoreBtn);
        boardBtn = (Button)findViewById(R.id.boardBtn);

    }


    @Override
    public void onClick(View v) {

    }
}
