package com.example.t2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.t2.Adaptador.AdaptadorContacto;
import com.example.t2.Entidades.Contacto;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("EX_VJ2022", "onCreate");
        setContentView(R.layout.activity_main);

        List<Contacto> contacts = getContact();
        AdaptadorContacto adapter = new AdaptadorContacto(contacts);

        RecyclerView rv = findViewById(R.id.rvContactos);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);
    }

    private List<Contacto> getContact() {
        List<Contacto> Contacto = new ArrayList<>();
        Contacto.add(new Contacto(1, "Fabian Salazar", "929404506"));
        Contacto.add(new Contacto(2, "Daniel Diaz", "945875655"));
        Contacto.add(new Contacto(3, "Pancho Chavez", "947777548"));
        Contacto.add(new Contacto(3, "Maria Becerra", "956333222"));
        Contacto.add(new Contacto(3, "Rafael Benito", "958888653"));
        Contacto.add(new Contacto(3, "Cindy Carmela", "978888555"));
        Contacto.add(new Contacto(3, "Paolo Guerrero", "945856522"));
        Contacto.add(new Contacto(3, "Marta Habla", "963258741"));
        Contacto.add(new Contacto(3, "Bella Thorme", "985412367"));
        Contacto.add(new Contacto(3, "Carlo Gutierrez", "9765584422"));

        return Contacto;
    }
}