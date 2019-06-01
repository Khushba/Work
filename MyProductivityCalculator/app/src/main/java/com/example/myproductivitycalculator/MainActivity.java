package com.example.myproductivitycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int totalPro = 0; int totalHC=0;
    String done = "Woohoo! Productivity Acheived!";
    String notDone = " ";

    public void addOne(View view) {
        totalPro = totalPro + 1;
        display1(totalPro);
        if (totalPro == 10) {
            message1(done);
        }
    }
    public void addTwo(View view) {
        totalPro = totalPro + 2;
        display1(totalPro);
        if (totalPro == 10) {
            message1(done);
        }
    }
    public void addThree(View view) {
        totalPro = totalPro + 3;
        display1(totalPro);
        if (totalPro == 10) {
            message1(done);
        }
    }
    public void addFour(View view) {
        totalPro = totalPro + 4;
        display1(totalPro);
        if (totalPro == 10) {
            message1(done);
        }
    }
    public void newTotal(View view) {
        totalPro = 0; totalHC=0;
        display1(totalPro);
        display2(totalHC);
        if (totalPro == 0 && totalHC==0) {
            message1(notDone);
        }
    }
    public void addOne2(View view) {
        totalHC = totalHC + 1;
        display2(totalHC);
        if (totalHC == 10) {
            message2(done);
        }
    }
    public void addTwo2(View view) {
        totalHC = totalHC + 2;
        display2(totalHC);
        if (totalHC == 10) {
            message2(done);
        }
    }
    public void addThree2(View view) {
        totalHC = totalHC + 3;
        display2(totalHC);
        if (totalHC == 10) {
            message2(done);
        }
    }
    public void addFour2(View view) {
        totalHC = totalHC + 4;
        display2(totalHC);
        if (totalHC == 10) {
            message2(done);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Displays the given score for Team A.
     */
    public void display1(int t) {
        TextView tView = (TextView) findViewById(R.id.total_product1);
        tView.setText(String.valueOf(t));
    }

    public void message1(String d) {
        TextView dView = (TextView) findViewById(R.id.total_done1);
        dView.setText(String.valueOf(d));
    }

    public void display2(int t) {
        TextView tView = (TextView) findViewById(R.id.total_product2);
        tView.setText(String.valueOf(t));
    }

    public void message2(String d) {
        TextView dView = (TextView) findViewById(R.id.total_done2);
        dView.setText(String.valueOf(d));
    }
}

