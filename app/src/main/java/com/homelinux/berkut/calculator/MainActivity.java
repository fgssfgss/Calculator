package com.homelinux.berkut.calculator;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import static android.view.View.*;

//import android.content.Context;
//import android.support.v7.app.ActionBarActivity;
//import javax.script.*;
//import org.mozilla.javascript.;

public class MainActivity extends Activity {


    EditText textViewIn;
    EditText textViewOut;

//    @Override
//    public View findViewById(int id) {
//        return super.findViewById(id);
//    }


    @TargetApi(Build.VERSION_CODES.CUPCAKE)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        setContentView(R.layout.activity_main);


//        textViewIn =  findViewById(R.id.editText);
        textViewIn = (EditText) findViewById(R.id.editText);
        textViewOut = (EditText) findViewById(R.id.editText2);
//        textViewIn.setInputType(InputType.TYPE_NULL);
//        textViewOut.setInputType(InputType.TYPE_NULL);

        final OnClickListener lbtn24 = new OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.calculate();
                textViewIn.setText(String.valueOf(textViewOut.getText()));

            }
        };
        OnClickListener lbtn1 = new OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewIn.append("1");
                MainActivity.this.calculate();
            }
        };
        OnClickListener lbtn2 = new OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewIn.append("2");
                MainActivity.this.calculate();
            }
        };
        OnClickListener lbtn3 = new OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewIn.append("3");
                MainActivity.this.calculate();
            }
        };
        OnClickListener lbtn4 = new OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewIn.append("4");
                MainActivity.this.calculate();
            }
        };
        OnClickListener lbtn5 = new OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewIn.append("5");
                MainActivity.this.calculate();
            }
        };
        OnClickListener lbtn6 = new OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewIn.append("6");
                MainActivity.this.calculate();
            }
        };
        OnClickListener lbtn7 = new OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewIn.append("7");
                MainActivity.this.calculate();
            }
        };
        OnClickListener lbtn8 = new OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewIn.append("8");
                MainActivity.this.calculate();
            }
        };
        OnClickListener lbtn9 = new OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewIn.append("9");
                MainActivity.this.calculate();
            }
        };
        OnClickListener lbtn0 = new OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewIn.append("0");
                MainActivity.this.calculate();
            }
        };
        OnClickListener lbtnumn = new OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewIn.append("*");
                MainActivity.this.calculate();
            }
        };
        OnClickListener lbtnminus = new OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewIn.append("-");
                MainActivity.this.calculate();
            }
        };
        OnClickListener lbtn23 = new OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewIn.append("+");
            }
        };
        OnClickListener lbtnd = new OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewIn.append("/");
            }
        };
        OnClickListener lbtndel = new OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(textViewIn.getText());
                if (!text.equals("")) {
                    String substring = text.substring(0, text.length() - 1);
                    textViewIn.setText(substring);
                }
                MainActivity.this.calculate();
            }
        };
        Button btn24 = (Button) findViewById(R.id.button24);
        btn24.setOnClickListener(lbtn24);
        Button btn0 = (Button) findViewById(R.id.button20);
        btn0.setOnClickListener(lbtn0);
        Button btn23 = (Button) findViewById(R.id.button23);
        btn23.setOnClickListener(lbtn23);
        Button btn1 = (Button) findViewById(R.id.button15);
        btn1.setOnClickListener(lbtn1);
        Button btn2 = (Button) findViewById(R.id.button16);
        btn2.setOnClickListener(lbtn2);
        Button btn3 = (Button) findViewById(R.id.button17);
        btn3.setOnClickListener(lbtn3);
        Button btn4 = (Button) findViewById(R.id.button10);
        btn4.setOnClickListener(lbtn4);
        Button btn5 = (Button) findViewById(R.id.button11);
        btn5.setOnClickListener(lbtn5);
        Button btn6 = (Button) findViewById(R.id.button12);
        btn6.setOnClickListener(lbtn6);
        Button btn7 = (Button) findViewById(R.id.button5);
        btn7.setOnClickListener(lbtn7);
        Button btn8 = (Button) findViewById(R.id.button6);
        btn8.setOnClickListener(lbtn8);
        Button btn9 = (Button) findViewById(R.id.button7);
        btn9.setOnClickListener(lbtn9);
        Button btnd = (Button) findViewById(R.id.button8);
        btnd.setOnClickListener(lbtnd);
        Button btndel = (Button) findViewById(R.id.button4);
        btndel.setOnClickListener(lbtndel);
        Button btnumn = (Button) findViewById(R.id.buttonumn);
        btnumn.setOnClickListener(lbtnumn);
        Button btnminus = (Button) findViewById(R.id.buttonminus);
        btnminus.setOnClickListener(lbtnminus);
    }

    private void calculate() {
//        ScriptEngine engine = manager.getEngineByName("JavaScript");
//        javax.script.ScriptEngine
        String s = String.valueOf(textViewIn.getText());
        MathEvaluator me = new MathEvaluator(s);
//        double res = ;
        textViewOut.setText(me.getValue());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
