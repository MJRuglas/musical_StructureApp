package com.example.android.musical_structure;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

    public class songsAdapter extends ArrayAdapter<song> {

        /**
         * Create a new {@link com.example.android.musical_structure.songsAdapter} object.
         *
         * @param context is the current context (i.e. Activity) that the adapter is being created in.
         * @param songs is the list of {@link song}s to be displayed.
         */
        public songsAdapter(Context context, ArrayList<song> songs) {
            super(context, 0, songs);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Check if an existing view is being reused, otherwise inflate the view
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.activity_my_playlist, parent, false);
            }


            // Get the {@link Word} object located at this position in the list
            song currentSong = getItem(position);

            // Find the TextView in the list_item.xml layout with the ID song_text_view.
            TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
            // Get the song title for the current song
            songTextView.setText(currentSong.getSongTitle());

            // Find the TextView in the list_item.xml layout with the ID artist_text_view.
            TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
            // Get the name of the artist for the current song
            artistTextView.setText(currentSong.getArtistName());

            // Find the ImageView in the list_item.xml layout with the ID image.
            ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
            // Set the ImageView to the image resource specified in the current Song
            imageView.setImageResource(currentSong.getImageResourceId());

            // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
            // the ListView.
            return listItemView;
        }
    }

