package com.example.calculatorfullapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_sum,btn_sub,btn_mul,btn_div,btn_c,btn_equal;
     TextView display;
     double firstnum,secondnum,result;
     String op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_0=(Button) findViewById(R.id.btn_0);
        btn_1=(Button) findViewById(R.id.btn_1);
        btn_2=(Button) findViewById(R.id.btn_2);
        btn_3=(Button) findViewById(R.id.btn_3);
        btn_4=(Button) findViewById(R.id.btn_4);
        btn_5=(Button) findViewById(R.id.btn_5);
        btn_6=(Button) findViewById(R.id.btn_6);
        btn_7=(Button) findViewById(R.id.btn_7);
        btn_8=(Button) findViewById(R.id.btn_8);
        btn_9=(Button) findViewById(R.id.btn_9);
        btn_sum=(Button) findViewById(R.id.btn_sum);
        btn_sub=(Button) findViewById(R.id.btn_sub);
        btn_mul=(Button) findViewById(R.id.btn_mul);
        btn_div=(Button) findViewById(R.id.btn_div);
        btn_c=(Button) findViewById(R.id.btn_c);
        btn_equal=(Button) findViewById(R.id.btn_equal);
        display=(TextView) findViewById(R.id.display);

    }
    public void method_0(View view)
    {
        String input=display.getText()+"0";
        display.setText(input);
    }
    public void method_1(View view)
    {
        String input=display.getText()+"1";
        display.setText(input);
    }
    public void method_2(View view)
    {
        String input=display.getText()+"2";
        display.setText(input);
    }
    public void method_3(View view)
    {
        String input=display.getText()+"3";
        display.setText(input);
    }
    public void method_4(View view)
    {
        String input=display.getText()+"4";
    }
    public void method_5(View view)
    {
        String input=display.getText()+"5";
        display.setText(input);
    }
    public void method_6(View view)
    {
        String input=display.getText()+"6";
        display.setText(input);
    }
    public void method_7(View view)
    {
        String input=display.getText()+"7";
        display.setText(input);
    }
    public void method_8(View view)
    {
        String input=display.getText()+"8";
        display.setText(input);
    }
    public void method_9(View view)
    {
        String input=display.getText()+"9";
        display.setText(input);
    }
    public void method_sum(View view)
    {
           firstnum=Double.parseDouble(display.getText().toString());
          display.setText("");
           op="+";
    }
    public void method_sub(View view)
    {
        firstnum=Double.parseDouble(display.getText().toString());
        display.setText("");
        op="-";
    }
    public void method_mul(View view)
    {
        firstnum=Double.parseDouble(display.getText().toString());
        display.setText("");
            op="*";
    }
    public void method_div(View view)
    {
       firstnum=Double.parseDouble(display.getText().toString());
        display.setText("");
        op="/";
    }
    public void method_c(View view)
    {
        int lenght= display.getText().length();
        int number=display.getText().length() -1;
        String store;
        if(lenght>0)
        {
            StringBuilder back= new StringBuilder(display.getText());
            back.deleteCharAt(number);
            store=back.toString();
            display.setText(store);
        }
    }
    public void method_equal(View view)
    {
     String ans;
     secondnum=Double.parseDouble(display.getText().toString());
     switch (op)
     {
         case "+":
             result=firstnum+secondnum;
             ans=String.format("%.0f",result);
             display.setText(ans);
             break;
         case "-":
             result=firstnum-secondnum;
             ans=String.format("%.0f",result);
             display.setText(ans);
             break;
         case "*":
             result=firstnum*secondnum;
             ans=String.format("%.0f",result);
             display.setText(ans);
             break;
         case "/":
             result=firstnum/secondnum;
             ans=String.format("%.0f",result);
             display.setText(ans);
             break;


     }
    }
}
