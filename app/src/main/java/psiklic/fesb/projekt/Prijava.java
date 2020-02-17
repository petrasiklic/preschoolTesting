package psiklic.fesb.projekt;


import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Prijava extends AppCompatActivity {
    EditText edtName, edtLastName, edtEmail, edtAddress, edtParentName, edtContact;
    EditText edtWeight, edtHeight;
    Button btnAddInfo, btnDalje, btnP;

    CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8;

    String checkBoxList = "";
    private int id = 1;

    DataBaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_prijava );

        db = new DataBaseHelper(this);

        edtName = (EditText) findViewById(R.id.edtName);
        edtLastName = (EditText) findViewById(R.id.edtLastName);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtAddress = (EditText) findViewById(R.id.edtAddress);
        edtParentName = (EditText) findViewById(R.id.edtParentName);
        edtContact = (EditText) findViewById(R.id.edtContact);


        edtWeight = (EditText) findViewById(R.id.edtWeight);
        edtHeight = (EditText) findViewById(R.id.edtHeight);
        btnAddInfo = (Button) findViewById(R.id.btnAddInfo);
        btnDalje = (Button) findViewById(R.id.btnDalje);
        btnP = (Button) findViewById(R.id.btnP);

        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        checkBox6 = (CheckBox) findViewById(R.id.checkBox6);
        checkBox7 = (CheckBox) findViewById(R.id.checkBox7);
        checkBox8 = (CheckBox) findViewById(R.id.checkBox8);

        btnAddInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox1.isChecked())
                    checkBoxList = (String) checkBox1.getText();
                if(checkBox2.isChecked())
                    checkBoxList = checkBoxList + " " + (String) checkBox2.getText();
                if(checkBox3.isChecked())
                    checkBoxList = checkBoxList + " " + (String) checkBox3.getText();
                if(checkBox4.isChecked())
                    checkBoxList = checkBoxList + " " + (String) checkBox4.getText();
                if(checkBox5.isChecked())
                    checkBoxList = checkBoxList + " " + (String) checkBox5.getText();
                if(checkBox6.isChecked())
                    checkBoxList = checkBoxList + " " + (String) checkBox6.getText();
                if(checkBox7.isChecked())
                    checkBoxList = checkBoxList + " " + (String) checkBox7.getText();
                if(checkBox8.isChecked())
                    checkBoxList = checkBoxList + " " + (String) checkBox8.getText();

                if (TextUtils.isEmpty(edtHeight.getText().toString())){
                    Toast.makeText(Prijava.this, "Empty field not allowed!", Toast.LENGTH_SHORT).show();
                } else if(Integer.parseInt(edtHeight.getText().toString()) == 0){
                    Toast.makeText(Prijava.this, "Height cannot be 0!", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(edtWeight.getText().toString())){
                    Toast.makeText(Prijava.this, "Empty field not allowed!", Toast.LENGTH_SHORT).show();
                } else if(Integer.parseInt(edtWeight.getText().toString()) == 0){
                    Toast.makeText(Prijava.this, "Weight cannot be 0!", Toast.LENGTH_SHORT).show();
                } else {

                    Person person = new Person( id, edtName.getText().toString(), edtLastName.getText().toString(), edtEmail.getText().toString(), edtAddress.getText().toString(), edtParentName.getText().toString(), edtContact.getText().toString(), Integer.parseInt( edtWeight.getText().toString() ), Integer.parseInt( edtHeight.getText().toString() ), checkBoxList );
                    db.addPerson( person );
                    id++;
                    Toast.makeText( Prijava.this, "Saved!", Toast.LENGTH_SHORT ).show();
                }
            }
        });

        btnP.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAll();
            }
        } );

    }
    public void Dalje (View view) {

        Intent intent = new Intent( Prijava.this, Pocetak_testa.class );
        startActivity( intent );
    }


    public void viewAll() {
                Cursor res = db.getAllData();
                if (res.getCount() == 0) {
                    showMessage("Error", "Nothing found");
                    return;
                }

                StringBuffer buffer = new StringBuffer();
                while (res.moveToNext()) {
                    buffer.append("ID :" + res.getString(0) + "\n");
                    buffer.append("IME :" + res.getString(1) + "\n");
                    buffer.append("PREZIME :" + res.getString(2) + "\n");
                    buffer.append("DATUM RODJENJA :" + res.getString(3) + "\n");
                    buffer.append("ADRESA:" + res.getString(4) + "\n");
                    buffer.append("KONTAKT :" + res.getString(5) + "\n");
                    buffer.append("IME RODITELJA :" + res.getString(6) + "\n");
                    buffer.append("MASA :" + res.getString(7) + "\n");
                    buffer.append("VISINA :" + res.getString(8) + "\n");
                    buffer.append("CHECKBOX :" + res.getString(9) + "\n\n");
                }
                showMessage("Data", buffer.toString());
            }


    public void showMessage(String title, String message) {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }

}
