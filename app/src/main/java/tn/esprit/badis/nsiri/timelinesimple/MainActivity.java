package tn.esprit.badis.nsiri.timelinesimple;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout front,backgrd;

    Button h1,h2,h3,h4,h5,h6,h7,h8,h9,h10;
    TextView time1,time2,time3,time4,time5,time6,time7,time8,time9,time10;

    Button[] timeLineTab = new Button[10];
    TextView[] clockTab = new TextView[10];

    Calendar calendar;
    SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");
    SimpleDateFormat sdf2 = new SimpleDateFormat("HH:00");
    SimpleDateFormat sdf3 = new SimpleDateFormat("HH:30");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        backgrd = (ConstraintLayout) findViewById(R.id.back);
        front = (ConstraintLayout) findViewById(R.id.font);
        h1 = (Button) findViewById(R.id.tab1);
        h2 = (Button) findViewById(R.id.tab2);
        h3 = (Button) findViewById(R.id.tab3);
        h4 = (Button) findViewById(R.id.tab4);
        h5 = (Button) findViewById(R.id.tab5);
        h6 = (Button) findViewById(R.id.tab6);
        h7 = (Button) findViewById(R.id.tab7);
        h8 = (Button) findViewById(R.id.tab8);
        h9 = (Button) findViewById(R.id.tab9);
        h10 = (Button) findViewById(R.id.tab10);
        time1 = (TextView) findViewById(R.id.time1);
        time2 = (TextView) findViewById(R.id.time2);
        time3 = (TextView) findViewById(R.id.time3);
        time4 = (TextView) findViewById(R.id.time4);
        time5 = (TextView) findViewById(R.id.time5);
        time6 = (TextView) findViewById(R.id.time6);
        time7 = (TextView) findViewById(R.id.time7);
        time8 = (TextView) findViewById(R.id.time8);
        time9 = (TextView) findViewById(R.id.time9);
        time10 = (TextView) findViewById(R.id.time10);

        timeLineTab[0]=h1;
        timeLineTab[1]=h2;
        timeLineTab[2]=h3;
        timeLineTab[3]=h4;
        timeLineTab[4]=h5;
        timeLineTab[5]=h6;
        timeLineTab[6]=h7;
        timeLineTab[7]=h8;
        timeLineTab[8]=h9;
        timeLineTab[9]=h10;

        clockTab[0]=time1;
        clockTab[1]=time2;
        clockTab[2]=time3;
        clockTab[3]=time4;
        clockTab[4]=time5;
        clockTab[5]=time6;
        clockTab[6]=time7;
        clockTab[7]=time8;
        clockTab[8]=time9;
        clockTab[9]=time10;

        setTimeLine();
    }

    public void setTimeLine(){
        calendar = Calendar.getInstance();

        if(calendar.get(Calendar.MINUTE)<30){

            for (int i=0;i<clockTab.length;i+=2){
                clockTab[i].setText(sdf2.format(calendar.getTime()));
                clockTab[i+1].setText(sdf3.format(calendar.getTime()));
                calendar.add(Calendar.HOUR,1);
            }
        }

        if (calendar.get(Calendar.MINUTE)>=30){

            for (int i=0;i<clockTab.length;i+=2){
                clockTab[i].setText(sdf3.format(calendar.getTime()));
                calendar.add(Calendar.HOUR,1);
                clockTab[i+1].setText(sdf2.format(calendar.getTime()));

            }
        }

        switch (time1.getText().toString()){

            case "13:30" :
                for (int i =9;i<timeLineTab.length;i++){
                    clockTab[i].setVisibility(View.INVISIBLE);
                    timeLineTab[i].setVisibility(View.INVISIBLE);
                }
                break;

            case  "14:00" :
                for (int  i=8;i<clockTab.length;i++){
                    clockTab[i].setVisibility(View.INVISIBLE);
                    timeLineTab[i].setVisibility(View.INVISIBLE);
                }
                break;
            case "14:30" :
                for (int  i=7;i<clockTab.length;i++){
                    clockTab[i].setVisibility(View.INVISIBLE);
                    timeLineTab[i].setVisibility(View.INVISIBLE);
                }
                break;
            case "15:00" :
                for (int  i=6;i<clockTab.length;i++){
                    clockTab[i].setVisibility(View.INVISIBLE);
                    timeLineTab[i].setVisibility(View.INVISIBLE);
                }
                break;
            case "15:30" :
                for (int  i=5;i<clockTab.length;i++){
                    clockTab[i].setVisibility(View.INVISIBLE);
                    timeLineTab[i].setVisibility(View.INVISIBLE);
                }

                break;

            case "16:00" :
                for (int  i=4;i<clockTab.length;i++){
                    clockTab[i].setVisibility(View.INVISIBLE);
                    timeLineTab[i].setVisibility(View.INVISIBLE);
                }
                break;

            case "16:30" :
                for (int  i=3;i<clockTab.length;i++){
                    clockTab[i].setVisibility(View.INVISIBLE);
                    timeLineTab[i].setVisibility(View.INVISIBLE);
                }

                break;
            case "17:00" :
                for (int  i=2;i<clockTab.length;i++){
                    clockTab[i].setVisibility(View.INVISIBLE);
                    timeLineTab[i].setVisibility(View.INVISIBLE);
                }

                break;

            case "17:30" :

                for (int  i=1;i<clockTab.length;i++){
                    clockTab[i].setVisibility(View.INVISIBLE);
                    timeLineTab[i].setVisibility(View.INVISIBLE);
                }

                break;


            case "18:00" :
                for (int  i=0;i<clockTab.length;i++){
                    clockTab[i].setVisibility(View.INVISIBLE);
                    timeLineTab[i].setVisibility(View.INVISIBLE);
                }
                break;

            default:
                break;

        }

    }
}
