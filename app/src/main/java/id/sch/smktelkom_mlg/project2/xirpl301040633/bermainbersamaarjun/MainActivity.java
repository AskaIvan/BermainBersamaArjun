package id.sch.smktelkom_mlg.project2.xirpl301040633.bermainbersamaarjun;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import at.markushi.ui.CircleButton;

public class MainActivity extends AppCompatActivity {

    CircleButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (CircleButton) findViewById(R.id.circlebutton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TryActivity.class));
            }
        });
    }
}
