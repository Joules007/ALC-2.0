package com.android.user.tictactoe;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Grid4Activity extends AppCompatActivity {

    TextView button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16;

    int turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid4);

        button1 = (TextView) findViewById(R.id.button1);
        button2 = (TextView) findViewById(R.id.button2);
        button3 = (TextView) findViewById(R.id.button3);
        button4 = (TextView) findViewById(R.id.button4);
        button5 = (TextView) findViewById(R.id.button5);
        button6 = (TextView) findViewById(R.id.button6);
        button7 = (TextView) findViewById(R.id.button7);
        button8 = (TextView) findViewById(R.id.button8);
        button9 = (TextView) findViewById(R.id.button9);
        button10 = (TextView) findViewById(R.id.button10);
        button11 = (TextView) findViewById(R.id.button11);
        button12 = (TextView) findViewById(R.id.button12);
        button13 = (TextView) findViewById(R.id.button13);
        button14 = (TextView) findViewById(R.id.button14);
        button15 = (TextView) findViewById(R.id.button15);
        button16 = (TextView) findViewById(R.id.button16);



        turn = 1;

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button1.getText().toString().equals("")) {
                    if (turn == 1) {

                        turn = 2;
                        button1.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        button2.setText("O");
                    }
                }
                endGame();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button2.getText().toString().equals("")) {
                    if (turn == 1) {

                        turn = 2;
                        button2.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        button2.setText("O");
                    }
                }
                endGame();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button3.getText().toString().equals("")) {
                    if (turn == 1) {

                        turn = 2;
                        button3.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        button3.setText("O");
                    }
                }
                endGame();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button4.getText().toString().equals("")) {
                    if (turn == 1) {

                        turn = 2;
                        button4.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        button4.setText("O");
                    }
                }
                endGame();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button5.getText().toString().equals("")) {
                    if (turn == 1) {

                        turn = 2;
                        button5.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        button5.setText("O");
                    }
                }
                endGame();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button6.getText().toString().equals("")) {
                    if (turn == 1) {

                        turn = 2;
                        button6.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        button6.setText("O");
                    }
                }
                endGame();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button7.getText().toString().equals("")) {
                    if (turn == 1) {

                        turn = 2;
                        button7.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        button7.setText("O");
                    }
                }
                endGame();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button8.getText().toString().equals("")) {
                    if (turn == 1) {

                        turn = 2;
                        button8.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        button8.setText("O");
                    }
                }
                endGame();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button9.getText().toString().equals("")) {
                    if (turn == 1) {

                        turn = 2;
                        button9.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        button9.setText("O");
                    }
                }
                endGame();
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button10.getText().toString().equals("")) {
                    if (turn == 1) {

                        turn = 2;
                        button10.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        button9.setText("O");
                    }
                }
                endGame();
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button11.getText().toString().equals("")) {
                    if (turn == 1) {

                        turn = 2;
                        button11.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        button11.setText("O");
                    }
                }
                endGame();
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button12.getText().toString().equals("")) {
                    if (turn == 1) {

                        turn = 2;
                        button12.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        button12.setText("O");
                    }
                }
                endGame();
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button13.getText().toString().equals("")) {
                    if (turn == 1) {

                        turn = 2;
                        button13.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        button13.setText("O");
                    }
                }
                endGame();
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button14.getText().toString().equals("")) {
                    if (turn == 1) {

                        turn = 2;
                        button14.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        button14.setText("O");
                    }
                }
                endGame();
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button15.getText().toString().equals("")) {
                    if (turn == 1) {

                        turn = 2;
                        button15.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        button15.setText("O");
                    }
                }
                endGame();
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button16.getText().toString().equals("")) {
                    if (turn == 1) {

                        turn = 2;
                        button16.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        button16.setText("O");
                    }
                }
                endGame();
            }
        });

    }

    public void endGame(){
        String a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p;
        boolean end = false;

        a = button1.getText().toString();
        b = button2.getText().toString();
        c = button3.getText().toString();
        d = button4.getText().toString();
        e = button5.getText().toString();
        f = button6.getText().toString();
        g = button7.getText().toString();
        h = button8.getText().toString();
        i = button9.getText().toString();
        j = button10.getText().toString();
        k = button11.getText().toString();
        l = button12.getText().toString();
        m = button13.getText().toString();
        n = button14.getText().toString();
        o = button15.getText().toString();
        p = button16.getText().toString();

        if (a.equals("X") && b.equals("X") && c.equals("X") && d.equals("X")){
            Toast.makeText(this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a.equals("X") && f.equals("X") && k.equals("X") && p.equals("X")){
            Toast.makeText(this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a.equals("X") && e.equals("X") && i.equals("X") && m.equals("X")){
            Toast.makeText(this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (b.equals("X") && f.equals("X") && j.equals("X") && n.equals("X")){
            Toast.makeText(this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c.equals("X") && g.equals("X") && k.equals("X") && o.equals("X")){
            Toast.makeText(this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d.equals("X") && h.equals("X") && l.equals("X") && p.equals("X")){
            Toast.makeText(this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e.equals("X") && f.equals("X") && g.equals("X") && h.equals("X")){
            Toast.makeText(this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (i.equals("X") && j.equals("X") && k.equals("X") && l.equals("X")){
            Toast.makeText(this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (m.equals("X") && n.equals("X") && o.equals("X") && p.equals("X")){
            Toast.makeText(this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d.equals("X") && g.equals("X") && j.equals("X") && m.equals("X")){
            Toast.makeText(this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            end = true;
        }


        if (a.equals("O") && b.equals("O") && c.equals("O") && d.equals("O")){
            Toast.makeText(this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a.equals("O") && f.equals("O") && k.equals("O") && p.equals("O")){
            Toast.makeText(this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a.equals("O") && e.equals("O") && i.equals("O") && m.equals("O")){
            Toast.makeText(this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (b.equals("O") && f.equals("O") && j.equals("O") && n.equals("O")){
            Toast.makeText(this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c.equals("O") && g.equals("O") && k.equals("O") && o.equals("O")){
            Toast.makeText(this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d.equals("O") && h.equals("O") && l.equals("O") && p.equals("O")){
            Toast.makeText(this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e.equals("O") && f.equals("O") && g.equals("O") && h.equals("O")){
            Toast.makeText(this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (i.equals("O") && j.equals("X") && k.equals("O") && l.equals("O")){
            Toast.makeText(this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (m.equals("O") && n.equals("O") && o.equals("O") && p.equals("O")){
            Toast.makeText(this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d.equals("O") && g.equals("O") && j.equals("O") && m.equals("O")){
            Toast.makeText(this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (end) {
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
        }

    }

}
