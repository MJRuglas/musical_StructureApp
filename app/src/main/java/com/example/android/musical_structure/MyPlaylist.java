package com.example.android.musical_structure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyPlaylist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        // Create a list of songs
        ArrayList<song> playSongs = new ArrayList<song>();

        //songs.add("one");
        playSongs.add(new song("Song of Crimson", "SGI", R.drawable.asset_one));
        playSongs.add(new song("New History", "SGI", R.drawable.asset_one));
        playSongs.add(new song("Forever Sensei", "SGI", R.drawable.asset_one));
        playSongs.add(new song("Colors", "Jason DeRulo", R.drawable.asset_one));
        playSongs.add(new song("Freedom", "Beyonce", R.drawable.asset_one));
        playSongs.add(new song("Lions of Justice Vow", "SGI Youth", R.drawable.asset_one));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        songsAdapter adapter = new songsAdapter(this, playSongs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        


    }




}