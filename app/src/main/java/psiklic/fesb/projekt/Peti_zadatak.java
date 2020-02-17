package psiklic.fesb.projekt;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Peti_zadatak extends AppCompatActivity {
    Button bt, btnProvjera;
    CheckBox chcb1, chcb2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peti_zadatak);

        bt = (Button)findViewById(R.id.button8);

        MediaPlayer mp = MediaPlayer.create(this,R.raw.wrong);
        mp = MediaPlayer.create(this, R.raw.wrong);
        final MediaPlayer finalMp = mp;
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finalMp.start();
            }
        });

        bt = (Button) findViewById(R.id.button10);
        mp = MediaPlayer.create(this, R.raw.correct);
        final MediaPlayer finalMp1 = mp;
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalMp1.start();
            }
        });


        chcb1=(CheckBox) findViewById( R.id.chcb1 );
        chcb2=(CheckBox)findViewById( R.id.chcb2 );
        btnProvjera =(Button)findViewById( R.id.btnProvjera );

        btnProvjera.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (chcb1.isChecked()&& chcb2.isChecked())
                    Toast.makeText( Peti_zadatak.this, "Odaberite samo jedan odgovor!", Toast.LENGTH_SHORT ).show();

                else if(chcb1.isChecked())
                    Toast.makeText( Peti_zadatak.this, "Točan odgovor!", Toast.LENGTH_SHORT ).show();
                else if(chcb2.isChecked())
                    Toast.makeText( Peti_zadatak.this, "Netočan odgovor!", Toast.LENGTH_SHORT ).show();

            }
        } );


    }
    public void button_5 (View view) {

        Intent intent = new Intent( Peti_zadatak.this, Kraj.class);
        startActivity(intent);
    }
}
