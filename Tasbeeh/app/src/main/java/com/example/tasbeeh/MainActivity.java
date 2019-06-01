package com.example.tasbeeh;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int n=0;
    /**
     * This method is called when the order button is clicked.
     */
    public void addOne(View view) {

        display(++n);

    }
    public void subtractOne(View view) {
        display(--n);

    }
    public void getTotal(View view) {
        String x = "\nAlhamdulilah !  I have done it " + n + " times";
        displayMessage(x) ;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.total_text_view);
        priceTextView.setText("" + number);
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.total_text_view);
        priceTextView.setText(message);
    }
}