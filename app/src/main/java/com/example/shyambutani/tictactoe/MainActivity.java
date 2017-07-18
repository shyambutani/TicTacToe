package com.example.shyambutani.tictactoe;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,strt;
    RadioGroup rg;
    RadioButton rb,ro,rx;
    int hastext1=0,hastext2=0,hastext3=0,hastext4=0,hastext5=0,hastext6=0,hastext7=0,hastext8=0,hastext9=0;
    int temp=0;
    int tempradio;
    int turn;
    int cnt=0;
    int firstclick=1;
    String result;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        strt = (Button) findViewById(R.id.start);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        rg = (RadioGroup) findViewById(R.id.radioGroup);
        ro = (RadioButton) findViewById(R.id.radioo);
        rx = (RadioButton) findViewById(R.id.radiox);

        strt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Log.e("inside onclick","hi");
                int rbid = rg.getCheckedRadioButtonId();
                rb = (RadioButton)findViewById(rbid);
                ro.setEnabled(false);
                rx.setEnabled(false);
                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                btn8.setEnabled(true);
                btn9.setEnabled(true);
                strt.setEnabled(false);
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                firstclick=1;
                cnt=0;
                hastext1=0;hastext2=0;hastext3=0;hastext4=0;hastext5=0;hastext6=0;hastext7=0;hastext8=0;hastext9=0;
                temp=1;

                if(rg.getCheckedRadioButtonId()==R.id.radiox)
                {
                    tempradio=1;
                    turn=1;
                }
                else
                {
                    tempradio=0;
                    turn=0;
                }
            }
        }
        );

        btn1.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(temp==1)
                    {
                        if(hastext1==0)
                        {
                            hastext1=1;
                            if (firstclick == 1)
                            {
                                firstclick = 0;
                                cnt++;
                                if (tempradio == 1)
                                {
                                    btn1.setText("x");
                                    turn = 0;
                                }
                                else
                                {
                                    btn1.setText("o");
                                    turn = 1;
                                }
                            }
                            else
                            {
                                cnt++;
                                if (turn == 0)
                                {
                                    btn1.setText("o");
                                    if ((btn1.getText() == btn2.getText() && btn1.getText() == btn3.getText()) || (btn1.getText() == btn4.getText() && btn1.getText() == btn7.getText()) || (btn1.getText() == btn5.getText() && btn1.getText() == btn9.getText()))
                                    {
                                        result = "O wins!";
                                        Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                        btn1.setEnabled(false);
                                        btn2.setEnabled(false);
                                        btn3.setEnabled(false);
                                        btn4.setEnabled(false);
                                        btn5.setEnabled(false);
                                        btn6.setEnabled(false);
                                        btn7.setEnabled(false);
                                        btn8.setEnabled(false);
                                        btn9.setEnabled(false);
                                        strt.setEnabled(true);
                                        temp = 0;
                                        ro.setEnabled(true);
                                        rx.setEnabled(true);
                                    }
                                    turn = 1;
                                }
                                else
                                {
                                    btn1.setText("x");
                                    if ((btn1.getText() == btn2.getText() && btn1.getText() == btn3.getText()) || (btn1.getText() == btn4.getText() && btn1.getText() == btn7.getText()) || (btn1.getText() == btn5.getText() && btn1.getText() == btn9.getText()))
                                    {
                                        result = "X wins!";
                                        Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                        btn1.setEnabled(false);
                                        btn2.setEnabled(false);
                                        btn3.setEnabled(false);
                                        btn4.setEnabled(false);
                                        btn5.setEnabled(false);
                                        btn6.setEnabled(false);
                                        btn7.setEnabled(false);
                                        btn8.setEnabled(false);
                                        btn9.setEnabled(false);
                                        strt.setEnabled(true);
                                        temp = 0;
                                        ro.setEnabled(true);
                                        rx.setEnabled(true);
                                    }
                                    turn = 0;
                                }
                                if(cnt==9)
                                {
                                    result = "Draw!";
                                    Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                    btn1.setEnabled(false);
                                    btn2.setEnabled(false);
                                    btn3.setEnabled(false);
                                    btn4.setEnabled(false);
                                    btn5.setEnabled(false);
                                    btn6.setEnabled(false);
                                    btn7.setEnabled(false);
                                    btn8.setEnabled(false);
                                    btn9.setEnabled(false);
                                    strt.setEnabled(true);
                                    temp = 0;
                                    ro.setEnabled(true);
                                    rx.setEnabled(true);
                                }
                            }
                        }
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Click Start Button First!",Toast.LENGTH_LONG).show();
                    }
                }
            });

            btn2.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(temp==1)
                    {
                        if(hastext2==0)
                        {
                            hastext2=1;
                            if(firstclick == 1)
                            {
                                firstclick = 0;
                                cnt++;
                                if (tempradio == 1)
                                {
                                    btn2.setText("x");
                                    Log.i("lfjfn", "text print x,158");
                                    turn = 0;
                                }
                                else
                                {
                                    btn2.setText("o");
                                    Log.i("lfjfn", "text print  o,164");
                                    turn = 1;
                                }
                            }
                            else
                            {
                                cnt++;
                                if (turn == 0)
                                {
                                    btn2.setText("o");
                                    if ((btn2.getText() == btn1.getText() && btn2.getText() == btn3.getText()) || (btn2.getText() == btn5.getText() && btn2.getText() == btn8.getText()))
                                    {
                                        result = "O wins!";
                                        Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                        btn1.setEnabled(false);
                                        btn2.setEnabled(false);
                                        btn3.setEnabled(false);
                                        btn4.setEnabled(false);
                                        btn5.setEnabled(false);
                                        btn6.setEnabled(false);
                                        btn7.setEnabled(false);
                                        btn8.setEnabled(false);
                                        btn9.setEnabled(false);
                                        strt.setEnabled(true);
                                        temp = 0;
                                        ro.setEnabled(true);
                                        rx.setEnabled(true);
                                    }
                                    turn = 1;
                                }
                                else
                                {
                                    btn2.setText("x");
                                    if ((btn2.getText() == btn1.getText() && btn2.getText() == btn3.getText()) || (btn2.getText() == btn5.getText() && btn2.getText() == btn8.getText()))
                                    {
                                        result = "X wins!";
                                        Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                        btn1.setEnabled(false);
                                        btn2.setEnabled(false);
                                        btn3.setEnabled(false);
                                        btn4.setEnabled(false);
                                        btn5.setEnabled(false);
                                        btn6.setEnabled(false);
                                        btn7.setEnabled(false);
                                        btn8.setEnabled(false);
                                        btn9.setEnabled(false);
                                        strt.setEnabled(true);
                                        temp = 0;
                                        ro.setEnabled(true);
                                        rx.setEnabled(true);
                                    }
                                    turn = 0;
                                }
                                if(cnt==9)
                                {
                                    result = "Draw!";
                                    Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                    btn1.setEnabled(false);
                                    btn2.setEnabled(false);
                                    btn3.setEnabled(false);
                                    btn4.setEnabled(false);
                                    btn5.setEnabled(false);
                                    btn6.setEnabled(false);
                                    btn7.setEnabled(false);
                                    btn8.setEnabled(false);
                                    btn9.setEnabled(false);
                                    strt.setEnabled(true);
                                    temp = 0;
                                    ro.setEnabled(true);
                                    rx.setEnabled(true);
                                }
                            }
                        }
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Click Start Button First!",Toast.LENGTH_LONG).show();
                    }
                }
            });

            btn3.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(temp==1)
                    {
                        if(hastext3==0)
                        {
                            hastext3=1;
                            if (firstclick == 1)
                            {
                                firstclick = 0;
                                cnt++;
                                if (tempradio == 1)
                                {
                                    btn3.setText("x");
                                    turn = 0;
                                }
                                else
                                {
                                    btn3.setText("o");
                                    turn = 1;
                                }
                            }
                            else
                            {
                                cnt++;
                                if (turn == 0)
                                {
                                    btn3.setText("o");
                                    if ((btn3.getText() == btn1.getText() && btn3.getText() == btn2.getText()) || (btn3.getText() == btn6.getText() && btn3.getText() == btn9.getText()) || (btn3.getText() == btn5.getText() && btn3.getText() == btn7.getText()))
                                    {
                                        result = "O wins!";
                                        Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                        btn1.setEnabled(false);
                                        btn2.setEnabled(false);
                                        btn3.setEnabled(false);
                                        btn4.setEnabled(false);
                                        btn5.setEnabled(false);
                                        btn6.setEnabled(false);
                                        btn7.setEnabled(false);
                                        btn8.setEnabled(false);
                                        btn9.setEnabled(false);
                                        strt.setEnabled(true);
                                        temp = 0;
                                        ro.setEnabled(true);
                                        rx.setEnabled(true);
                                    }
                                    turn = 1;
                                }
                                else
                                {
                                    btn3.setText("x");
                                    if ((btn3.getText() == btn1.getText() && btn3.getText() == btn2.getText()) || (btn3.getText() == btn6.getText() && btn3.getText() == btn9.getText()) || (btn3.getText() == btn5.getText() && btn3.getText() == btn7.getText()))
                                    {
                                        result = "X wins!";
                                        Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                        btn1.setEnabled(false);
                                        btn2.setEnabled(false);
                                        btn3.setEnabled(false);
                                        btn4.setEnabled(false);
                                        btn5.setEnabled(false);
                                        btn6.setEnabled(false);
                                        btn7.setEnabled(false);
                                        btn8.setEnabled(false);
                                        btn9.setEnabled(false);
                                        strt.setEnabled(true);
                                        temp = 0;
                                        ro.setEnabled(true);
                                        rx.setEnabled(true);
                                    }
                                    turn = 0;
                                }
                                if(cnt==9)
                                {
                                    result = "Draw!";
                                    Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                    btn1.setEnabled(false);
                                    btn2.setEnabled(false);
                                    btn3.setEnabled(false);
                                    btn4.setEnabled(false);
                                    btn5.setEnabled(false);
                                    btn6.setEnabled(false);
                                    btn7.setEnabled(false);
                                    btn8.setEnabled(false);
                                    btn9.setEnabled(false);
                                    strt.setEnabled(true);
                                    temp = 0;
                                    ro.setEnabled(true);
                                    rx.setEnabled(true);
                                }
                            }
                        }
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Click Start Button First!",Toast.LENGTH_LONG).show();
                    }
                }

            });

            btn4.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(temp==1)
                    {
                        if(hastext4==0)
                        {
                            hastext4=1;
                            if (firstclick == 1)
                            {
                                firstclick = 0;
                                cnt++;
                                if (tempradio == 1)
                                {
                                    btn4.setText("x");
                                    turn = 0;
                                }
                                else
                                {
                                    btn4.setText("o");
                                    turn = 1;
                                }
                            }
                            else
                            {
                                cnt++;
                                if (turn == 0)
                                {
                                    btn4.setText("o");
                                    if ((btn4.getText() == btn1.getText() && btn4.getText() == btn7.getText()) || (btn4.getText() == btn5.getText() && btn4.getText() == btn6.getText()))
                                    {
                                        result = "O wins!";
                                        Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                        btn1.setEnabled(false);
                                        btn2.setEnabled(false);
                                        btn3.setEnabled(false);
                                        btn4.setEnabled(false);
                                        btn5.setEnabled(false);
                                        btn6.setEnabled(false);
                                        btn7.setEnabled(false);
                                        btn8.setEnabled(false);
                                        btn9.setEnabled(false);
                                        strt.setEnabled(true);
                                        temp = 0;
                                        ro.setEnabled(true);
                                        rx.setEnabled(true);
                                    }
                                    turn = 1;
                                }
                                else
                                {
                                    btn4.setText("x");
                                    if ((btn4.getText() == btn1.getText() && btn4.getText() == btn7.getText()) || (btn4.getText() == btn5.getText() && btn4.getText() == btn6.getText()))
                                    {
                                        result = "X wins!";
                                        Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                        btn1.setEnabled(false);
                                        btn2.setEnabled(false);
                                        btn3.setEnabled(false);
                                        btn4.setEnabled(false);
                                        btn5.setEnabled(false);
                                        btn6.setEnabled(false);
                                        btn7.setEnabled(false);
                                        btn8.setEnabled(false);
                                        btn9.setEnabled(false);
                                        strt.setEnabled(true);
                                        temp = 0;
                                        ro.setEnabled(true);
                                        rx.setEnabled(true);
                                    }
                                    turn = 0;
                                }
                                if(cnt==9)
                                {
                                    result = "Draw!";
                                    Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                    btn1.setEnabled(false);
                                    btn2.setEnabled(false);
                                    btn3.setEnabled(false);
                                    btn4.setEnabled(false);
                                    btn5.setEnabled(false);
                                    btn6.setEnabled(false);
                                    btn7.setEnabled(false);
                                    btn8.setEnabled(false);
                                    btn9.setEnabled(false);
                                    strt.setEnabled(true);
                                    temp = 0;
                                    ro.setEnabled(true);
                                    rx.setEnabled(true);
                                }
                            }
                        }
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Click Start Button First!",Toast.LENGTH_LONG).show();
                    }
                }
            });

            btn5.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(temp==1)
                    {
                        if(hastext5==0)
                        {
                            hastext5=1;
                            if (firstclick == 1)
                            {
                                firstclick = 0;
                                cnt++;
                                if (tempradio == 1)
                                {
                                    btn5.setText("x");
                                    turn = 0;
                                }
                                else
                                {
                                    btn5.setText("o");
                                    turn = 1;
                                }
                            }
                            else
                            {
                                cnt++;
                                if (turn == 0)
                                {
                                    btn5.setText("o");
                                    if ((btn5.getText() == btn1.getText() && btn5.getText() == btn9.getText()) || (btn5.getText() == btn3.getText() && btn5.getText() == btn7.getText()) || (btn5.getText() == btn2.getText() && btn5.getText() == btn8.getText()) || (btn5.getText() == btn4.getText() && btn5.getText() == btn6.getText()))
                                    {
                                        result = "O wins!";
                                        Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                        btn1.setEnabled(false);
                                        btn2.setEnabled(false);
                                        btn3.setEnabled(false);
                                        btn4.setEnabled(false);
                                        btn5.setEnabled(false);
                                        btn6.setEnabled(false);
                                        btn7.setEnabled(false);
                                        btn8.setEnabled(false);
                                        btn9.setEnabled(false);
                                        strt.setEnabled(true);
                                        temp = 0;
                                        ro.setEnabled(true);
                                        rx.setEnabled(true);
                                    }
                                    turn = 1;
                                }
                                else
                                {
                                    btn5.setText("x");
                                    if ((btn5.getText() == btn1.getText() && btn5.getText() == btn9.getText()) || (btn5.getText() == btn3.getText() && btn5.getText() == btn7.getText()) || (btn5.getText() == btn2.getText() && btn5.getText() == btn8.getText()) || (btn5.getText() == btn4.getText() && btn5.getText() == btn6.getText()))
                                    {
                                        result = "X wins!";
                                        Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                        btn1.setEnabled(false);
                                        btn2.setEnabled(false);
                                        btn3.setEnabled(false);
                                        btn4.setEnabled(false);
                                        btn5.setEnabled(false);
                                        btn6.setEnabled(false);
                                        btn7.setEnabled(false);
                                        btn8.setEnabled(false);
                                        btn9.setEnabled(false);
                                        strt.setEnabled(true);
                                        temp = 0;
                                        ro.setEnabled(true);
                                        rx.setEnabled(true);
                                    }
                                    turn = 0;
                                }
                                if(cnt==9)
                                {
                                    result = "Draw!";
                                    Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                    btn1.setEnabled(false);
                                    btn2.setEnabled(false);
                                    btn3.setEnabled(false);
                                    btn4.setEnabled(false);
                                    btn5.setEnabled(false);
                                    btn6.setEnabled(false);
                                    btn7.setEnabled(false);
                                    btn8.setEnabled(false);
                                    btn9.setEnabled(false);
                                    strt.setEnabled(true);
                                    temp = 0;
                                    ro.setEnabled(true);
                                    rx.setEnabled(true);
                                }
                            }
                        }
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Click Start Button First!",Toast.LENGTH_LONG).show();
                    }
                }
            });

            btn6.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(temp==1)
                    {
                        if(hastext6==0)
                        {
                            hastext6=1;
                            if (firstclick == 1)
                            {
                                firstclick = 0;
                                cnt++;
                                if (tempradio == 1)
                                {
                                    btn6.setText("x");
                                    turn = 0;
                                }
                                else
                                {
                                    btn6.setText("o");
                                    turn = 1;
                                }
                            }
                            else
                            {
                                cnt++;
                                if (turn == 0)
                                {
                                    btn6.setText("o");
                                    if ((btn6.getText() == btn3.getText() && btn6.getText() == btn9.getText()) || (btn6.getText() == btn5.getText() && btn6.getText() == btn4.getText()))
                                    {
                                        result = "O wins!";
                                        Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                        btn1.setEnabled(false);
                                        btn2.setEnabled(false);
                                        btn3.setEnabled(false);
                                        btn4.setEnabled(false);
                                        btn5.setEnabled(false);
                                        btn6.setEnabled(false);
                                        btn7.setEnabled(false);
                                        btn8.setEnabled(false);
                                        btn9.setEnabled(false);
                                        strt.setEnabled(true);
                                        temp = 0;
                                        ro.setEnabled(true);
                                        rx.setEnabled(true);
                                    }
                                    turn = 1;
                                }
                                else
                                {
                                    btn6.setText("x");
                                    if ((btn6.getText() == btn3.getText() && btn6.getText() == btn9.getText()) || (btn6.getText() == btn5.getText() && btn6.getText() == btn4.getText()))
                                    {
                                        result = "X wins!";
                                        Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                        btn1.setEnabled(false);
                                        btn2.setEnabled(false);
                                        btn3.setEnabled(false);
                                        btn4.setEnabled(false);
                                        btn5.setEnabled(false);
                                        btn6.setEnabled(false);
                                        btn7.setEnabled(false);
                                        btn8.setEnabled(false);
                                        btn9.setEnabled(false);
                                        strt.setEnabled(true);
                                        temp = 0;
                                        ro.setEnabled(true);
                                        rx.setEnabled(true);
                                    }
                                    turn = 0;
                                }
                                if(cnt==9)
                                {
                                    result = "Draw!";
                                    Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                    btn1.setEnabled(false);
                                    btn2.setEnabled(false);
                                    btn3.setEnabled(false);
                                    btn4.setEnabled(false);
                                    btn5.setEnabled(false);
                                    btn6.setEnabled(false);
                                    btn7.setEnabled(false);
                                    btn8.setEnabled(false);
                                    btn9.setEnabled(false);
                                    strt.setEnabled(true);
                                    temp = 0;
                                    ro.setEnabled(true);
                                    rx.setEnabled(true);
                                }
                            }
                        }
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Click Start Button First!",Toast.LENGTH_LONG).show();
                    }

                }
            });

            btn7.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(temp==1)
                    {
                        if(hastext7==0)
                        {
                            hastext7=1;
                            if (firstclick == 1)
                            {
                                firstclick = 0;
                                cnt++;
                                if (tempradio == 1)
                                {
                                    btn7.setText("x");
                                    turn = 0;
                                }
                                else
                                {
                                    btn7.setText("o");
                                    turn = 1;
                                }
                            }
                            else
                            {
                                cnt++;
                                if (turn == 0)
                                {
                                    btn7.setText("o");
                                    if ((btn7.getText() == btn4.getText() && btn7.getText() == btn1.getText()) || (btn7.getText() == btn8.getText() && btn7.getText() == btn9.getText()) || (btn7.getText() == btn5.getText() && btn7.getText() == btn3.getText()))
                                    {
                                        result = "O wins!";
                                        Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                        btn1.setEnabled(false);
                                        btn2.setEnabled(false);
                                        btn3.setEnabled(false);
                                        btn4.setEnabled(false);
                                        btn5.setEnabled(false);
                                        btn6.setEnabled(false);
                                        btn7.setEnabled(false);
                                        btn8.setEnabled(false);
                                        btn9.setEnabled(false);
                                        strt.setEnabled(true);
                                        temp = 0;
                                        ro.setEnabled(true);
                                        rx.setEnabled(true);
                                    }
                                    turn = 1;
                                }
                                else
                                {
                                    btn7.setText("x");
                                    if ((btn7.getText() == btn4.getText() && btn7.getText() == btn1.getText()) || (btn7.getText() == btn8.getText() && btn7.getText() == btn9.getText()) || (btn7.getText() == btn5.getText() && btn7.getText() == btn3.getText()))
                                    {
                                        result = "X wins!";
                                        Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                        btn1.setEnabled(false);
                                        btn2.setEnabled(false);
                                        btn3.setEnabled(false);
                                        btn4.setEnabled(false);
                                        btn5.setEnabled(false);
                                        btn6.setEnabled(false);
                                        btn7.setEnabled(false);
                                        btn8.setEnabled(false);
                                        btn9.setEnabled(false);
                                        strt.setEnabled(true);
                                        temp = 0;
                                        ro.setEnabled(true);
                                        rx.setEnabled(true);
                                    }
                                    turn = 0;
                                }
                                if(cnt==9)
                                {
                                    result = "Draw!";
                                    Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                    btn1.setEnabled(false);
                                    btn2.setEnabled(false);
                                    btn3.setEnabled(false);
                                    btn4.setEnabled(false);
                                    btn5.setEnabled(false);
                                    btn6.setEnabled(false);
                                    btn7.setEnabled(false);
                                    btn8.setEnabled(false);
                                    btn9.setEnabled(false);
                                    strt.setEnabled(true);
                                    temp = 0;
                                    ro.setEnabled(true);
                                    rx.setEnabled(true);
                                }
                            }
                        }
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Click Start Button First!",Toast.LENGTH_LONG).show();
                    }
                }
            });

            btn8.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(temp==1)
                    {
                        if(hastext8==0)
                        {
                            hastext8=1;
                            if (firstclick == 1)
                            {
                                firstclick = 0;
                                cnt++;
                                if (tempradio == 1)
                                {
                                    btn8.setText("x");
                                    turn = 0;
                                }
                                else
                                {
                                    btn8.setText("o");
                                    turn = 1;
                                }
                            }
                            else
                            {
                                cnt++;
                                if (turn == 0) {
                                    btn8.setText("o");
                                    if ((btn8.getText() == btn5.getText() && btn8.getText() == btn2.getText()) || (btn8.getText() == btn7.getText() && btn8.getText() == btn9.getText())) {
                                        result = "O wins!";
                                        Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                        btn1.setEnabled(false);
                                        btn2.setEnabled(false);
                                        btn3.setEnabled(false);
                                        btn4.setEnabled(false);
                                        btn5.setEnabled(false);
                                        btn6.setEnabled(false);
                                        btn7.setEnabled(false);
                                        btn8.setEnabled(false);
                                        btn9.setEnabled(false);
                                        strt.setEnabled(true);
                                        temp = 0;
                                        ro.setEnabled(true);
                                        rx.setEnabled(true);
                                    }
                                    turn = 1;
                                }
                                else
                                {
                                    btn8.setText("x");
                                    if ((btn8.getText() == btn5.getText() && btn8.getText() == btn2.getText()) || (btn8.getText() == btn7.getText() && btn8.getText() == btn9.getText()))
                                    {
                                        result = "X wins!";
                                        Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                        btn1.setEnabled(false);
                                        btn2.setEnabled(false);
                                        btn3.setEnabled(false);
                                        btn4.setEnabled(false);
                                        btn5.setEnabled(false);
                                        btn6.setEnabled(false);
                                        btn7.setEnabled(false);
                                        btn8.setEnabled(false);
                                        btn9.setEnabled(false);
                                        strt.setEnabled(true);
                                        temp = 0;
                                        ro.setEnabled(true);
                                        rx.setEnabled(true);
                                    }
                                    turn = 0;
                                }
                                if(cnt==9)
                                {
                                    result = "Draw!";
                                    Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                    btn1.setEnabled(false);
                                    btn2.setEnabled(false);
                                    btn3.setEnabled(false);
                                    btn4.setEnabled(false);
                                    btn5.setEnabled(false);
                                    btn6.setEnabled(false);
                                    btn7.setEnabled(false);
                                    btn8.setEnabled(false);
                                    btn9.setEnabled(false);
                                    strt.setEnabled(true);
                                    temp = 0;
                                    ro.setEnabled(true);
                                    rx.setEnabled(true);
                                }
                            }
                        }
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Click Start Button First!",Toast.LENGTH_LONG).show();
                    }
                }
            });

            btn9.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(temp==1)
                    {
                        if(hastext9==0)
                        {
                            hastext9=1;
                            if (firstclick == 1)
                            {
                                firstclick = 0;
                                cnt++;
                                if (tempradio == 1)
                                {
                                    btn9.setText("x");
                                    turn = 0;
                                }
                                else
                                {
                                    btn9.setText("o");
                                    turn = 1;
                                }
                            }
                            else
                            {
                                cnt++;
                                if (turn == 0)
                                {
                                    btn9.setText("o");
                                    if ((btn9.getText() == btn6.getText() && btn9.getText() == btn3.getText()) || (btn9.getText() == btn7.getText() && btn9.getText() == btn8.getText()) || (btn9.getText() == btn5.getText() && btn9.getText() == btn1.getText()))
                                    {
                                        result = "O wins!";
                                        Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                        btn1.setEnabled(false);
                                        btn2.setEnabled(false);
                                        btn3.setEnabled(false);
                                        btn4.setEnabled(false);
                                        btn5.setEnabled(false);
                                        btn6.setEnabled(false);
                                        btn7.setEnabled(false);
                                        btn8.setEnabled(false);
                                        btn9.setEnabled(false);
                                        strt.setEnabled(true);
                                        temp = 0;
                                        ro.setEnabled(true);
                                        rx.setEnabled(true);
                                    }
                                    turn = 1;
                                }
                                else
                                {
                                    btn9.setText("x");
                                    if ((btn9.getText() == btn6.getText() && btn9.getText() == btn3.getText()) || (btn9.getText() == btn7.getText() && btn9.getText() == btn8.getText()) || (btn9.getText() == btn5.getText() && btn9.getText() == btn1.getText()))
                                    {
                                        result = "X wins!";
                                        Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                        btn1.setEnabled(false);
                                        btn2.setEnabled(false);
                                        btn3.setEnabled(false);
                                        btn4.setEnabled(false);
                                        btn5.setEnabled(false);
                                        btn6.setEnabled(false);
                                        btn7.setEnabled(false);
                                        btn8.setEnabled(false);
                                        btn9.setEnabled(false);
                                        strt.setEnabled(true);
                                        temp = 0;
                                        ro.setEnabled(true);
                                        rx.setEnabled(true);
                                    }
                                    turn = 0;
                                }
                                if(cnt==9)
                                {
                                    result = "Draw!";
                                    Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                                    btn1.setEnabled(false);
                                    btn2.setEnabled(false);
                                    btn3.setEnabled(false);
                                    btn4.setEnabled(false);
                                    btn5.setEnabled(false);
                                    btn6.setEnabled(false);
                                    btn7.setEnabled(false);
                                    btn8.setEnabled(false);
                                    btn9.setEnabled(false);
                                    strt.setEnabled(true);
                                    temp = 0;
                                    ro.setEnabled(true);
                                    rx.setEnabled(true);
                                }
                            }
                        }
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Click Start Button First!",Toast.LENGTH_LONG).show();
                    }
                }
            });
        }
}