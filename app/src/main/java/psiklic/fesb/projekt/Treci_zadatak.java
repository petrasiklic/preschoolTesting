package psiklic.fesb.projekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Treci_zadatak extends AppCompatActivity {

    TextView txtCrvena, txtZuta, txtPlava, txtZelena;
    TextView broj1, broj2, broj3, broj4;
    EditText edt1, edt2, edt3, edt4;
    Button btnProvjeri, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_treci_zadatak );


        txtCrvena = (TextView) findViewById( R.id.txtCrvena );
        txtPlava = (TextView) findViewById( R.id.txtPlava );
        txtZelena = (TextView) findViewById( R.id.txtZelena );
        txtZuta = (TextView) findViewById( R.id.txtZuta );

        broj1 = (TextView) findViewById( R.id.broj1 );
        broj2 = (TextView) findViewById( R.id.broj2 );
        broj3 = (TextView) findViewById( R.id.broj3 );
        broj4 = (TextView) findViewById( R.id.broj4 );


        edt1 = (EditText) findViewById( R.id.edt1 );
        edt2 = (EditText) findViewById( R.id.edt2 );
        edt3 = (EditText) findViewById( R.id.edt3 );
        edt4 = (EditText) findViewById( R.id.edt4 );


        btnProvjeri = (Button) findViewById( R.id.btnProvjeri );
        btnNext = (Button) findViewById( R.id.btnNext );

        btnProvjeri.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty( edt1.getText().toString() )) {
                    Toast.makeText( Treci_zadatak.this, "Empty field not allowed!", Toast.LENGTH_SHORT ).show();
                } else if (Integer.parseInt( edt1.getText().toString() ) == 2) {
                    txtCrvena.setBackgroundColor( Color.GREEN );
                } else {
                    txtCrvena.setBackgroundColor( Color.RED );
                }

                if (TextUtils.isEmpty( edt2.getText().toString() )) {
                    Toast.makeText( Treci_zadatak.this, "Empty field not allowed!", Toast.LENGTH_SHORT ).show();
                } else if (Integer.parseInt( edt2.getText().toString() ) == 1) {
                    txtZuta.setBackgroundColor( Color.GREEN );

                } else {
                    txtZuta.setBackgroundColor( Color.RED );

                }

                if (TextUtils.isEmpty( edt3.getText().toString() )) {
                    Toast.makeText( Treci_zadatak.this, "Empty field not allowed!", Toast.LENGTH_SHORT ).show();
                } else if (Integer.parseInt( edt3.getText().toString() ) == 4) {
                    txtZelena.setBackgroundColor( Color.GREEN );

                } else {
                    txtZelena.setBackgroundColor( Color.RED );

                }

                if (TextUtils.isEmpty( edt4.getText().toString() )) {
                    Toast.makeText( Treci_zadatak.this, "Empty field not allowed!", Toast.LENGTH_SHORT ).show();
                } else if (Integer.parseInt( edt4.getText().toString() ) == 3) {
                    txtPlava.setBackgroundColor( Color.GREEN );

                } else {
                    txtPlava.setBackgroundColor( Color.RED );

                }


            }
        } );

    }

    public void Dalje3 (View view) {
        Intent intent = new Intent( Treci_zadatak.this, Cetvrti_zadatak.class );
        startActivity( intent );
    }
}