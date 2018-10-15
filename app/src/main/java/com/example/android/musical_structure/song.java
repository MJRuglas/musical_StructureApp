package com.example.android.musical_structure;

public class song {


    /**
     * Song title
     */
    private String SongTitle;

    /**
     * Artist's name
     */
    private String ArtistName;


    /**
     * Image resource ID for the word
     */
    private int ImageResourceId;


    /**
     * Create a separate new Word object with an Image Resource.
     *
     * @param songTitle is the title of the song
     * @param artistName   is the name of the artist
     * @param imageResourceId    is the drawable resource ID for the image associated with the word
     */


    public song(String songTitle, String artistName, int imageResourceId) {
        SongTitle = songTitle;
        ArtistName = artistName;
        ImageResourceId = imageResourceId;
    }


    /**
     * Get the title of the song.
     */
    public String getSongTitle() {
        return SongTitle;
    }

    /**
     * Get the name of the artist.
     */
    public String getArtistName() {
        return ArtistName;
    }


    /**
     * Get the image resource ID of the word.
     */
    public int getImageResourceId() {
        return ImageResourceId;
    }


}
