package com.example.android.musical_structure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class k_pop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        // Create a list of songs
        ArrayList<song> playSongs = new ArrayList<song>();

        //songs.add("one");
        playSongs.add(new song("Just one Day", "BTS", R.drawable.asset_one));
        playSongs.add(new song("Fake Love", "BTS", R.drawable.asset_one));
        playSongs.add(new song("No More Dream", "BTS", R.drawable.asset_one));
        playSongs.add(new song("I Promise", "2PM", R.drawable.asset_one));
        playSongs.add(new song("Take Off", "2PM", R.drawable.asset_one));

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
