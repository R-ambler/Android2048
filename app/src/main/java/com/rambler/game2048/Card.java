package com.rambler.game2048;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by Rambler on 2016/7/1.
 */
public class Card extends FrameLayout{

    private TextView label;
    private int num=0;
    public Card(Context context) {
        super(context);
        //设置卡片样式
        label = new TextView(getContext());
        label.setTextSize(32);
        label.setBackgroundColor(0x33FF8800);
        label.setGravity(Gravity.CENTER);
//        label.setText("2");

        //布局参数
        LayoutParams lp = new LayoutParams(-1,-1);
        lp.setMargins(10,10,0,0);
        addView(label,lp);
        //卡片清零
//        setNum(0);
    }
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num=num;
        if(num==0){
            label.setText("");
        }else {
            label.setText(num + "");
        }
    }
}
