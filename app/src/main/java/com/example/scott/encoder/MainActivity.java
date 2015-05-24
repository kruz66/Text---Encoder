package com.example.scott.encoder;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends ActionBarActivity {




    public void clear(View view)
    {
        TextView outputText = (TextView) findViewById(R.id.outputText);
        EditText inputText = (EditText) findViewById(R.id.inputText);

        outputText.setText("");
        inputText.setText("");
    }
    public void encode(View view)
    {
        TextView outputText = (TextView) findViewById(R.id.outputText);
        EditText inputText = (EditText) findViewById(R.id.inputText);

        String message = inputText.getText().toString();
        String [] messageArray = message.split("");

        for (int i=0;i<messageArray.length;++i)
        {
            System.out.println(messageArray[i]);

            if(messageArray[i].equals("a") || messageArray[i].equals("A"))
            {
                messageArray[i] = "o";
            }
            else if(messageArray[i].equals("b") || messageArray.equals("B"))
            {
                messageArray[i] = "t";
            }
            else if(messageArray[i].equals("c") || messageArray[i].equals("C"))
            {
                messageArray[i] = "g";
            }
            else if(messageArray[i].equals("d") || messageArray[i].equals("D"))
            {
                messageArray[i] = "l";
            }
            else if(messageArray[i].equals("e") || messageArray[i].equals("E"))
            {
                messageArray[i] = "w";
            }
            else if(messageArray[i].equals("f") || messageArray[i].equals("F"))
            {
                messageArray[i] = "p";
            }
            else if(messageArray[i].equals("g") || messageArray[i].equals("G"))
            {
                messageArray[i] = "b";
            }
            else if(messageArray[i].equals("h") || messageArray[i].equals("H"))
            {
                messageArray[i] = "r";
            }
            else if(messageArray[i].equals("I") || messageArray[i].equals("I"))
            {
                messageArray[i] = "#";
            }
            else if(messageArray[i].equals("j") || messageArray[i].equals("J"))
            {
                messageArray[i] = "q";
            }
            else if(messageArray[i].equals("k") || messageArray[i].equals("K"))
            {
                messageArray[i] = "c";
            }
            else if(messageArray[i].equals("l") || messageArray[i].equals("L"))
            {
                messageArray[i] = "i";
            }
            else if(messageArray[i].equals("m") || messageArray[i].equals("M"))
            {
                messageArray[i] = "a";
            }
            else if(messageArray[i].equals("n") || messageArray[i].equals("N"))
            {
                messageArray[i] = "m";
            }
            else if(messageArray[i].equals("o") || messageArray[i].equals("O"))
            {
                messageArray[i] = "y";
            }
            else if(messageArray[i].equals("p") || messageArray[i].equals("P"))
            {
                messageArray[i] = "e";
            }
            else if(messageArray[i].equals("q") || messageArray[i].equals("Q"))
            {
                messageArray[i] = "z";
            }
            else if(messageArray[i].equals("r") || messageArray[i].equals("R"))
            {
                messageArray[i] = "f";
            }
            else if(messageArray[i].equals("s") || messageArray[i].equals("S"))
            {
                messageArray[i] = "j";
            }
            else if(messageArray[i].equals("t") || messageArray[i].equals("T"))
            {
                messageArray[i] = "n";
            }
            else if(messageArray[i].equals("u") || messageArray[i].equals("U"))
            {
                messageArray[i] = "d";
            }
            else if(messageArray[i].equals("v") || messageArray[i].equals("V"))
            {
                messageArray[i] = "u";
            }
            else if(messageArray[i].equals("w") || messageArray[i].equals("W"))
            {
                messageArray[i] = "k";
            }
            else if(messageArray[i].equals("x") || messageArray[i].equals("X"))
            {
                messageArray[i] = "s";
            }
            else if(messageArray[i].equals("y") || messageArray[i].equals("Y"))
            {
                messageArray[i] = "v";
            }
            else if(messageArray[i].equals("z") || messageArray[i].equals("Z"))
            {
                messageArray[i] = "x";
            }
            else if(messageArray[i].equals(" ") || messageArray[i].equals(" "))
            {
                messageArray[i] = "h";
            }
        }

        System.out.println("Encoding...");
        StringBuilder str2 = new StringBuilder();
        for(String value : messageArray)
        {
            str2.append(value);
        }
        outputText.setText(str2);
    }


    public void decode(View view)
    {
        TextView outputText = (TextView) findViewById(R.id.outputText);
        EditText inputText = (EditText) findViewById(R.id.inputText);
        String message = inputText.getText().toString();
        String [] messageArray = message.split("");

        for (int i=0;i<messageArray.length;++i)
        {
            System.out.println(messageArray[i]);

            if(messageArray[i].equals("o") || messageArray[i].equals("O"))
            {
                messageArray[i] = "a";
            }
            else if(messageArray[i].equals("t") || messageArray.equals("T"))
            {
                messageArray[i] = "b";
            }
            else if(messageArray[i].equals("g") || messageArray[i].equals("G"))
            {
                messageArray[i] = "c";
            }
            else if(messageArray[i].equals("l") || messageArray[i].equals("L"))
            {
                messageArray[i] = "d";
            }
            else if(messageArray[i].equals("w") || messageArray[i].equals("W"))
            {
                messageArray[i] = "e";
            }
            else if(messageArray[i].equals("p") || messageArray[i].equals("P"))
            {
                messageArray[i] = "f";
            }
            else if(messageArray[i].equals("b") || messageArray[i].equals("B"))
            {
                messageArray[i] = "g";
            }
            else if(messageArray[i].equals("r") || messageArray[i].equals("R"))
            {
                messageArray[i] = "h";
            }
            else if(messageArray[i].equals("#") || messageArray[i].equals("#"))
            {
                messageArray[i] = "I";
            }
            else if(messageArray[i].equals("q") || messageArray[i].equals("Q"))
            {
                messageArray[i] = "j";
            }
            else if(messageArray[i].equals("c") || messageArray[i].equals("C"))
            {
                messageArray[i] = "k";
            }
            else if(messageArray[i].equals("i") || messageArray[i].equals("I"))
            {
                messageArray[i] = "l";
            }
            else if(messageArray[i].equals("a") || messageArray[i].equals("A"))
            {
                messageArray[i] = "m";
            }
            else if(messageArray[i].equals("m") || messageArray[i].equals("M"))
            {
                messageArray[i] = "n";
            }
            else if(messageArray[i].equals("y") || messageArray[i].equals("Y"))
            {
                messageArray[i] = "o";
            }
            else if(messageArray[i].equals("e") || messageArray[i].equals("E"))
            {
                messageArray[i] = "p";
            }
            else if(messageArray[i].equals("z") || messageArray[i].equals("Z"))
            {
                messageArray[i] = "q";
            }
            else if(messageArray[i].equals("f") || messageArray[i].equals("F"))
            {
                messageArray[i] = "r";
            }
            else if(messageArray[i].equals("j") || messageArray[i].equals("J"))
            {
                messageArray[i] = "s";
            }
            else if(messageArray[i].equals("n") || messageArray[i].equals("N"))
            {
                messageArray[i] = "t";
            }
            else if(messageArray[i].equals("d") || messageArray[i].equals("D"))
            {
                messageArray[i] = "u";
            }
            else if(messageArray[i].equals("u") || messageArray[i].equals("U"))
            {
                messageArray[i] = "v";
            }
            else if(messageArray[i].equals("k") || messageArray[i].equals("K"))
            {
                messageArray[i] = "w";
            }
            else if(messageArray[i].equals("s") || messageArray[i].equals("S"))
            {
                messageArray[i] = "x";
            }
            else if(messageArray[i].equals("v") || messageArray[i].equals("V"))
            {
                messageArray[i] = "y";
            }
            else if(messageArray[i].equals("x") || messageArray[i].equals("X"))
            {
                messageArray[i] = "z";
            }
            else if(messageArray[i].equals("h") || messageArray[i].equals("H"))
            {
                messageArray[i] = " ";
            }
        }


        StringBuilder str2 = new StringBuilder();
        for(String value : messageArray)
        {
            str2.append(value);
        }
        outputText.setText(str2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
