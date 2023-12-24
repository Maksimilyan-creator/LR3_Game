package com.example.lr3_lamaev;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ImageView;
import java.util.List;

public class GameAdapter extends ArrayAdapter<Game>
{
    private LayoutInflater inflater; // контекст, в котором используется класс
    private int layout; // ресурс разметки интерфейса, который будет использоваться для создания одного эдемента в ListView
    private List<Game> games; // набор объектов, которые будут выводиться в ListView

    public GameAdapter(Context context, int resource, List<Game> games)
    {
        super(context, resource, games);
        this.games = games;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    // Устанавливается отображение элементов списка.

    public View getView(int position, View convertView, ViewGroup parent)
    {
        // создаем объект View для каждого отдельного элемента в списке
        View view = inflater.inflate(this.layout,parent,false);

        // получаем элементы ImageView и TextView пр id
        ImageView posterView = view.findViewById(R.id.poster);
        TextView nameView = view.findViewById(R.id.name);
        TextView publisherView = view.findViewById(R.id.publicher);

        Game game = games.get(position);

        posterView.setImageResource(game.getPosterResource());
        nameView.setText(game.getName());
        publisherView.setText(game.getPublisher());
        // возвращаем элемент View для отображения Game
        return view;

    }

}
