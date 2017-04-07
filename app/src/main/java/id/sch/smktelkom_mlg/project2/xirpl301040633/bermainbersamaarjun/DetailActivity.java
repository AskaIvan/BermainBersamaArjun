package id.sch.smktelkom_mlg.project2.xirpl301040633.bermainbersamaarjun;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String TAG = "LivecycleTag";
    MediaPlayer mediaPlayer;
    ImageButton play;
    ImageButton pause;
    ImageButton stop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Hotel hotel = (Hotel) getIntent().getSerializableExtra(Main3Activity.HOTEL);
        setTitle(hotel.judul);
        ImageView ivFoto = (ImageView) findViewById(R.id.imageFoto);
        ivFoto.setImageURI(Uri.parse(hotel.foto));
        TextView tvLagu = (TextView) findViewById(R.id.song);
        tvLagu.setText(hotel.judul);
        TextView tvDetail = (TextView) findViewById(R.id.song_detail);
        tvDetail.setText(hotel.deskripsi + "\n\n" + hotel.detail);
        //mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tukang_bakso);
        if (hotel.judul.equals("Abang Tukang Bakso")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.tukang_bakso);
        } else if (hotel.judul.equals("Anak Gembala")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.gembala);
        } else if (hotel.judul.equals("Balonku")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.balonku);
        } else if (hotel.judul.equals("Becak")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.becak);
        } else if (hotel.judul.equals("Kupu-kupu")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.kupu);
        }

        play = (ImageButton) findViewById(R.id.imageButton_play);
        pause = (ImageButton) findViewById(R.id.imageButton_pause);
        stop = (ImageButton) findViewById(R.id.imageButton_stop);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
                mediaPlayer.getCurrentPosition();
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.reset();
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null)
            mediaPlayer.release();
        Log.d(TAG, "onDestroy: ");
    }
}
