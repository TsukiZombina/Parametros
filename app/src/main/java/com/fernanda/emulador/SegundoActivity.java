package com.fernanda.emulador;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

/**
 * Created by monsh on 08/09/2015.
 */
public class SegundoActivity extends AppCompatActivity {

    EditText edt_name;
    EditText edt_mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_segundo);

         edt_name = (EditText) findViewById(R.id.edt_nombre);
         edt_mail = (EditText) findViewById(R.id.edt_correo);

        //Aqui voy a cachar los extra con el bundle zip
        Intent i = getIntent();
        Bundle bundle = i.getExtras();

        if (bundle != null) {
            String name = (String) bundle.get("Nombre");
            edt_name.setText(name);

            String mail = (String) bundle.get("Correo");
            edt_mail.setText(mail);
        }

        }
}
