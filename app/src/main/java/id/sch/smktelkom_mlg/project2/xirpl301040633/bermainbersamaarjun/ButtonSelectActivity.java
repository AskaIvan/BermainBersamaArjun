package id.sch.smktelkom_mlg.project2.xirpl301040633.bermainbersamaarjun;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ButtonSelectActivity extends AppCompatActivity {
    public static final String DATA = "data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_select);

        LinearLayout f = (LinearLayout) findViewById(R.id.lala);
        f.setOrientation(LinearLayout.VERTICAL);

        for (int i = 0; i <= 6; i++) {
            LinearLayout row = new LinearLayout(this);
            row.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            for (int a = 0; a <= 7; a++) {
                for (int l = 65; l <= 90; l++) {
                    Button button = new Button(this);
                    button.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                    button.setText("" + (char) (l + (i * 4)));
                    button.setId((char) (l + (i * 4)));
                    row.addView(button);

                    final String id = String.valueOf((char) (l + (i * 4)));
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (id == "A") {

                            }
                            startActivity(new Intent(ButtonSelectActivity.this, Main2Activity.class));
                        }
                    });
                }
            }
            f.addView(row);
        }
    }
}
