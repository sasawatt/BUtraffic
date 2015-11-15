package bu.sasawatt.butraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    //Explicit

    private TextView titleTextView, detailTextView;
    private ImageView trafficImageview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        binwidget();
    }
    //Main Method

    private void binwidget() {

        titleTextView = (TextView) findViewById(R.id.textView2);
    }
}