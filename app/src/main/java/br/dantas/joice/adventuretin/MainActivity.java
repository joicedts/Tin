package br.dantas.joice.adventuretin;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import br.dantas.joice.adventuretin.util.menu_worlds;

import static br.dantas.joice.adventuretin.R.id.clique;

public class MainActivity extends AppCompatActivity
{
    ImageButton clique;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton jogar = (ImageButton) findViewById(R.id.clique);
            jogar.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), menuPrincipal.class);
                    startActivity(i);
                }

            });
    }

}