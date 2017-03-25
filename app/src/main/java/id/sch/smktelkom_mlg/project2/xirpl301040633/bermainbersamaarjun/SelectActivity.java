package id.sch.smktelkom_mlg.project2.xirpl301040633.bermainbersamaarjun;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import at.markushi.ui.CircleButton;

public class SelectActivity extends AppCompatActivity {
    CircleButton sinau, play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        sinau = (CircleButton) findViewById(R.id.sinaubutton);
        play = (CircleButton) findViewById(R.id.nyanyibutton);

        sinau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
