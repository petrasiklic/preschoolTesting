package psiklic.fesb.projekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pocetak_testa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_pocetak_testa );
    }
        public void start (View view) {

            Intent intent = new Intent( Pocetak_testa.this, Prvi_zadatak.class );
            startActivity( intent );
        }

}
