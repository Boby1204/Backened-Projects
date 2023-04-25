package listenify;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {

    public String albumName;
     public String artistName;
     public List<Song> songList; //stores list of songs
    public Album(String albumName, String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.songList = new ArrayList<>();
    }
   public boolean findSongInAlbum(String title){
        // Iterate over  the arrayList and
        // Match each song title with title
        for(Song song: songList){
            if(song.title.compareTo(title) == 0){
                return true;
            }
        }
        return false;
    }
   public String addSongToAlbum(String title,double duration){
         // check if song is already there, we will not add
       // Otherwise we will create a new song and add to album

       if(findSongInAlbum(title) == true){
           return "Song is already present";
       }
       else{
           // create a song object then add it to list
           Song newSong = new Song(title,duration);
           songList.add(newSong);
           return "New song has been added";
       }
   }
   public String addSongToPlayList(int trackNo, LinkedList<Song> playList){

        // trackno is a no in the songList
       //trackno: 1,2,3,4,5...
       //indices: 0,1,2,3,4,...

       int index = trackNo - 1;

       // Checking for validity of index
       if(index >=0 && index < this.songList.size()){
           // song is already present
           // find it's index
           Song song = this.songList.get(index);
            return "Song added to the playlist";
       }
       return "Invalid track no";
   }
   public String addSongToPlayList(String title, LinkedList<Song> playlist){
        // Find out the song with title
       // and put in playlist
       // Iterate again over song list
      for(Song song: songList){
          if(song.title == title){
              playlist.add(song);
              return "Song added successfully";
          }
      }
          return "Song does not exist";
   }
}
