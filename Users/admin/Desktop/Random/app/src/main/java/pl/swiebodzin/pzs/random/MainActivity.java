package pl.swiebodzin.pzs.random;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView playerOne;
    TextView playerTwo;
    TextView pointOne;
    TextView pointTwo;
    TextView wynikText;

    EditText liczbaEdit;

    Button clickButton;

   // int licznik=1;
   // int count=5;

    int currentPlayer =1;
    int counter =5; //licznik
    int ram;
    int scoreOne=0;
    int scoreTwo=0;
    int globalCounter =2;
    int click=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerOne = findViewById(R.id.playerOne);
        playerTwo = findViewById(R.id.playerTwo);
        pointOne = findViewById(R.id.pointOne);
        pointTwo = findViewById(R.id.pointTwo);
        wynikText = findViewById(R.id.wynikText);
        clickButton = findViewById(R.id.clickButton);
        liczbaEdit = findViewById(R.id.liczbaEdit);
        playerTwo.setVisibility(View.INVISIBLE);

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = getRandomNumber();


                if(liczbaEdit.getText().toString().length()==0)
                {
                    ram =0;
                }
                else
                {
                    ram = Integer.parseInt(liczbaEdit.getText().toString());
                }


                sprawdzenie(ram, number);



                /*   wynikText.setText(String.valueOf(count));
                licznik++;
                count--;

                if(licznik<=5)
                {
                    playerOne.setVisibility(View.VISIBLE);
                    playerTwo.setVisibility(View.INVISIBLE);
                }
                else
                {
                    playerOne.setVisibility(View.INVISIBLE);
                    playerTwo.setVisibility(View.VISIBLE);
                }
                if(licznik>=10)
                {
                    licznik=1;
                }
             */

            }
        });

    }

    public int getRandomNumber(){
        Random random = new Random();
        return random.nextInt(10);
    }

    public int shiftPlayer(int player)
    {
        switch(player)
        {
            case 1:
                currentPlayer =2;
                playerOne.setVisibility(View.INVISIBLE);
                playerTwo.setVisibility(View.VISIBLE);
                counter =5;
                clickButton.setText(String.valueOf(counter));
                liczbaEdit.setText(String.valueOf(""));
                click++;
                break;
            case 2:
                currentPlayer =1;
                playerOne.setVisibility(View.VISIBLE);
                playerTwo.setVisibility(View.INVISIBLE);
                counter =5;
                clickButton.setText(String.valueOf(counter));
                liczbaEdit.setText(String.valueOf(""));
                click++;
                break;
        }
        return currentPlayer;
    }

    public void goodNumber(int player, int numberPlayer, int numberComputer)
    {
//        try {
            if (numberComputer == numberPlayer && numberPlayer != 0) {
                switch (player) {
                    case 1:
                        scoreOne++;
                        pointOne.setText(String.valueOf(scoreOne));
                        break;
                    case 2:
                        scoreTwo++;
                        pointTwo.setText(String.valueOf(scoreTwo));
                        break;
                }
            }
//        }catch(NumberFormatException e)
//        {
//            Toast.makeText(getBaseContext(),"Podaj liczbę", Toast.LENGTH_SHORT).show();
//        }
    }

    public void sprawdzenie(int numberPlayer, int number)
    {
      if(numberPlayer==0)
      {
          Toast.makeText(getBaseContext(),"Podaj liczbę", Toast.LENGTH_SHORT).show();
          wynikText.setText(String.valueOf(0));
      }
      else
      {
          counter--;
          clickButton.setText(String.valueOf(counter));
          goodNumber(currentPlayer,ram,number);

          if(counter==0)
          {
              shiftPlayer(currentPlayer);
          }
          wynikText.setText(String.valueOf(number));
          if(click==2)
          {
              globalMath();
          }

      }
    }

    public void globalMath()
    {
        if(globalCounter>0)
        {
            globalCounter--;
            click=0;
            Toast.makeText(getBaseContext(),"NEXT ROUND", Toast.LENGTH_SHORT).show();
        }
        else
        {
            getGameOverActivity();
           /* clickButton.setVisibility(View.INVISIBLE);
            wynikText.setText(String.valueOf("KONIEC GRY!"));
            if(scoreOne==scoreTwo)
            {
                Toast.makeText(getBaseContext(),"REMIS!", Toast.LENGTH_SHORT).show();
            }
            else{
                if(scoreOne > scoreTwo)
                {
                    pointTwo.setVisibility(View.INVISIBLE);
                    playerTwo.setVisibility(View.INVISIBLE);
                    playerOne.setVisibility(View.VISIBLE);
                    Toast.makeText(getBaseContext(),"Player1 WON!", Toast.LENGTH_SHORT).show();
                }
                else {
                    pointOne.setVisibility(View.INVISIBLE);
                    playerOne.setVisibility(View.INVISIBLE);
                    playerTwo.setVisibility(View.VISIBLE);
                    Toast.makeText(getBaseContext(),"Player2 WON!", Toast.LENGTH_SHORT).show();
                }
            }
            */
        }


    }
    public void getGameOverActivity(){
        Intent intent = new Intent(this, EndGame.class);
        startActivity(intent);
    }


}

/*

    try{
        int playerNum;
        playerNum == Integer.parseInt(editText.getText().toString();
    }
    catch (NumberFormatException e)
    {
       //number =0;
        Toast.makeText(getApplicationContext(),"Podaj liczbę".Toast.LENGTH_SHORT);
    }

    ////////////////////////////////////////////////////////////////////////////

    public int sprawdzenie(int number)
    {
        try{
            return Integer.parseInt(number.getText().toString());
        }catch
        {
            Log.d("error","Number not found");
        }return 0;
    }



 */
