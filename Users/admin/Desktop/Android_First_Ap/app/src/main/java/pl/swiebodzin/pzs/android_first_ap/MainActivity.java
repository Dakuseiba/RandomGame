package pl.swiebodzin.pzs.android_first_ap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //deklaracja zmiennych
    EditText firstNumber;
    EditText lastNumber;
    TextView textWynik;

    Button clickAdd;
    Button clickClear;
    Button clickDel;
    Button clickMno;
    Button clickDziel;

    int a,b,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //wyszukiwanie podanej wartości
        //R - odwołanie do pliku activity
        firstNumber = findViewById(R.id.firstNumber);
        lastNumber = findViewById(R.id.lastNumber);
        textWynik = findViewById(R.id.textWynik);

        clickAdd = findViewById(R.id.clickAdd);
        clickClear = findViewById(R.id.clickClear);
        clickDel = findViewById(R.id.clickDel);
        clickMno = findViewById(R.id.clickMno);
        clickDziel = findViewById(R.id.clickDziel);





        // sum = getSum(a,b);

        clickAdd.setOnClickListener(new View.OnClickListener()
                                    {
                                        @Override
                                        public void onClick(View v)
                                        {
                                            //a = Integer.parseInt(firstNumber.getText().toString());
                                            // String firstNumberString = firstNumber.getText().toString();
                                            // a=Integer.parseInt(firstNumberString);
                                            //       b = Integer.parseInt(lastNumber.getText().toString());
                                            if(firstNumber.getText().toString().length()==0)
                                            {
                                                a = 0;
                                            }
                                            else{
                                                a = Integer.parseInt(firstNumber.getText().toString());
                                            }

                                            if(lastNumber.getText().toString().length()==0)
                                            {
                                                b = 0;
                                            }
                                            else{
                                                b = Integer.parseInt(lastNumber.getText().toString());
                                            }
                                            sum = getSum(a,b);
                                            textWynik.setText(String.valueOf(sum));
                                            //textWynik.setText(String.valueOf(getFirst(firstNumber.getText())));

                                        }


                                    }

        );

        clickClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber.setText("");
                lastNumber.setText("");
                textWynik.setText("");
            }
        });

        clickDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNumber.getText().toString().length()==0)
                {
                    a = 0;
                }
                else{
                    a = Integer.parseInt(firstNumber.getText().toString());
                }

                if(lastNumber.getText().toString().length()==0)
                {
                    b = 0;
                }
                else{
                    b = Integer.parseInt(lastNumber.getText().toString());
                }
                // a = Integer.parseInt(firstNumber.getText().toString());
                // b = Integer.parseInt(lastNumber.getText().toString());
                sum = getRoz(a,b);
                textWynik.setText(String.valueOf(sum));

            }
        });

        clickMno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //a = Integer.parseInt(firstNumber.getText().toString());
                //b = Integer.parseInt(lastNumber.getText().toString());
                if(firstNumber.getText().toString().length()==0)
                {
                    a = 0;
                }
                else{
                    a = Integer.parseInt(firstNumber.getText().toString());
                }

                if(lastNumber.getText().toString().length()==0)
                {
                    b = 0;
                }
                else{
                    b = Integer.parseInt(lastNumber.getText().toString());
                }
                sum = getMno(a,b);
                textWynik.setText(String.valueOf(sum));
            }
        });

        clickDziel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // a = Integer.parseInt(firstNumber.getText().toString());
                // b = Integer.parseInt(lastNumber.getText().toString());

                if(firstNumber.getText().toString().length()==0)
                {
                    a = 0;
                }
                else{
                    a = Integer.parseInt(firstNumber.getText().toString());
                }

                if(lastNumber.getText().toString().length()==0)
                {
                    b = 0;
                }
                else{
                    b = Integer.parseInt(lastNumber.getText().toString());
                }
                if(a==0 || b==0)
                {
                    textWynik.setText(String.valueOf("Nie dzielimy przez 0!"));
                }
                else {
                    float dzielwynik = getDziel(a, b);
                    textWynik.setText(String.valueOf(dzielwynik));
                }
            }
        });


    }

    public int getSum(int num1, int num2)
    {
        return num1 + num2;
    }

    public int getNumber()
    {
        // pomaga zarządzać projektem
        //todo uzupełnić
        return 0;
    }

    public int getRoz(int num1, int num2)
    {
        return num1 - num2;
    }

    public int getMno(int num1, int num2)
    {
        return num1 * num2;
    }
    public float getDziel(float num1, float num2)
    {
        return num1 / num2;
    }
/*
    public int getFirst(text num1)
    {
        if(firstNumber.getText().toString().length()==0)
        {
            return 0;
        }
        else{
            return 1;
        }
    }

    public int getLast(char num2)
    {
        if(lastNumber.getText().toString().length()==0)
        {
            return 0;
        }
        else{
            return 1;
        }
    }
    */
}
