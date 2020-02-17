package psiklic.fesb.projekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Prvi_zadatak extends AppCompatActivity {
    EditText edt_lj, edt_d, edt_b, edt_a, edt_m;
    Button btnLJ, btnD, btnB, btnA, btnM;
    Button btn_lj, btn_d, btn_b, btn_a, btn_m;
    Button btnNext, btnProvjeri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_prvi_zadatak );

        edt_lj = (EditText) findViewById(R.id.edt_lj);
        edt_d = (EditText) findViewById(R.id.edt_d);
        edt_b = (EditText) findViewById(R.id.edt_b);
        edt_a = (EditText) findViewById(R.id.edt_a);
        edt_m = (EditText) findViewById(R.id.edt_m);
        btnLJ = (Button) findViewById(R.id.btnLJ);
        btnD = (Button) findViewById(R.id.btnD);
        btnB = (Button) findViewById(R.id.btnB);
        btnA = (Button) findViewById(R.id.btnA);
        btnM = (Button) findViewById(R.id.btnM);
        btn_lj = (Button) findViewById(R.id.btn_lj);
        btn_d = (Button) findViewById(R.id.btn_d);
        btn_b = (Button) findViewById(R.id.btn_b);
        btn_a = (Button) findViewById(R.id.btn_a);
        btn_m = (Button) findViewById(R.id.btn_m);
        btnNext = (Button) findViewById(R.id.btnNext);
        btnProvjeri = (Button) findViewById(R.id.btnProvjeri);


        btnProvjeri.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(edt_a.getText().toString())){
                    Toast.makeText( Prvi_zadatak.this, "Empty field not allowed!", Toast.LENGTH_SHORT).show();
                } else if(Integer.parseInt(edt_a.getText().toString()) == 1){
                    btn_a.setBackgroundColor(Color.GREEN );
                    btnA.setBackgroundColor(Color.GREEN);
                } else {
                    btn_a.setBackgroundColor(Color.RED);
                    btnA.setBackgroundColor(Color.RED);
                }

                if (TextUtils.isEmpty(edt_b.getText().toString())){
                    Toast.makeText( Prvi_zadatak.this, "Empty field not allowed!", Toast.LENGTH_SHORT).show();
                } else if(Integer.parseInt(edt_b.getText().toString()) == 2){
                    btn_b.setBackgroundColor(Color.GREEN);
                    btnB.setBackgroundColor(Color.GREEN);
                }else {
                    btn_b.setBackgroundColor(Color.RED);
                    btnB.setBackgroundColor(Color.RED);
                }

                if (TextUtils.isEmpty(edt_m.getText().toString())){
                    Toast.makeText( Prvi_zadatak.this, "Empty field not allowed!", Toast.LENGTH_SHORT).show();
                } else if(Integer.parseInt(edt_m.getText().toString()) == 3){
                    btn_m.setBackgroundColor(Color.GREEN);
                    btnM.setBackgroundColor(Color.GREEN);
                }else {
                    btn_m.setBackgroundColor(Color.RED);
                    btnM.setBackgroundColor(Color.RED);
                }

                if (TextUtils.isEmpty(edt_lj.getText().toString())){
                    Toast.makeText( Prvi_zadatak.this, "Empty field not allowed!", Toast.LENGTH_SHORT).show();
                } else if(Integer.parseInt(edt_lj.getText().toString()) == 4){
                    btn_lj.setBackgroundColor(Color.GREEN);
                    btnLJ.setBackgroundColor(Color.GREEN);
                }else {
                    btn_lj.setBackgroundColor(Color.RED);
                    btnLJ.setBackgroundColor(Color.RED);
                }

                if (TextUtils.isEmpty(edt_d.getText().toString())){
                    Toast.makeText( Prvi_zadatak.this, "Empty field not allowed!", Toast.LENGTH_SHORT).show();
                } else if(Integer.parseInt(edt_d.getText().toString()) == 5){
                    btn_d.setBackgroundColor(Color.GREEN);
                    btnD.setBackgroundColor(Color.GREEN);
                }else {
                    btn_d.setBackgroundColor(Color.RED);
                    btnD.setBackgroundColor(Color.RED);
                }
            }
        });
    }
    public void btndalje1 (View view){
        Intent intent = new Intent( Prvi_zadatak.this, Drugi_zadatak.class );
        startActivity( intent );

    }
}
