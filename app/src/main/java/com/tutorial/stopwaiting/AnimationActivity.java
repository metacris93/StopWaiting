package com.tutorial.stopwaiting;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnimationActivity extends Activity {
    private TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        title = (TextView)findViewById(R.id.txt_title);
        Typeface type = Typeface.createFromAsset(getAssets(),"on_blow.ttf");
        title.setTypeface(type);
    }
}
