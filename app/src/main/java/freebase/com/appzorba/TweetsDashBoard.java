package freebase.com.appzorba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TweetsDashBoard extends AppCompatActivity {

    ImageButton Show,healthTweets;
    ImageButton fin, weather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweets_dash_board);
        Show = (ImageButton) findViewById(R.id.ShowTweets);
        healthTweets = (ImageButton) findViewById(R.id.Health);
        fin = (ImageButton) findViewById(R.id.Fin);
        weather = (ImageButton) findViewById(R.id.Weather);


        Show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent GoToTweets = new Intent(TweetsDashBoard.this,MainActivity.class);
                startActivity(GoToTweets);

            }
        });


        healthTweets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent HealthTweets = new Intent(TweetsDashBoard.this,HealthActivity.class);
                startActivity(HealthTweets);

            }
        });

        fin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent FinTweets = new Intent(TweetsDashBoard.this,Fin.class);
                startActivity(FinTweets);

            }
        });

        weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent WeatherTweets = new Intent(TweetsDashBoard.this,Weather24.class);
                startActivity(WeatherTweets);

            }
        });
    }
}
