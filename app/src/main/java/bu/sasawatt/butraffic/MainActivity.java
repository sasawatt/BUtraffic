package bu.sasawatt.butraffic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.MediaController;

public class MainActivity extends AppCompatActivity {
    //explicit
    private ListView TrafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bin Widget
        bindWidget();

        buttoncontriior();

    }   //Main Method

    private void buttoncontriior() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //sound effect
                MediaPlayer buttonPlayer = MediaPlayer.create(getBaseContext(), R.raw.horse);
                buttonPlayer.start();


                    //intent to WebView
                    


            }   //event
        });
    }

    private void bindWidget() {
        TrafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

    }


}   //Main Clas
