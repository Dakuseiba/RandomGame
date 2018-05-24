package pl.swiebodzin.pzs.random;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EndGame extends AppCompatActivity {


    Button clickRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_game);


        clickRes = findViewById(R.id.clickReset);

        clickRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getReset();
            }
        });


    }

    public void getReset(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
