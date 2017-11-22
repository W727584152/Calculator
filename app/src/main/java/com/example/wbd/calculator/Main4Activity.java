package com.example.wbd.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button bt_sin = (Button)findViewById(R.id.bt_sin);
        Button bt_cos = (Button)findViewById(R.id.bt_cos);
        Button bt_tan = (Button)findViewById(R.id.bt_tan);
        Button bt_cot = (Button)findViewById(R.id.bt_cot);
        Button bt_zf = (Button)findViewById(R.id.bt_zf);
        Button bt_clean = (Button)findViewById(R.id.bt_clean);

        Button bt_point = (Button)findViewById(R.id.bt_point);
        Button bt_0 = (Button)findViewById(R.id.bt_0);
        Button bt_1 = (Button)findViewById(R.id.bt_1);
        Button bt_2 = (Button)findViewById(R.id.bt_2);
        Button bt_3 = (Button)findViewById(R.id.bt_3);
        Button bt_4 = (Button)findViewById(R.id.bt_4);
        Button bt_5 = (Button)findViewById(R.id.bt_5);
        Button bt_6 = (Button)findViewById(R.id.bt_6);
        Button bt_7 = (Button)findViewById(R.id.bt_7);
        Button bt_8 = (Button)findViewById(R.id.bt_8);
        Button bt_9 = (Button)findViewById(R.id.bt_9);

        final TextView textView = (TextView)findViewById(R.id.Input);
        final TextView textView2 = (TextView)findViewById(R.id.Output);

        bt_clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                textView2.setText("");
            }
        });

        bt_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence now = textView.getText();
                textView.setText(now + "0");
            }
        });
        bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence now = textView.getText();
                textView.setText(now + "1");
            }
        });
        bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence now = textView.getText();
                textView.setText(now + "2");
            }
        });
        bt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence now = textView.getText();
                textView.setText(now + "3");
            }
        });
        bt_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence now = textView.getText();
                textView.setText(now + "4");
            }
        });
        bt_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence now = textView.getText();
                textView.setText(now + "5");
            }
        });
        bt_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence now = textView.getText();
                textView.setText(now + "6");
            }
        });
        bt_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence now = textView.getText();
                textView.setText(now + "7");
            }
        });
        bt_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence now = textView.getText();
                textView.setText(now + "8");
            }
        });
        bt_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence now = textView.getText();
                textView.setText(now + "9");
            }
        });

        bt_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence now = textView.getText();
                textView.setText(now + ".");
            }
        });

        bt_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp = textView.getText().toString();
                try {
                    Double d_tmp = Double.parseDouble(tmp);
                    textView2.setText("" + Math.sin(d_tmp*Math.PI/180));
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        bt_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp = textView.getText().toString();
                try {
                    Double d_tmp = Double.parseDouble(tmp);
                    textView2.setText("" + Math.cos(d_tmp*Math.PI/180));
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        bt_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp = textView.getText().toString();
                try {
                    Double d_tmp = Double.parseDouble(tmp);
                    textView2.setText("" + Math.tan(d_tmp*Math.PI/180));
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        bt_cot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp = textView.getText().toString();
                try {
                    Double d_tmp = Double.parseDouble(tmp);
                    textView2.setText("" + 1/(Math.tan(d_tmp*Math.PI/180)));
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}
