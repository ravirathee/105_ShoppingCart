package com.ravirathee.a105_shoppingcart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    CheckBox ch1,ch2,ch3,ch4;
    Button b1;
    int w=0,x=0,y=0,z=0;
    int total = 0;
    TextView bill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ch1=(CheckBox)findViewById(R.id.checkBox1);
        ch2=(CheckBox)findViewById(R.id.checkBox2);
        ch3=(CheckBox)findViewById(R.id.checkBox3);
        ch4=(CheckBox)findViewById(R.id.checkBox4);

        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(this);

        bill = findViewById(R.id.bill);

    }

    @Override
    public void onClick(View v) {

        if( ch1.isChecked()){
             w=10;
        }else{
            w=0;
        }

        if(ch2.isChecked()){
             x=20;
        }else{
            x=0;
        }

        if(ch3.isChecked()){
            y=30;
        }else{
            y=0;
        }

        if(ch4.isChecked()){
            z=40;
        }else{
            z=0;
        }

        total = w+x+y+z;

        bill.setText(Integer.toString(total));

    }
}
