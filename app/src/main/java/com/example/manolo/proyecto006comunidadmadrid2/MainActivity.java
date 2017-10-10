package com.example.manolo.proyecto006comunidadmadrid2;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Ciudad ciudad;
    TextView tv1, tv2;
    ImageView iv;
    ListView lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ciudad = new Ciudad();

        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        iv = (ImageView)findViewById(R.id.iv);
        lista = (ListView) findViewById(R.id.miLista);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, ciudad.getCiudad());
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                tv1.setText("Población de "+ lista.getItemAtPosition(i) + " : "+ ciudad.getPoblacion()[i]);
                tv2.setText("Gentilicio: " + ciudad.getGentilicio()[i]);
                iv.setImageResource(ciudad.getEscudos()[i]);
            }
        });
    }
}
