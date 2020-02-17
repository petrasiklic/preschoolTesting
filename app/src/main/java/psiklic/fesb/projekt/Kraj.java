package psiklic.fesb.projekt;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Kraj extends AppCompatActivity {
    Button buttonmail;
    Button kraj;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kraj);

        buttonmail = (Button) findViewById( R.id.buttonmail );
        kraj = (Button) findViewById( R.id.kraj );


        buttonmail.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( Intent.ACTION_SENDTO );
                intent.setData( Uri.parse( "mailto:" ) );
                startActivity( Intent.createChooser( intent, "chose one application" ) );
            }

        } );
        kraj.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveTaskToBack( true );
                android.os.Process.killProcess(android.os.Process.myPid() );
                System.exit(1);
            }
        } );
    }
}


