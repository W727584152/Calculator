package com.example.wbd.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button bt_square = (Button)findViewById(R.id.bt_square);
        Button bt_L = (Button)findViewById(R.id.bt_L);
        Button bt_R = (Button)findViewById(R.id.bt_R);
        Button bt_zf = (Button)findViewById(R.id.bt_zf);
        Button bt_clean = (Button)findViewById(R.id.bt_clean);
        Button bt_remove = (Button)findViewById(R.id.bt_remove);
        Button bt_percent = (Button)findViewById(R.id.bt_percent);
        Button bt_equal = (Button)findViewById(R.id.bt_equal);

        Button bt_add = (Button)findViewById(R.id.bt_add);
        Button bt_cut = (Button)findViewById(R.id.bt_cut);
        Button bt_multiply = (Button)findViewById(R.id.bt_multiply);
        Button bt_div = (Button)findViewById(R.id.bt_div);
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

        bt_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence now = textView.getText();
                textView.setText(now + "+");
            }
        });
        bt_cut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence now = textView.getText();
                textView.setText(now + "-");
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
        bt_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence now = textView.getText();
                textView.setText(now + "*");
            }
        });
        bt_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence now = textView.getText();
                textView.setText(now + "/");
            }
        });
        bt_L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence now = textView.getText();
                textView.setText(now + "(");
            }
        });
        bt_R.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence now = textView.getText();
                textView.setText(now + ")");
            }
        });
        bt_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence now = textView.getText();
                textView.setText(now + ".");
            }
        });
        bt_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence now = textView.getText();
                String content = now.toString();
                textView2.setText(baseParse(content)+"");
            }
        });
    }
     public double baseParse(String content) {
        content = replaceKuoHao(content);
        int index = content.indexOf("+");
        if (index > -1) {
            return baseParse(content.substring(0, index))
                    + baseParse(content.substring(index + 1, content.length()));
        }
        index = content.lastIndexOf("-");
        if (index > -1) {
            return baseParse(content.substring(0, index))
                    - baseParse(content.substring(index + 1, content.length()));
        }
        index = content.indexOf("*");
        if (index > -1) {
            return baseParse(content.substring(0, index))
                    * baseParse(content.substring(index + 1, content.length()));
        }
        index = content.lastIndexOf("/");
        if (index > -1) {
            return baseParse(content.substring(0, index))
                    / baseParse(content.substring(index + 1, content.length()));
        }
        if ("".equals(content.trim())) {
            return 0;
        } else {
            return Double.parseDouble(content);
        }
    }


    public String replaceKuoHao(String content) {
        try {
            int index_start = content.indexOf("(");
            int index_end = content.indexOf(")", index_start);
            index_start = content.lastIndexOf("(", index_end);
            while (index_start > -1) {
                String tmp = content.substring(index_start, index_end + 1);
                String tmpContent = tmp.substring(1, tmp.length() - 1);
                content = content.replace(tmp, baseParse(tmpContent) + "");
                index_start = content.indexOf("(");
                index_end = content.indexOf(")");
            }
            return content;
        }catch (Exception e){
            System.out.print(e);
            return "null";
        }
    }

}
