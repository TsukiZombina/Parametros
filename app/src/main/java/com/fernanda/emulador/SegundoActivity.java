package com.fernanda.emulador;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by monsh on 08/09/2015.
 */
public class SegundoActivity extends AppCompatActivity {

    TextView tv_name;
    TextView tv_mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_segundo);
        //Corregi los id's por que enlazaba los de la primera actividad y usaba EditText en lugar de TextViews
        tv_name = (TextView)findViewById(R.id.tv_name);
        tv_mail =  (TextView)findViewById(R.id.tv_mail);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle !=null){

            String name = (String) bundle.get("Nombre");
            tv_name.setText(name);

            String correo = (String) bundle.get("Correo");
            tv_mail.setText(correo);
        }

} }
