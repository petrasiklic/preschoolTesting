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

public class Cetvrti_zadatak extends AppCompatActivity {

    TextView broj1, broj2, broj3, broj4;
    TextView txtKvadrat, txtPravokutnik, txtTrokut, txtKrug;
    EditText edt1, edt2, edt3, edt4;
    Button btnProvjeri, btnDalje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_cetvrti_zadatak );

        broj1=(TextView)findViewById( R.id.broj1 );
        broj2=(TextView)findViewById( R.id.broj2 );
        broj3=(TextView)findViewById( R.id.broj3 );
        broj4=(TextView)findViewById( R.id.broj4);

        txtKvadrat =(TextView)findViewById( R.id.txtkvadrat);
        txtPravokutnik =(TextView)findViewById( R.id.txtPravokutnik );
        txtTrokut =(TextView)findViewById( R.id.txtTrokut);
        txtKrug =(TextView)findViewById( R.id.txtKrug );

        edt1 = (EditText) findViewById( R.id.edt1 );
        edt2 = (EditText) findViewById( R.id.edt2 );
        edt3 = (EditText) findViewById( R.id.edt3 );
        edt4 = (EditText) findViewById( R.id.edt4 );

        btnProvjeri = (Button) findViewById( R.id.btnProvjeri );
        btnDalje= (Button) findViewById( R.id.btnDalje );

        btnProvjeri.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty( edt1.getText().toString() )) {
                    Toast.makeText( Cetvrti_zadatak.this, "Empty field not allowed!", Toast.LENGTH_SHORT ).show();
                } else if (Integer.parseInt( edt1.getText().toString() ) == 3) {
                    txtKvadrat.setBackgroundColor( Color.GREEN );
                } else {
                    txtKvadrat.setBackgroundColor( Color.RED );
                }

                if (TextUtils.isEmpty( edt2.getText().toString() )) {
                    Toast.makeText( Cetvrti_zadatak.this, "Empty field not allowed!", Toast.LENGTH_SHORT ).show();
                } else if (Integer.parseInt( edt2.getText().toString() ) == 4) {
                    txtPravokutnik.setBackgroundColor( Color.GREEN );

                } else {
                    txtPravokutnik.setBackgroundColor( Color.RED );

                }

                if (TextUtils.isEmpty( edt3.getText().toString() )) {
                    Toast.makeText( Cetvrti_zadatak.this, "Empty field not allowed!", Toast.LENGTH_SHORT ).show();
                } else if (Integer.parseInt( edt3.getText().toString() ) == 1) {
                    txtTrokut.setBackgroundColor( Color.GREEN );

                } else {
                    txtTrokut.setBackgroundColor( Color.RED );

                }

                if (TextUtils.isEmpty( edt4.getText().toString() )) {
                    Toast.makeText( Cetvrti_zadatak.this, "Empty field not allowed!", Toast.LENGTH_SHORT ).show();
                } else if (Integer.parseInt( edt4.getText().toString() ) == 2) {
                    txtKrug.setBackgroundColor( Color.GREEN );

                } else {
                    txtKrug.setBackgroundColor( Color.RED );

                }


            }
        } );

    }

    public void Dalje4 (View view) {
        Intent intent = new Intent( Cetvrti_zadatak.this, Peti_zadatak.class);
        startActivity( intent );

    }
}
