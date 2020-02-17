package psiklic.fesb.projekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Drugi_zadatak extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn7;
    Button btnProvjeri;
    TextView txtBrojevi, txtIspravno;

    String text = "";
    String text2 = "";

    int[] buffer = new int[6];
    int[] ispravanNiz = new int[]{1, 2, 3, 4, 5, 7};
    private int i = 0;
    private int brojac = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_drugi_zadatak );

        txtBrojevi = (TextView) findViewById( R.id.txtBrojevi );
        txtIspravno = (TextView) findViewById( R.id.txtIspravno );

        btn1 = (Button) findViewById( R.id.btn1 );
        btn2 = (Button) findViewById( R.id.btn2 );
        btn3 = (Button) findViewById( R.id.btn3 );
        btn4 = (Button) findViewById( R.id.btn4 );
        btn5 = (Button) findViewById( R.id.btn5 );
        btn7 = (Button) findViewById( R.id.btn7 );

        btnProvjeri = (Button) findViewById( R.id.btnProvjeri );



        btn1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buffer[i] = 1;
                i++;
                text = text + "1 ";
                txtBrojevi.setText( text );
            }
        } );

        btn2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buffer[i] = 2;
                i++;
                text = text + "2 ";
                txtBrojevi.setText( text );
            }
        } );

        btn3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buffer[i] = 3;
                i++;
                text = text + "3 ";
                txtBrojevi.setText( text );
            }
        } );

        btn4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buffer[i] = 4;
                i++;
                text = text + "4 ";
                txtBrojevi.setText( text );
            }
        } );

        btn5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buffer[i] = 5;
                i++;
                text = text + "5 ";
                txtBrojevi.setText( text );
            }
        } );

        btn7.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buffer[i] = 7;
                i++;
                text = text + "7 ";
                txtBrojevi.setText( text );
            }
        } );

        btnProvjeri.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 6; i++) {
                    if (buffer[i] != ispravanNiz[i]) {
                        if (Integer.parseInt( btn1.getText().toString() ) == buffer[i]) {
                            txtBrojevi.setBackgroundColor( Color.RED );
                            text2 = "Ispravno: 1 2 3 4 5 7";
                        } else if (Integer.parseInt( btn2.getText().toString() ) == buffer[i]) {
                            txtBrojevi.setBackgroundColor( Color.RED );
                            text2 = "Ispravno: 1 2 3 4 5 7";
                        } else if (Integer.parseInt( btn3.getText().toString() ) == buffer[i]) {
                            txtBrojevi.setBackgroundColor( Color.RED );
                            text2 = "Ispravno: 1 2 3 4 5 7";
                        } else if (Integer.parseInt( btn4.getText().toString() ) == buffer[i]) {
                            txtBrojevi.setBackgroundColor( Color.RED );
                            text2 = "Ispravno: 1 2 3 4 5 7";
                        } else if (Integer.parseInt( btn5.getText().toString() ) == buffer[i]) {
                            txtBrojevi.setBackgroundColor( Color.RED );
                            text2 = "Ispravno: 1 2 3 4 5 7";
                        } else if (Integer.parseInt( btn7.getText().toString() ) == buffer[i]) {
                            txtBrojevi.setBackgroundColor( Color.RED );
                            text2 = "Ispravno: 1 2 3 4 5 7";
                        }
                    } else
                        brojac++;
                }
                if (brojac == 6) {
                    text2 = "SVE JE ISPRAVNO";
                    txtBrojevi.setBackgroundColor( Color.GREEN );
                }
                txtIspravno.setText( text2 );
            }
        } );

    }


    public void Dalje2(View view) {
        Intent intent = new Intent( Drugi_zadatak.this, Treci_zadatak.class );
        startActivity( intent );
    }
}


