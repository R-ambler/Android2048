package com.rambler.game2048;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView tvScore;
    private int score=0;
    private static MainActivity mainActivity=null;
    public static MainActivity getMainActivity() {
        return mainActivity;
    }
    public MainActivity(){
        mainActivity=this;
    }
    public void clearScore(){
        score=0;
        showScore();
    }
    public void showScore(){
        tvScore.setText(score+"");
    }
    public void addScore(int s){
        score+=s;
        showScore();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //找到计分板
        tvScore= (TextView) findViewById(R.id.score);
    }

}
