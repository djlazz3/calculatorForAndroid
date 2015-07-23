package com.bpadron.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MyActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public String num1 = "";
    public String num2 = "";
    public String function = "";
    public String answer = "";

    public void textChanger(CharSequence number){
        if (function == "") {
            num1 = num1 + number;
            TextView textview = (TextView) findViewById(R.id.Answer);
            textview.clearComposingText();
            textview.setText(num1);
        } else {
            num2 = num2 + number;
            TextView textview = (TextView) findViewById(R.id.Answer);
            textview.clearComposingText();
            textview.setText(num2);
        }
    }

    public void number1(View view) {
        Button button = (Button) findViewById(R.id.number1);
        textChanger(button.getText());
    }
    public void number2(View view) {
        Button button = (Button)findViewById(R.id.number2);
        textChanger(button.getText());
    }
    public void number3(View view) {
        Button button = (Button)findViewById(R.id.number3);
        textChanger(button.getText());
    }
    public void number4(View view) {
        Button button = (Button)findViewById(R.id.number4);
        textChanger(button.getText());
    }
    public void number5(View view) {
        Button button = (Button)findViewById(R.id.number5);
        textChanger(button.getText());
    }
    public void number6(View view) {
        Button button = (Button)findViewById(R.id.number6);
        textChanger(button.getText());
    }
    public void number7(View view) {
        Button button = (Button)findViewById(R.id.number7);
        textChanger(button.getText());
    }
    public void number8(View view) {
        Button button = (Button)findViewById(R.id.number8);
        textChanger(button.getText());
    }
    public void number9(View view) {
        Button button = (Button) findViewById(R.id.number9);
        textChanger(button.getText());
    }
    public void number0(View view){
            Button button = (Button) findViewById(R.id.number0);
            textChanger(button.getText());
    }
    public void add(View view) {
        function = "add";
        TextView textview = (TextView) findViewById(R.id.Answer);
        textview.clearComposingText();
    }
    public void subtract(View view) {
        function = "subtract";
        TextView textview = (TextView) findViewById(R.id.Answer);
        textview.clearComposingText();
    }
    public void multiply(View view) {
        function = "multiply";
        TextView textview = (TextView) findViewById(R.id.Answer);
        textview.clearComposingText();
    }
    public void divide(View view) {
        function = "divide";
        TextView textview = (TextView) findViewById(R.id.Answer);
        textview.clearComposingText();
    }
    public void clear(View view) {
        TextView textview = (TextView) findViewById(R.id.Answer);
        textview.clearComposingText();
        if (function == "") {
            num1 = "";
        }else
            num2 = "";
    }
    public void equals(View view) {
        if (num1 == "" || num2 == "") {
            TextView textview = (TextView) findViewById(R.id.Answer);
            textview.clearComposingText();
            textview.setText("Error");
        }
        else{
            int int1 = Integer.parseInt(num1);
            int int2 = Integer.parseInt(num2);
            int ans = 0 ;
            if (function == "add"){
                ans = int1 + int2;
            }else if (function == "subtract"){
                ans = int1 - int2;
            }else if (function == "multiply"){
                ans = int1 * int2;
            }else if (function == "divide"){
                if (int2 == 0){
                    TextView textview = (TextView) findViewById(R.id.Answer);
                    textview.clearComposingText();
                    textview.setText("Error");
                }else{
                    ans = int1 / int2;
                }
            }
            answer = Integer.toString(ans);
            TextView textview = (TextView) findViewById(R.id.Answer);
            num1 = answer;
            num2 = "";
            function = "";
            textview.setText(answer);

        }
    }
}
