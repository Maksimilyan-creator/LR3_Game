package com.example.lr3_lamaev;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    ArrayList<Game> games = new ArrayList<Game>();
    ListView counriesList;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // начальная инцилизация списка
        setInitialData();
        // получаем элемент ListView
        counriesList = findViewById(R.id.gameList);

        // создаем адаптер
        GameAdapter gameAdapter = new GameAdapter(this, R.layout.list_item, games);
        // устанавливаем адаптер
        counriesList.setAdapter(gameAdapter);
        // слушатель выбора в списке
        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                // получаем выбранный пункт
                Game selectedGame = (Game)parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Был выбран пункт " + selectedGame.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        };
        counriesList.setOnItemClickListener(itemListener);
    }
    private void setInitialData()
    {
        games.add(new Game ("The legend of zelda:BOTW", "Nintendo", R.drawable.botw));
        games.add(new Game("Elden Ring", "FromSoftware", R.drawable.elden_ring));
        games.add(new Game("Skyrim", "Bethesda Softworks", R.drawable.skyrim));
    }

}
