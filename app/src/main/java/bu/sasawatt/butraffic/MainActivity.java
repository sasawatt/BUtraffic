package bu.sasawatt.butraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        //ButtonControllor
        buttoncontriior();
        //Creat ListView
        createListview();

    }   //Main Method

    private void createListview() {

        //setup Array
        final String[] strings = new String[20];
        strings[0] = "ห้ามเลี้ยวซ้าย";
        strings[1] = "ห้ามเลี้ยวขวา";
        strings[2] = "ตรงไป";
        strings[3] = "เลี้ยวขวา";
        strings[4] = "เลี้ยวซ้าย";
        strings[5] = "ทางออก";
        strings[6] = "ทางเข้า";
        strings[7] = "ทางออก";
        strings[8] = "หยุด";
        strings[9] = "จำกัดความสูง";
        strings[10] = "ทางแยก";
        strings[11] = "ห้ามกลับรถ";
        strings[12] = "ห้ามจอด";
        strings[13] = "รถสวน";
        strings[14] = "ห้ามแซง";
        strings[15] = "ห้ามเข้า";
        strings[16] = "หยุดตรวจ";
        strings[17] = "จำกัดความเร็ว";
        strings[18] = "จำกัดความกว้าง";
        strings[19] = "จำกัดความสูง";

        final int[] intsicon = {R.drawable.traffic_01,

                R.drawable.traffic_02,
                R.drawable.traffic_03,
                R.drawable.traffic_04,
                R.drawable.traffic_05,
                R.drawable.traffic_06,
                R.drawable.traffic_07,
                R.drawable.traffic_08,
                R.drawable.traffic_09,
                R.drawable.traffic_10,
                R.drawable.traffic_11,
                R.drawable.traffic_12,
                R.drawable.traffic_13,
                R.drawable.traffic_14,
                R.drawable.traffic_15,
                R.drawable.traffic_16,
                R.drawable.traffic_17,
                R.drawable.traffic_18,
                R.drawable.traffic_19,
                R.drawable.traffic_20};
        MyAdapter objAdapter = new MyAdapter(MainActivity.this, strings, intsicon);

        TrafficListView.setAdapter(objAdapter);

        TrafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Intent objIntent = new Intent(MainActivity.this, DetailActivity.class);
                objIntent.putExtra ("Title", strings[position]);
                objIntent.putExtra("Image", intsicon);
                objIntent.putExtra("Index", position);
                startActivity(objIntent);

            } //event
        });

    }   // CreateListview

    private void buttoncontriior() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //sound effect
                MediaPlayer buttonPlayer = MediaPlayer.create(getBaseContext(), R.raw.horse);
                buttonPlayer.start();


                //intent to WebView
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("http://www.androidthai.in.th/"));
                startActivity(objIntent);


            }   //event
        });
    }

    private void bindWidget() {
        TrafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

    }


}   //Main Clas
